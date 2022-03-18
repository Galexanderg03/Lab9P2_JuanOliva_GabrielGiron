package lab9p2_juanoliva_gabrielgiron;

import java.util.ArrayList;
import java.sql.ResultSet;

public class CargaDescarga {
    private ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    private ArrayList<Clase> listaClase = new ArrayList<>();
    private ArrayList alumnoXclase = new ArrayList();
    private ArrayList<Maestro> listaMaestro = new ArrayList<>();
    private ArrayList preguntas = new ArrayList();
    private ArrayList resultados = new ArrayList();
    private Dba db = new Dba();

    public CargaDescarga() {
    }

    public ArrayList<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public ArrayList<Clase> getListaClase() {
        return listaClase;
    }

    public void setListaClase(ArrayList<Clase> listaClase) {
        this.listaClase = listaClase;
    }

    public ArrayList getAlumnoXclase() {
        return alumnoXclase;
    }

    public void setAlumnoXclase(ArrayList alumnoXclase) {
        this.alumnoXclase = alumnoXclase;
    }

    public ArrayList<Maestro> getListaMaestro() {
        return listaMaestro;
    }

    public void setListaMaestro(ArrayList<Maestro> listaMaestro) {
        this.listaMaestro = listaMaestro;
    }

    public ArrayList getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList getResultados() {
        return resultados;
    }

    public void setResultados(ArrayList resultados) {
        this.resultados = resultados;
    }
    
    //MA
    
    public void cargarAlumnos(){
        db.conectar();
        try {
            db.query.execute("select * from Alumnos");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
             Alumno nuevo = new Alumno(rs.getString("nombreAlumno"), rs.getString("numeroCuenta"), rs.getString("carrera"));
             listaAlumnos.add(nuevo);
            }            
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void cargarClases(){
        db.conectar();
        try {
            db.query.execute("select * from Clase");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
             Clase nueva = new Clase(rs.getString("nombreClase"),
                     rs.getInt("codigoClase"), rs.getInt("codiMaestro"),
                     rs.getInt("codExamen1"), rs.getInt("codExamen2"));
             listaClase.add(nueva);
            }            
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void cargarMaestros(){
        db.conectar();
        try {
            db.query.execute("select * from Maestro");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
                Maestro nuevo = new Maestro(rs.getString("nombreMestro"), rs.getInt("codigoRRHH"));
                listaMaestro.add(nuevo);
            }            
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void cargarResultados(){
        db.conectar();
        try {
            db.query.execute("select * from Resultados");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
                Object[] registro = {rs.getString("numeroCuenta"),rs.getInt("codigoExament"),rs.getInt("resultado")};
                resultados.add(registro);
            }            
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        db.desconectar();
    }
    
    public void cargarPreguntas(){
        db.conectar();
        try {
            db.query.execute("select * from Clase");
            ResultSet rs = db.query.getResultSet();           
            while (rs.next()) {
                Pregunta p = new Pregunta(rs.getString("pregunta"), 
                        rs.getBoolean("pauta"), rs.getInt("codigoClase"));
                preguntas.add(p);
            }            
        } catch (Exception ex) {
         ex.printStackTrace();
        }
        db.desconectar();
    }
    
}
