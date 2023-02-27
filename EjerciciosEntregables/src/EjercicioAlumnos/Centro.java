package EjercicioAlumnos;

import Utilidades.Enumeracion;

import java.util.ArrayList;

import static EjercicioAlumnos.MainAlumnos.numAleatorioEntero;

public class Centro {

    private String tipo;
    private String Naturaleza;
    private String codigo;
    private String direccion;
    private String cp;


    private ArrayList<Materia> materiasCentro = new ArrayList<Materia>();

    private ArrayList<Alumno> alumnosCentro = new ArrayList<Alumno>();

    public ArrayList<Materia> getMateriasCentro() {
        return materiasCentro;
    }

    public ArrayList<Alumno> getAlumnosCentro() {
        return alumnosCentro;
    }

    public Centro(String tipo, String naturaleza, String codigo, String direccion, String cp, ArrayList<Materia> materiasCentro, ArrayList<Alumno> alumnosCentro) {
        this.tipo = tipo;
        Naturaleza = naturaleza;
        this.codigo = codigo;
        this.direccion = direccion;
        this.cp = cp;
        this.materiasCentro = materiasCentro;
        this.alumnosCentro = alumnosCentro;
    }
//COMPOSICION PORQUE UN CENTRO DEBE TENER ALUMNOS Y MATERIAS

    public void añadirAlumnoCentro(Centro miCentro,String nombre, String apellido1,String apellido2,int indice) {
        this.alumnosCentro.add(new Alumno(indice,nombre, apellido1, apellido2));
    }
    public void añadirMateriasCentro(Centro miCentro, String materia) {
        this.materiasCentro.add(new Materia(materia));
    }

    public Alumno devolverCandidato(int aleatorio){
        return this.alumnosCentro.get(aleatorio);
    }

    public void añadirAlumnoMateria(Alumno miAlumno,Materia miMateria,int indice){
        this.materiasCentro.get(indice).addAlumno(miAlumno);
    }

    public void mostrarDatosAlumnos(){
        for (int i = 0; i < alumnosCentro.size(); i++) {
            this.alumnosCentro.get(i).toString();
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
