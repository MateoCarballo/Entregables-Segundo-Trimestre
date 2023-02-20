public class Camion extends Vehiculo{

    int masaMaximaAutorizada;

    public Camion(String marca, String modelo, String motorizacion, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, motorizacion, fechaMatriculacion, fechaEntradaConcesionario, peso);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("C");
    }
}
