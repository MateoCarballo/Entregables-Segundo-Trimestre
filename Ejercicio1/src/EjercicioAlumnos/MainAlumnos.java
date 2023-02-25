package EjercicioAlumnos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainAlumnos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entradaTeclado;
        boolean continuar=true;

        while (continuar){
            System.out.println("""
                            PROGAMA PARA GESTIONAR NOTAS ALUMNOS
                
                                        1.VER NOTAS.
                                        2.AÑADIR NOTA.
                                        3.BORRAR NOTA.
                                        4.ESTADISTICAS.
                                        5.VER SUSPENDIDOS.
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
}
