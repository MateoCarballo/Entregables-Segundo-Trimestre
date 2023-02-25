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

    public static void añadirNotaAlumno(){

    }
    public static void buscarAlumno(int id,BB_Materia [] misMaterias){

        for (int i = 0; i < alumnosCentro.size(); i++) {
            if(alumnosCentro.get(i).getId()==id){
                for (int j = 0; j < alumnosCentro.get(i).cursando.size(); j++) {
                    BB_Materia [] misMaterias= new BB_Materia[j];
                    misMaterias[j]=alumnosCentro.get(i).cursando.get(j);
                }
            }
        }
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
