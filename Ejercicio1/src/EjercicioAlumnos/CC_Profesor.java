package EjercicioAlumnos;

import java.util.ArrayList;

public class CC_Profesor extends BB_Persona {

    private ArrayList<CC_Materia_paraProfesor> impartiendo = new ArrayList<CC_Materia_paraProfesor>();

    public CC_Profesor(int id, String nombre, String apellido1, String apellido2, String correoElectronico) {
        super(id, nombre, apellido1, apellido2, correoElectronico);
    }
}
