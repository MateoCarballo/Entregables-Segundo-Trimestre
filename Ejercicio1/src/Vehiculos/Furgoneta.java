package Vehiculos;

import Vehiculos.Coche;

public class Furgoneta extends Coche {

    final boolean puertaLateralCorredera= true;



    public Furgoneta(String marca, String modelo, String combustible, String fechaMatriculacion, String fechaEntradaConcesionario, int precio, int peso,String matricula) {
        super(marca, modelo, combustible, fechaMatriculacion, fechaEntradaConcesionario, precio, peso,matricula);
    }

    @Override
    public void setTipodeCarnet(String tipodeCarnet) {
        super.setTipodeCarnet("B");
    }

        public boolean isPuertaLateralCorredera() {
        return puertaLateralCorredera;
    }

    @Override
    public String toString() {
        super.toString();
        return "puertaLateralCorredera=" + puertaLateralCorredera +
                '}';
    }
}
