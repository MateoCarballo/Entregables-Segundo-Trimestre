package EjercicioAlumnos;

public class BB_Persona {
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correoElectronico;

    public BB_Persona(int id, String nombre, String apellido1, String apellido2, String correoElectronico) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.correoElectronico = correoElectronico;
    }

    public int getId() {
        return id;
    }
}
