package EjercicioAlumnos;

import Utilidades.Enumeracion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AA_MainAlumnos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entradaTeclado;
        boolean continuar=true;
        int id=0;

        BB_Centro iesdeTeis= new BB_Centro("Instituto de Educación Secundaria y Formación Profesional",
                "Público","36018173","Avenida de Galicia, 101. Vigo (Pontevedra)","36216");

        for (int i = 0; i < 5; i++) {
            BB_Centro.alumnosCentro.add(new CC_Alumno(id,
                    Enumeracion.nombres[numAleatorioEntero(0,9)],
                    Enumeracion.apellidos[numAleatorioEntero(0,9)],
                    Enumeracion.apellidos[numAleatorioEntero(0,9)],
                    "correodelAlumno."+id+"@micorreo.com"));
            id+=1;
            BB_Centro.materiasCentro.add(new BB_Materia(Enumeracion.materias[numAleatorioEntero(0,9)]));
            BB_Centro.profesoresCentro.add(new CC_Profesor(id,
                    Enumeracion.nombres[numAleatorioEntero(0,9)],
                    Enumeracion.apellidos[numAleatorioEntero(0,9)],
                    Enumeracion.apellidos[numAleatorioEntero(0,9)],
                    "correodeProfesor."+id+"@micorreo.com"));
        }

        while (continuar){
            System.out.println("""
                            PROGAMA PARA GESTIONAR NOTAS ALUMNOS
               
                                        1.VER ALUMNOS.
                                        2.VER MATERIAS.
                                        3.VER PROFESORES.
                                        4.MOSTRAR TODOS LOS DATOS DE UN ALUMNO(ID).
                                        5.MOSTRAR ESTADISTICAS DE UNA MATERIA(NOMBRE).
                                        6.AÑADIR NOTA ALUMNO.
                                        7.BORRAR NOTA ALUMNO.
                                        8.VER SUSPENSOS POR MATERIA.
                                        6.SALIR.      
                                        
                """);
            switch(Integer.parseInt(br.readLine())){
                case 1-> System.out.println("VER NOTAS"+"\n");
                case 2->System.out.println("AÑADIR NOTA"+"\n");
                case 3->System.out.println("BORRAR NOTA"+"\n");
                case 4->System.out.println("ESTADISTICAS"+"\n");
                case 5->System.out.println("VER SUSPENDIDOS"+"\n");
                case 6->{
                    System.out.println("Hasta pronto!!!!"+"\n");
                    continuar=false;
                }
            }
        }



    }
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
}
