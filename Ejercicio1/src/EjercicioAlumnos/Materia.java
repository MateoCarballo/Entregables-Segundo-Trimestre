package EjercicioAlumnos;

import java.util.ArrayList;

public class Materia {

    final private int horasLectivas=100;
    private String nombreMateria;
    public static ArrayList<Alumno> alumnosCentro= new ArrayList<Alumno>();

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
}
