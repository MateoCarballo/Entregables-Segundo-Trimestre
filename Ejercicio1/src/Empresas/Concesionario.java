package Empresas;

import Vehiculos.Vehiculo;

import java.util.ArrayList;

public class Concesionario extends Empresa{
    int totaldeVehiculos;
    int totalMotos;
    int totalCoches;
    int totalFurgonetas;
    int totalCamiones;
    int facturacion;

    public static ArrayList <Vehiculo> vehiculosConcesionario =new ArrayList<Vehiculo>();
    public Concesionario(String nombreEmpresa, String cif, String cuentaSS, String url, String razonSocial, String direccionPostal, String numeroTelefono1, String emailcorporativo1, String ip1) {
        super(nombreEmpresa, cif, cuentaSS, url, razonSocial, direccionPostal, numeroTelefono1, emailcorporativo1, ip1);
    }

    public int getTotaldeVehiculos() {
        return totaldeVehiculos;
    }

    public void setTotaldeVehiculos(int totaldeVehiculos) {
        this.totaldeVehiculos = totaldeVehiculos;
    }

    public void setFacturacion(int facturacion) {
        this.facturacion = facturacion;
    }

    public int getFacturacion() {
        return facturacion;
    }

    public int getTotalMotos() {
        return totalMotos;
    }

    public void setTotalMotos(int totalMotos) {
        this.totalMotos = totalMotos;
    }

    public int getTotalCoches() {
        return totalCoches;
    }

    public void setTotalCoches(int totalCoches) {
        this.totalCoches = totalCoches;
    }

    public int getTotalFurgonetas() {
        return totalFurgonetas;
    }

    public void setTotalFurgonetas(int totalFurgonetas) {
        this.totalFurgonetas = totalFurgonetas;
    }

    public int getTotalCamiones() {
        return totalCamiones;
    }

    public void setTotalCamiones(int totalCamiones) {
        this.totalCamiones = totalCamiones;
    }

    public static void añadirMoto(Vehiculo miMoto){
        vehiculosConcesionario.add(miMoto);
    }
    public static void añadirCoche(Vehiculo miCoche){
        vehiculosConcesionario.add(miCoche);
    }
    public static void añadirFurgoneta(Vehiculo miFurgoneta){
        vehiculosConcesionario.add(miFurgoneta);
    }
    public static void añadirCamion(Vehiculo miCamion){
        vehiculosConcesionario.add(miCamion);
    }

    public static void verVehiculos(){
        for (int i = 0; i <vehiculosConcesionario.size() ; i++) {

           System.out.println(vehiculosConcesionario.get(i));
        }
    }

    public static void verMotos(){
        for (int i = 0; i <vehiculosConcesionario.size() ; i++) {
            if(vehiculosConcesionario.get(i).getTipodeCarnet().equalsIgnoreCase("A")){
                System.out.println(vehiculosConcesionario.get(i).toString());
            }
        }
    }
    public static void verCoches(){
        Vehiculo miCoche;

        for (int i = 0; i <vehiculosConcesionario.size() ; i++) {
            miCoche=vehiculosConcesionario.get(i);
            if(miCoche.getTipodeCarnet().equalsIgnoreCase("B")){
                System.out.println(miCoche);
            }
        }
    }

    public static void verFurgonetas(){
        for (int i = 0; i <vehiculosConcesionario.size() ; i++) {
            if(vehiculosConcesionario.get(i).isEsFurgoneta()){
                System.out.println(vehiculosConcesionario.get(i));
            }
        }
    }

    public static void verCamiones(){
        Vehiculo miCamion;

        for (int i = 0; i <vehiculosConcesionario.size() ; i++) {
            miCamion=vehiculosConcesionario.get(i);
            if(miCamion.getTipodeCarnet().equalsIgnoreCase("C")){
                System.out.println(miCamion);
            }
        }
    }
    public static void venderVehiculo (String matricula,String pvp){

        //TODO esto se puede hacer mejor ?
        for (int i = 0; i < vehiculosConcesionario.size()  ; i++) {
            if (vehiculosConcesionario.get(i).getMatricula().equalsIgnoreCase(matricula)){
                vehiculosConcesionario.remove(i);
            }

        }
        System.out.println("Vehiculo vendido por un precio de"+ pvp+ " €");
    }


    public static void verEstadisticasVehiculo(String matricula){
        Vehiculo miVehiculo;
        for (int i = 0; i < vehiculosConcesionario.size(); i++) {
            miVehiculo=vehiculosConcesionario.get(i);
            if(miVehiculo.getMatricula().equalsIgnoreCase(matricula)){
                System.out.println( miVehiculo);;
            }
        }
    }

    @Override
    public String toString() {
        return "Concesionario{" +
                "totaldeVehiculos=" + totaldeVehiculos +
                ", totalMotos=" + totalMotos +
                ", totalCoches=" + totalCoches +
                ", totalFurgonetas=" + totalFurgonetas +
                ", totalCamiones=" + totalCamiones +
                ", facturacion=" + facturacion +
                '}';
    }
}
