public class Moto extends Vehiculo{
    public Moto(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int peso) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, peso);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("A");
    }

    @Override
    public void setCombustible(String combustible){
        super.setCombustible("Gasolina");
    }
    
}

