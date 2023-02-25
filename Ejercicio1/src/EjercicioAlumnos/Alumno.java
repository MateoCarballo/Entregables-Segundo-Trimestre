package EjercicioAlumnos;

import java.util.ArrayList;

public class Alumno extends BB_Persona {

    public static ArrayList<CC_Materia_paraAlumno> cursando = new ArrayList<CC_Materia_paraAlumno>();

    public Alumno(int id, String nombre, String apellido1, String apellido2, String correoElectronico) {
        super(id, nombre, apellido1, apellido2, correoElectronico);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "CC_Alumno{" +
                "cursando=" + cursando +
                '}';
    }
}
