import Empresas.Concesionario;
import Empresas.Empresa;
import Vehiculos.*;

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
                        case 1-> Concesionario.verVehiculos();
                        case 2 -> Concesionario.verMotos();
                        case 3 -> Concesionario.verCoches();
                        case 4 -> Concesionario.verFurgonetas();
                        case 5 -> Concesionario.verCamiones();
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
                        case 1-> {
                            System.out.println("Marca?");
                            String marca = br.readLine();
                            System.out.println("Modelo?");
                            String modelo = br.readLine();
                            System.out.println("Fecha de matriculacion?");
                            String fechaMatriculacion = br.readLine();
                            System.out.println("P.V.P.?");
                            int pvp = Integer.parseInt(br.readLine());
                            System.out.println("Peso?");
                            int peso = Integer.parseInt(br.readLine());
                            //Propiedades específicas de la clase moto
                            System.out.println("Tipo de moto?(Naked,custom,...)");
                            String tipodeMoto = br.readLine();
                            System.out.println("Cilindrada?");
                            Vehiculo motoAñadida = new Moto(marca, modelo, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso);

                            Concesionario.añadirMoto(motoAñadida);
                        }
                        case 2 -> {
                            System.out.println("Marca?");
                            String marca = br.readLine();
                            System.out.println("Modelo?");
                            String modelo = br.readLine();
                            System.out.println("Fecha de matriculacion?");
                            String fechaMatriculacion = br.readLine();
                            System.out.println("P.V.P.?");
                            int pvp = Integer.parseInt(br.readLine());
                            System.out.println("Peso?");
                            int peso = Integer.parseInt(br.readLine());
                            System.out.println("Combustible?");
                            String combustible = br.readLine();
                            //Propiedades propias del coche
                            Coche cocheAñadido= new Coche(marca, modelo,combustible, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso);
                            //setear el número de puertas
                            System.out.println("Numero de puertas?");
                            String numerodePuertas= br.readLine();

                            cocheAñadido.setNumerodePuertas(Byte.parseByte(numerodePuertas));

                            Concesionario.añadirCoche(cocheAñadido);
                        }

                        case 3 ->{System.out.println("Marca?");
                            String marca = br.readLine();
                            System.out.println("Modelo?");
                            String modelo = br.readLine();
                            System.out.println("Fecha de matriculacion?");
                            String fechaMatriculacion = br.readLine();
                            System.out.println("P.V.P.?");
                            int pvp = Integer.parseInt(br.readLine());
                            System.out.println("Peso?");
                            int peso = Integer.parseInt(br.readLine());
                            System.out.println("Combustible?");
                            String combustible = br.readLine();
                            //Propiedades propias de la furgo
                            Furgoneta furgoAñadida= new Furgoneta(marca, modelo,combustible, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso);
                            //setear el número de puertas
                            System.out.println("Puertas correderas?(S/N)");

                            if (br.readLine().equalsIgnoreCase("S")){
                                furgoAñadida.setPuertaLateralCorredera(true);
                            }else{
                                furgoAñadida.setPuertaLateralCorredera(false);
                            }
                            Concesionario.añadirFurgoneta(furgoAñadida);
                            }
                        case 4 ->{System.out.println("Marca?");
                            String marca = br.readLine();
                            System.out.println("Modelo?");
                            String modelo = br.readLine();
                            System.out.println("Fecha de matriculacion?");
                            String fechaMatriculacion = br.readLine();
                            System.out.println("P.V.P.?");
                            int pvp = Integer.parseInt(br.readLine());
                            System.out.println("Peso?");
                            int peso = Integer.parseInt(br.readLine());
                            System.out.println("Combustible?");
                            String combustible = br.readLine();
                            //Propiedades propias del camion
                            Camion miCamion= new Camion(marca, modelo,combustible, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso);
                            System.out.println("Masa Maxima Autorizada(M.M.A.)?");
                            int mma = Integer.parseInt(br.readLine());
                            miCamion.setMasaMaximaAutorizada(mma);
                            
                            Concesionario.añadirCamion(miCamion);
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