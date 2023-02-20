import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean continuar = true;
        String  entradaTeclado ="";

        Empresa miConcesionario = new Concesionario("Rías Baixas","123456789",
                "ES-34-5678-00-123456789","httpss//www.mipaginaweb.com",
                "Compra venta de vehiculos",
                "Calle inventada 99","999-123-456",
                "miEmail@miEmpresa.com",
                "192.168.0.1");

        do {
            System.out.println("""
                         GESTION CONSCESIONARIO
                         
                    1.VER VEHICULOS.
                    2.AÑADIR VEHICULO.
                    3.VENDER VEHICULO.
                    4.VER ESTADISTICAS DE UN VEHICULO.
                    5.SALIR.                          
                    """);
                    /*
                    Pendiente introducir los metodos que vendran dados por la clase empresa
                     */
            entradaTeclado=br.readLine();

            switch (Integer.parseInt(entradaTeclado)){
                case 1 ->{
                    System.out.println("""
                                Elige una opcion:
                            1.Ver todos los vehiculos.
                            2.Ver todas las motos.
                            3.Ver todas los coches.
                            4.Ver todas las furgos.
                            5.Ver todos los camiones.
                            """);

                    //TODO comprobar que introducimos valores validos

                    entradaTeclado=br.readLine();
                    switch(Integer.parseInt(entradaTeclado)){
                        case 1->{
                            Concesionario.verVehiculos();
                        }
                        case 2 ->{
                            Concesionario.verMotos();
                        }
                        case 3 ->{
                            Concesionario.verCoches();
                        }
                        case 4 ->{
                            Concesionario.verFurgonetas();
                        }
                        case 5 ->{
                            Concesionario.verCamiones();
                        }
                    }

                }
                case 2 ->{
                    System.out.println("""
                                    AÑADIR
                            1.  MOTO
                            2.  COCHE
                            3.  FURGONETA
                            4.  CAMION
                            
                            """);
                    //TODO comprobar que introducimos valores validos

                    entradaTeclado=br.readLine();
                    switch(Integer.parseInt(entradaTeclado)){
                        case 1->{
                            Concesionario.añadirMoto();
                        }
                        case 2 ->{
                            Concesionario.añadirCoche();
                        }
                        case 3 ->{
                            Concesionario.añadirFurgoneta();
                        }
                        case 4 ->{
                            Concesionario.añadirCamion();
                        }
                    }
                }
                case 3 ->{
                    System.out.println("Introduce la matricula del vehiculo a vender(1234ABC)");
                    entradaTeclado=br.readLine();
                    Concesionario.venderVehiculo();
                }

                case 4 ->{
                    System.out.println("Introduce la matricula del vehiculo a consultar(1234ABC)");
                    entradaTeclado=br.readLine();
                    Concesionario.verEstadisticasVehiculo();

                }

            }
        }while(continuar);

    }
}