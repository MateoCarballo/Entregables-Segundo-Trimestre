package EjercicioAlumnos;

import java.util.ArrayList;

public class Centro {

    private String tipo;
    private String Naturaleza;
    private String codigo;
    private String direccion;
    private String cp;


    public static ArrayList<Materia> materiasCentro = new ArrayList<Materia>();


    public Centro(String tipo, String naturaleza, String codigo, String direccion, String cp) {
        this.tipo = tipo;
        Naturaleza = naturaleza;
        this.codigo = codigo;
        this.direccion = direccion;
        this.cp = cp;
    }

    public static void verAlumnos(ArrayList <Alumno> alumnosCentro){

    }
    public static void verMaterias(ArrayList<Materia> materiasCentro){

    }

    public static void añadirNotaAlumno(){

    }

    @Override
    public String toString() {
        return "BB_Centro{" +
                "tipo='" + tipo + '\'' +
                ", Naturaleza='" + Naturaleza + '\'' +
                ", codigo='" + codigo + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
