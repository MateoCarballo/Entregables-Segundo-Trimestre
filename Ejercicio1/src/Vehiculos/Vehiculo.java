package Vehiculos;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String combustible;
    private String fechaMatriculacion;
    private String fechaEntradaConcesionario;

    private int precio;
    private String tipodeCarnet;
    private int peso;

    private String matricula;

    boolean esFurgoneta;

    public Vehiculo(){

    }

    public Vehiculo(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.fechaMatriculacion = fechaMatriculacion;
        this.fechaEntradaConcesionario = fechaEntradaConcesionario;
        this.precio = precio;
        this.peso = peso;
        this.matricula = matricula;
    }

    public void setTipodeCarnet(String tipodeCarnet) {
        this.tipodeCarnet = tipodeCarnet;
    }

    public void setCombustible(String combustible) {this.combustible = combustible;}

    public String getMatricula() {
        return matricula;
    }

    public String getTipodeCarnet() {
        return tipodeCarnet;
    }

    public boolean isEsFurgoneta() {
        return esFurgoneta;
    }

    public void setEsFurgoneta(boolean esFurgoneta) {
        this.esFurgoneta = esFurgoneta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", combustible='" + combustible + '\'' +
                ", fechaMatriculacion='" + fechaMatriculacion + '\'' +
                ", fechaEntradaConcesionario='" + fechaEntradaConcesionario + '\'' +
                ", precio=" + precio +
                ", tipodeCarnet='" + tipodeCarnet + '\'' +
                ", peso=" + peso +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
