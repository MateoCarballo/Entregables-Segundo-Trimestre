package EjercicioAlumnos;

import java.util.ArrayList;

public class Materia {

    final private int horasLectivas=100;

    private int codigoMateria= 12345;
    private String nombreMateria;

    private float notaMedia;

    private int notaAlta=Integer.MIN_VALUE;

    private int notaBaja=Integer.MAX_VALUE;

    private ArrayList<Alumno> alumnosMateria= new ArrayList<>();

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public int getNotaAlta() {
        return notaAlta;
    }

    public void setNotaAlta(int notaAlta) {
        this.notaAlta = notaAlta;
    }

    public int getNotaBaja() {
        return notaBaja;
    }

    public void setNotaBaja(int notaBaja) {
        this.notaBaja = notaBaja;
    }

    public void addAlumno (Alumno miAlumno){
        this.alumnosMateria.add(miAlumno);
    }

    public void borrarNotaAlumno(String nombre,String ap1,String ap2){
        //TODO ojo con esto no se que estoy haciendo aquí CONSULTAR
        for (int i = 0; i <this.alumnosMateria.size() ; i++) {
            if((this.alumnosMateria.get(i).getNombre().equalsIgnoreCase(nombre))
            &&(this.alumnosMateria.get(i).getApellido1().equalsIgnoreCase(ap1))
            &&(this.alumnosMateria.get(i).getApellido2().equalsIgnoreCase(ap2))){
                this.alumnosMateria.get(i).setNota(Integer.parseInt(null));
            }
        }

    }

    public void añadirNotaAlumno(String nombre,String ap1,String ap2,int nota){
        for (int i = 0; i <this.alumnosMateria.size() ; i++) {
            if((this.alumnosMateria.get(i).getNombre().equalsIgnoreCase(nombre))
                    &&(this.alumnosMateria.get(i).getApellido1().equalsIgnoreCase(ap1))
                    &&(this.alumnosMateria.get(i).getApellido2().equalsIgnoreCase(ap2))){

                this.alumnosMateria.get(i).setNota(nota);
            }
        }
    }

    public void verAlumnos(){
        this.alumnosMateria.toString();
    }

    public float notaMediaMateria(){
        for (int i = 0; i < alumnosMateria.size(); i++) {
            this.notaMedia += (float) (alumnosMateria.get(i).getNota());
        }
        this.notaMedia=this.notaMedia/alumnosMateria.size();
        notaAltayBaja();
        return notaMedia;
    }

    public void notaAltayBaja(){
        for (int i = 0; i < alumnosMateria.size(); i++) {
            if(alumnosMateria.get(i).getNota()>notaAlta){
                setNotaAlta(alumnosMateria.get(i).getNota());
            }
        }
        for (int i = 0; i < alumnosMateria.size(); i++) {
            if(alumnosMateria.get(i).getNota()<notaBaja){
                setNotaBaja(alumnosMateria.get(i).getNota());
            }
        }
    }

    @Override
    public String toString() {
        return "Materia{" +
                "alumnosMateria=" + alumnosMateria +
                '}';
    }
}

