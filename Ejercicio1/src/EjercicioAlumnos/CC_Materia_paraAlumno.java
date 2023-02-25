package EjercicioAlumnos;

public class CC_Materia_paraAlumno extends BB_Materia{

    private float notaTrimestre1;
    private float notaTrimestre2;
    private float notaTrimestre3;
    private float notaFinal;

    public CC_Materia_paraAlumno(String nombreMateria){
        super(nombreMateria);
    }

    @Override
    public String toString() {
        return "CC_Materia_paraAlumno{" +
                "notaTrimestre1=" + notaTrimestre1 +
                ", notaTrimestre2=" + notaTrimestre2 +
                ", notaTrimestre3=" + notaTrimestre3 +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
