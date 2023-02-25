package EjercicioAlumnos;

import Utilidades.Enumeracion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAlumnos {
    public static int id=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entradaTeclado;
        boolean continuar=true;


        Centro iesdeTeis= new Centro("Instituto de Educación Secundaria y Formación Profesional",
                "Público","36018173","Avenida de Galicia, 101. Vigo (Pontevedra)","36216");

        rellenarCentro();

        while (continuar){
            System.out.println("""
                                PROGAMA PARA GESTIONAR NOTAS ALUMNOS
               
                                        1.VER ALUMNOS.
                                        2.VER MATERIAS.
                                        3.MOSTRAR TODOS LOS DATOS DE UN ALUMNO(ID).
                                        4.MOSTRAR ESTADISTICAS DE UNA MATERIA(NOMBRE).
                                        7.AÑADIR NOTA ALUMNO.
                                        8.BORRAR NOTA ALUMNO.
                                        9.VER SUSPENSOS POR MATERIA.
                                        10.SALIR.      
                                        
                """);
            switch(Integer.parseInt(br.readLine())){
                case 1-> System.out.println("VER NOTAS"+"\n");
                case 2->System.out.println("AÑADIR NOTA"+"\n");
                case 3->System.out.println("BORRAR NOTA"+"\n");
                case 4->System.out.println("ESTADISTICAS"+"\n");
                case 5->System.out.println("VER SUSPENDIDOS"+"\n");
                case 6->{

                }
                case 10->{

                    continuar=false;
                }
            }
        }



    }
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static void rellenarCentro(){
        for (int i = 0; i < 5; i++) {


        }

    }
}
