package EjercicioAlumnos;

import java.util.ArrayList;

public class CC_Materia_paraProfesor extends BB_Materia{

    private ArrayList<CC_Materia_paraProfesor> cursando = new ArrayList<CC_Materia_paraProfesor>();

    public CC_Materia_paraProfesor(String nombreMateria){
        super(nombreMateria);
    }
}
