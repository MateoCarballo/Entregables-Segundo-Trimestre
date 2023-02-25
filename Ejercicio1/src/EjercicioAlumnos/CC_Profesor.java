package EjercicioAlumnos;

import java.util.ArrayList;

public class CC_Profesor extends BB_Persona {

    public static ArrayList<BB_Materia> impartiendo = new ArrayList<BB_Materia>();

    public CC_Profesor(int id, String nombre, String apellido1, String apellido2, String correoElectronico) {
        super(id, nombre, apellido1, apellido2, correoElectronico);
    }
}
