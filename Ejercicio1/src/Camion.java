public class Camion extends Vehiculo{

    int masaMaximaAutorizada;

    public Camion(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, peso);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("C");
    }
}
