package EjercicioAlumnos;

import java.util.ArrayList;

public class CC_Alumno extends BB_Persona {
    
    private ArrayList<CC_Materia_paraAlumno> cursando = new ArrayList<CC_Materia_paraAlumno>();

    public CC_Alumno(int id, String nombre, String apellido1, String apellido2, String correoElectronico) {
        super(id, nombre, apellido1, apellido2, correoElectronico);
    }
}
