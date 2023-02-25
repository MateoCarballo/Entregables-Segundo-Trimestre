package EjercicioAlumnos;

import java.util.ArrayList;

public class BB_Centro {

    private String tipo;
    private String Naturaleza;
    private String codigo;
    private String direccion;
    private String cp;

    public static ArrayList <CC_Alumno> alumnosCentro= new ArrayList<CC_Alumno>();
    public static ArrayList<BB_Materia> materiasCentro = new ArrayList<BB_Materia>();
    public static ArrayList<CC_Profesor> profesoresCentro = new ArrayList<CC_Profesor>();

    public BB_Centro(String tipo, String naturaleza, String codigo, String direccion, String cp) {
        this.tipo = tipo;
        Naturaleza = naturaleza;
        this.codigo = codigo;
        this.direccion = direccion;
        this.cp = cp;
    }

    public static void verAlumnos(ArrayList <CC_Alumno> alumnosCentro){

    }
    public static void verMaterias(ArrayList<BB_Materia> materiasCentro){

    }
    public static void verProfesores(ArrayList<CC_Profesor> profesoresCentro){

    }
}
