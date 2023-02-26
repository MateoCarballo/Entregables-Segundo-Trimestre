package EjercicioConcesionario;


import EjercicioConcesionario.Empresas.Concesionario;
import EjercicioConcesionario.Vehiculos.*;
import Utilidades.AlgoritmosOrdenación;
import Utilidades.Enumeracion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainConcesionario {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean continuar = true;
        String  entradaTeclado;

        Concesionario miConcesionario = new Concesionario("Rías Baixas","123456789",
                "ES-34-5678-00-123456789","httpss//www.mipaginaweb.com",
                "Compra venta de vehiculos",
                "Calle inventada 99","999-123-456",
                "miEmail@miEmpresa.com",
                "192.168.0.1");
        miConcesionario.setTotaldeVehiculos(0);
        miConcesionario.setTotalMotos(0);
        miConcesionario.setTotalCoches(0);
        miConcesionario.setTotalFurgonetas(0);

        miConcesionario.setTotalCamiones(0);

        rellenarCampos(miConcesionario);
        do {
        AlgoritmosOrdenación.bubbleSortMarca (miConcesionario);

            System.out.println("""
                         GESTION CONSCESIONARIO
                    0.Datos Empresa y Facturacion.     
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
                case 0->{
                    System.out.println(miConcesionario);
                }
                case 1 ->{
                    System.out.println("""
                                Elige una opcion:
                            1.Ver todos los vehiculos.
                            2.Ver todas las motos.
                            3.Ver todas los coches.
                            4.Ver todas las furgos.
                            5.Ver todos los camiones.
                            """);

                    //TODO comprobar que introducimos va1lores validos

                    entradaTeclado=br.readLine();
                    switch(Integer.parseInt(entradaTeclado)){
                        case 1-> { System.out.println("""
                                Elige una opcion:
                            1.Ordenados por marca.
                            2.Ordenados por precio.
                            """);
                            entradaTeclado=br.readLine();
                            switch (Integer.parseInt(entradaTeclado)){
                                case 1->AlgoritmosOrdenación.bubbleSortMarca(miConcesionario);
                                case 2->AlgoritmosOrdenación.bubbleSortPrecio(miConcesionario);
                            }
                            Concesionario.verVehiculos();
                        }
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
                            int cilindrada= Integer.parseInt(br.readLine());
                            System.out.println("Matricula?");
                            String matricula= br.readLine();
                            Moto motoAñadida;

                            motoAñadida= new Moto(marca, modelo,"Gasolina", fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso,matricula);
                            motoAñadida.setCilindrada(cilindrada);
                            motoAñadida.setTipo(tipodeMoto);
                            motoAñadida.setTipodeCarnet("A");
                            Concesionario.añadirMoto(motoAñadida);
                            int totalAnterior= miConcesionario.getTotalMotos();
                            miConcesionario.setTotalMotos(totalAnterior+1);
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
                            System.out.println("Matricula?");
                            String matricula= br.readLine();
                            //Propiedades propias del coche
                            Coche cocheAñadido= new Coche(marca, modelo,combustible, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso,matricula);
                            //setear el número de puertas
                            System.out.println("Numero de puertas?");
                            String numerodePuertas= br.readLine();

                            cocheAñadido.setNumerodePuertas(Byte.parseByte(numerodePuertas));
                            cocheAñadido.setTipodeCarnet("B");
                            Concesionario.añadirCoche(cocheAñadido);
                            int totalAnterior= miConcesionario.getTotalCoches();
                            miConcesionario.setTotalCoches(totalAnterior+1);
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
                            System.out.println("Matricula?");
                            String matricula= br.readLine();
                            //Propiedades propias de la furgo
                            Furgoneta furgoAñadida= new Furgoneta(marca, modelo,combustible, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso,matricula);
                            furgoAñadida.setTipodeCarnet("B");
                            Concesionario.añadirFurgoneta(furgoAñadida);
                            int totalAnterior= miConcesionario.getTotalFurgonetas();
                            miConcesionario.setTotalFurgonetas(totalAnterior+1);
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
                            System.out.println("Matricula?");
                            String matricula= br.readLine();
                            //Propiedades propias del camion
                            Camion miCamion= new Camion(marca, modelo,combustible, fechaMatriculacion,
                                    "fechaEntradaConcesionario", pvp, peso,matricula);
                            System.out.println("Masa Maxima Autorizada(M.M.A.)?");
                            int mma = Integer.parseInt(br.readLine());
                            miCamion.setTipodeCarnet("C");
                            miCamion.setMasaMaximaAutorizada(mma);

                            Concesionario.añadirCamion(miCamion);
                            int totalAnterior= miConcesionario.getTotalCamiones();
                            miConcesionario.setTotalCamiones(totalAnterior+1);
                        }

                    }
                    int totalAnterior= miConcesionario.getTotaldeVehiculos();
                    miConcesionario.setTotaldeVehiculos(totalAnterior+1);
                }
                case 3 ->{
                    System.out.println("Introduce la matricula del vehiculo a vender(1234ABC)");
                    String matricula =br.readLine();
                    System.out.println("Precio de venta ");
                    String pvp = br.readLine();
                    int facturacionPreviaVenta= miConcesionario.getFacturacion();
                    miConcesionario.setFacturacion(facturacionPreviaVenta+Integer.parseInt(pvp));
                    Concesionario.venderVehiculo(matricula,pvp);

                }

                case 4 ->{
                    System.out.println("Introduce la matricula del vehiculo a consultar(1234ABC)");
                    entradaTeclado=br.readLine();
                    Concesionario.verEstadisticasVehiculo(entradaTeclado);

                }
                case 5 -> continuar=false;

            }

        }while(continuar);

    }

    public static void rellenarCampos(Concesionario miConcesionario){
        rellenarMotos(miConcesionario.vehiculosConcesionario);
        rellenarCoches(miConcesionario.vehiculosConcesionario);
        rellenarFurgonetas(miConcesionario.vehiculosConcesionario);
        rellenarCamiones(miConcesionario.vehiculosConcesionario);
    }
    private static void rellenarMotos(ArrayList<Vehiculo> vehiculosConcesionario) {
        int aleatorio=0;
        aleatorio=numAleatorioEntero(0,4);


        for (int i = 0; i < 5; i++) {
            Moto miMoto=new Moto(Enumeracion.marcasMoto[aleatorio],
                    Enumeracion.modelosMoto[aleatorio][numAleatorioEntero(0,4)],
                    "Gas",
                    "fechaMatriculacion","fechaEntradaConcesionario",
                    numAleatorioEntero(5000,10000),numAleatorioEntero(180,250),
                    "Matricula");
            /*
            ¿TODO esto se puede hacer?? Tengo dudas que me lo copie y no este modificando el objeto moto que quiero.
            No me queda claro si copio lo que tengo en la ArrayList y trabjo desde fuera o si trabajo directamente lo que tengo en la ArrayList

             */
            miMoto.setTipo(Enumeracion.formatodeMoto[numAleatorioEntero(0,4)]);
            miMoto.setCilindrada(numAleatorioEntero(125,1400));
            vehiculosConcesionario.add(miMoto);
        }
    }
    private static void rellenarCoches(ArrayList<Vehiculo> vehiculosConcesionario) {
        int aleatorio=0;
        aleatorio=numAleatorioEntero(0,3);

        for (int i = 5; i < 10; i++) {
            Coche miCoche=new Coche(Enumeracion.marcasCoche[aleatorio],
                    Enumeracion.modelosCoche[aleatorio][numAleatorioEntero(0,3)],
                    Enumeracion.combustible[numAleatorioEntero(0,4)],
                    "fechaMatriculacion","fechaEntradaConcesionario",numAleatorioEntero(15000,60000),
                    numAleatorioEntero(1800,2500),
                    "Matricula");
            miCoche.setNumerodePuertas((byte)numAleatorioEntero(3,5));
            miCoche.setTipodeCarnet("B");
            vehiculosConcesionario.add(miCoche);
        }
    }
    private static void rellenarFurgonetas(ArrayList<Vehiculo> vehiculosConcesionario) {

            int aleatorio=0;
            aleatorio=numAleatorioEntero(0,4);



            for (int i = 15; i < 20; i++) {
                Furgoneta miFurgoneta= new Furgoneta(Enumeracion.marcasFurgoneta[aleatorio],
                        Enumeracion.modelosFurgoneta[aleatorio][numAleatorioEntero(0,4)],
                        Enumeracion.combustible[numAleatorioEntero(0,4)],
                        "fechaMatriculacion","fechaEntradaConcesionario",
                        numAleatorioEntero(15000,60000),numAleatorioEntero(1800,2500),
                        "Matricula");
                miFurgoneta.setTipodeCarnet("B");
                vehiculosConcesionario.add(miFurgoneta);

            }

    }
    private static void rellenarCamiones(ArrayList<Vehiculo> vehiculosConcesionario) {

            int aleatorio=0;
            aleatorio=numAleatorioEntero(0,4);


            for (int i = 5; i < 10; i++) {
                Camion miCamion = new Camion(Enumeracion.marcasCamion[aleatorio],
                        Enumeracion.modelosCamion[aleatorio][numAleatorioEntero(0,4)],
                        "Diesel",
                        "fechaMatriculacion","fechaEntradaConcesionario",
                        numAleatorioEntero(15000,60000),
                        numAleatorioEntero(1800,2500),
                        "Matricula");
                miCamion.setTipodeCarnet("C");
                vehiculosConcesionario.add(miCamion);
            }


    }
    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    //TODO printear furgonetas
    //todo pendiente de evitar errores al introducir valores(bucles para evitar una mala matricula etc)
    //todo pendiente de autocompletar tipo de carnet en funcion de que clase creamos (moto,coche,camion,etc)
}

