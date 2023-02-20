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

    public static void añadirMoto(){

    }
    public static void añadirCoche(){

    }
    public static void añadirFurgoneta(){

    }
    public static void añadirCamion(){

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
}
