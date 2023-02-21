package Empresas;

import Vehiculos.Vehiculo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Concesionario extends Empresa{
    int totaldeVehiculos;
    int totalMotos;
    int totalCoches;
    int totalFurgonetas;
    int totalCamiones;
    int facturacion;

    public static final ArrayList <Vehiculo> vehiculosConcesionario =new ArrayList<Vehiculo>();
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

    }
    public static void verMotos(){

    }
    public static void verCoches(){

    }
    public static void verFurgonetas(){

    }
    public static void verCamiones(){

    }
    public static void venderVehiculo (String matricula){
        Vehiculo miVehiculo = new Vehiculo();
        //TODO esto se puede hacer mejor ?
        for (int i = 0; i < vehiculosConcesionario.size()  ; i++) {
            miVehiculo=vehiculosConcesionario.get(i);
            if (miVehiculo.getMatricula().equalsIgnoreCase(matricula)){
                vehiculosConcesionario.remove(i);
            }
        }
    }


    public static void verEstadisticasVehiculo(){
        
    }
}
