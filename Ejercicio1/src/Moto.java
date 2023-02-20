public class Moto extends Vehiculo{

    private int cilindrada;
    //TODO naked,custom,trail,RR,Turismo.
    private String tipo;

    public Moto(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, precio, peso);
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

