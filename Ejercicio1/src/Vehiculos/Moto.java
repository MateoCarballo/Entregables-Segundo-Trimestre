package Vehiculos;

public class Moto extends Vehiculo {

    private int cilindrada;
    //TODO naked,custom,trail,RR,Turismo.
    private String tipo;
    public Moto(){

    }

    public Moto(String marca, String modelo, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso,String matricula) {
        super(marca, modelo, fechaMatriculacion, fechaEntradaConcesionario, fechaEntradaConcesionario, precio, peso, matricula);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("A");
    }

    @Override
    public void setCombustible(String combustible){
        super.setCombustible("Gasolina");
    }

    /*
    TODO tengo dudas a la hora de saber que tipo de carnet necesita el vehiculo no se si deberia t
    tenerlo en vehiculo o en cada una de las clases que heredan por que lo sobreescribo y seteo
    con el tipo de carnet de cada clase.
    public String getTipodeCarnet() {
        return tipodeCarnet();
    }
     */

    @Override
    public String toString() {
        super.toString();
        return  "cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

