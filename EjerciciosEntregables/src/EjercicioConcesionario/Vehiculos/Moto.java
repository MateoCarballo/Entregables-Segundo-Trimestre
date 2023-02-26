package EjercicioConcesionario.Vehiculos;

public class Moto extends Vehiculo {

    private int cilindrada;

    private String tipo;

    public Moto(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, String entradaConcesionario, int precio, int peso, String matricula) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, entradaConcesionario, precio, peso, matricula);
    }

    public Moto(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso, String matricula) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, precio, peso, matricula);
        setearCamposPropios();
    }

    private void setearCamposPropios() {
        setTipodeCarnet("A");
        setCombustible("Gasolina");
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet(tipodeCarnet);
    }

    @Override
    public void setCombustible(String combustible){
        super.setCombustible("Gasolina");
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        System.out.println(super.toString());
        return  "cilindrada=" + cilindrada +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

