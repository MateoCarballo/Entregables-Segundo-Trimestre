package EjercicioAlumnos;

import java.util.ArrayList;

public class Alumno{
    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String correoElectronico;
    private String tfnContacto;

    private int nota;

    public Alumno(int id, String nombre, String apellido1, String apellido2) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
    }

    public int getId() {
        return id;
    }

    public int getNota() {
        return nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido1='" + apellido1 + '\'' +
                ", apellido2='" + apellido2 + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", tfnContacto='" + tfnContacto + '\'' +
                ", nota=" + nota +
                '}';
    }
}
