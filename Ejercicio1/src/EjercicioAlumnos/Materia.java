package EjercicioAlumnos;

import java.util.ArrayList;

public class Materia {

    final private int horasLectivas=100;

    private int codigoMateria= 12345;
    private String nombreMateria;

    public static ArrayList<Alumno> alumnosMateria= new ArrayList<Alumno>();

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public static void estadisticasMateria(){

    }
    @Override
    public String toString() {
        return "Materia{" +'\n'+
                "horasLectivas=" + horasLectivas +'\n'+
                ", codigoMateria=" + codigoMateria +'\n'+
                ", nombreMateria='" + nombreMateria + '\n' +
                '}'+'\n';
    }
}

