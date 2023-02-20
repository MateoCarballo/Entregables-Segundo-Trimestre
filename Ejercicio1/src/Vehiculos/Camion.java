package Vehiculos;

public class Camion extends Vehiculo {

    int masaMaximaAutorizada;

    public Camion(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, precio, peso);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("C");
    }

    @Override
    public void setCombustible(String combustible){
        super.setCombustible("Diesel");
    }
}
