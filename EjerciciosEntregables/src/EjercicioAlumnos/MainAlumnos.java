package EjercicioAlumnos;

import Utilidades.Enumeracion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class MainAlumnos {
    public static int id=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean continuar=true;

        Centro iesdeTeis= new Centro("Instituto de Educación Secundaria y Formación Profesional",
                "Público","36018173","Avenida de Galicia, 101. Vigo (Pontevedra)","36216",new ArrayList<>(),new ArrayList<>());


        rellenarCentro(iesdeTeis);

        while (continuar){
            System.out.println("""
                                PROGAMA PARA GESTIONAR NOTAS ALUMNOS
               
                                        1.VER ALUMNOS DEL CENTRO.
                                        2.VER MATERIAS DEL CENTRO.
                                        3.VER ALUMNOS POR MATERIA.
                                        4.MOSTRAR TODOS LOS DATOS DE UN ALUMNO(ID).
                                        5.MOSTRAR ESTADISTICAS DE UNA MATERIA(NOMBRE).
                                        6.AÑADIR NOTA ALUMNO.
                                        7.BORRAR NOTA ALUMNO.
                                        8.VER SUSPENSOS POR MATERIA.
                                        9.SALIR.
                                        
                """);

            /*
            TODO cuando printeo los alumnos aparecen con una nota aunque no debería ser así printeandolo desde la lista de alumnos del centro
             deberian aparecen solo los datos personales cuando la printeamos por cada
             materia si que deberia aparecer la nota tienen una nota para que aparezca en la lista
             de alumnos

            DUDA 1:
            ¿Cómo tener dos "toString" ?
            DUDA 2:
            ¿Debería tener una clase heredada de alumno que tenga una nota como atributo a mayores?
            Aunque yo queria que cada alumno que pertence al ArrayList dentro de cada materia pertenezcan al Centro
             */

            switch(Integer.parseInt(br.readLine())){
                case 1->{
                ArrayList<Alumno> misAlumnos= iesdeTeis.getAlumnosCentro();
                    for (int i = 0; i < misAlumnos.size(); i++) {
                        System.out.println(misAlumnos.get(i).toString());
                    }
                }
                case 2->{
                   ArrayList<Materia> misMaterias=iesdeTeis.getMateriasCentro();
                    for (int i = 0; i < misMaterias.size(); i++) {
                        System.out.println(misMaterias.get(i).toString());
                    }
                }
                case 3->verAlumnosporMateria(iesdeTeis);
                case 4->mostrarDatosAlumno(iesdeTeis);
                case 5->mostrarEstadisticasMateria(iesdeTeis);
                case 6->añadirNota(iesdeTeis);
                case 7->borrarNota(iesdeTeis);
                case 8->verSuspensosMateria(iesdeTeis);
                case 9->{
                    continuar=false;
                }
            }
        }
    }

    private static void mostrarEstadisticasMateria(Centro miCentro) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nombre de la materia?");
        String entradaTeclado= br.readLine();
        ArrayList<Materia> misMaterias= miCentro.getMateriasCentro();
        for (int i = 0; i < misMaterias.size() ; i++) {
            if (misMaterias.get(i).getNombreMateria().equalsIgnoreCase(entradaTeclado)){
                misMaterias.get(i).mostrarEstadisticasMateria(misMaterias.get(i));
            }
        }
    }

    private static void mostrarDatosAlumno(Centro miCentro) throws IOException {
        boolean printeado = false;
//TODO no soy capaz de printear los datos de un alumno
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nombre del alumno?");
        String nombre = br.readLine();
        System.out.println("Primer apellido del alumno?");
        String ap1 = br.readLine();
        System.out.println("Segundo apellido del alumno?");
        String ap2 = br.readLine();
        System.out.println("id?");
        String id = br.readLine();
        for (int i = 0; i < miCentro.getAlumnosCentro().size(); i++) {

            if ((miCentro.getAlumnosCentro().get(i).getId() == Integer.parseInt(id))) {
                System.out.println(miCentro.mostrarDatosAlumno(miCentro.getAlumnosCentro().get(i)));
                printeado = true;
            }



                if ((miCentro.getAlumnosCentro().get(i).getNombre().equalsIgnoreCase(nombre))
                        && (miCentro.getAlumnosCentro().get(i).getNombre().equalsIgnoreCase(ap1))
                        && (miCentro.getAlumnosCentro().get(i).getNombre().equalsIgnoreCase(ap2))) {
                    System.out.println(miCentro.mostrarDatosAlumno(miCentro.getAlumnosCentro().get(i)));
                    printeado = true;
                }

            }
        if (printeado) {
            System.out.println("Printeado con exito");
        } else {
            System.out.println("Alumno no encontrado compruebe los valores introducidos");
        }
    }
    private static void verSuspensosMateria(Centro miCentro) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Materia?");
        String materia = br.readLine();
        for (int i = 0; i < miCentro.getMateriasCentro().size(); i++) {
            //Si coincide el nombre de la materia llamamos al metodo de esa materia para eliminar un alumno
            if (miCentro.getMateriasCentro().get(i).getNombreMateria().equalsIgnoreCase(materia)) {
                miCentro.getMateriasCentro().get(i).verSuspensos();
            }
        }
    }


    public static void verAlumnosporMateria(Centro miCentro)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Materia?");
        String materia = br.readLine();
        for (int i = 0; i < miCentro.getMateriasCentro().size(); i++) {
            //Si coincide el nombre de la materia llamamos al metodo de esa materia para eliminar un alumno
            if (miCentro.getMateriasCentro().get(i).getNombreMateria().equalsIgnoreCase(materia)) {
                miCentro.getMateriasCentro().get(i).verAlumnos();
            }
        }
    }
        public static void añadirNota(Centro miCentro)throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Materia?");
            String materia= br.readLine();
            System.out.println("Nombre?");
            String nombre= br.readLine();
            System.out.println("Primer apellido?");
            String ap1= br.readLine();
            System.out.println("Segundo apellido?");
            String ap2= br.readLine();
            System.out.println("Nota?");
            String nota = br.readLine();

            for (int i = 0; i < miCentro.getMateriasCentro().size(); i++) {
                //Si coincide el nombre de la materia llamamos al metodo de esa materia para eliminar un alumno
                if (miCentro.getMateriasCentro().get(i).getNombreMateria().equalsIgnoreCase(materia)) {
                    miCentro.getMateriasCentro().get(i).añadirNotaAlumno(nombre, ap1, ap2,Integer.parseInt(nota));
                    System.out.println("Nota borrada con exito");
                }
            }

        }

    public static void borrarNota(Centro miCentro)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Materia?");
        String materia= br.readLine();
        System.out.println("Nombre?");
        String nombre= br.readLine();
        System.out.println("Primer apellido?");
        String ap1= br.readLine();
        System.out.println("Segundo apellido?");
        String ap2= br.readLine();
        for (int i = 0; i < miCentro.getMateriasCentro().size(); i++) {
            //Si coincide el nombre de la materia llamamos al metodo de esa materia para eliminar un alumno
            if (miCentro.getMateriasCentro().get(i).getNombreMateria().equalsIgnoreCase(materia)) {
                miCentro.getMateriasCentro().get(i).borrarNotaAlumno(nombre, ap1, ap2);
                System.out.println("Nota borrada con exito");
            }
        }
    }

    public static int numAleatorioEntero(int limInferior, int limSuperior){
        int aleatorio = (int)(Math.random()*(limSuperior-limInferior+1)+limInferior);
        return aleatorio;
    }
    public static void rellenarCentro( Centro miCentro) {
        int cantidadAlumnos = 0;
        boolean alumnoValido=true;





        //RELLENAR LOS ALUMNOS DEL CENTRO
        cantidadAlumnos = numAleatorioEntero(50, 200);

        for (int i = 0; i < cantidadAlumnos; i++) {
            miCentro.añadirAlumnoCentro(miCentro,
                    Enumeracion.nombres[numAleatorioEntero(0, 9)],
                    Enumeracion.apellidos[numAleatorioEntero(0, 9)],
                    Enumeracion.apellidos[numAleatorioEntero(0, 9)],
                    id);
            id += 1;
        }
        ArrayList<Materia> misMaterias=new ArrayList<>();

        // RELLENAR LAS MATERIAS DEL CENTRO
        for (int i = 0; i < Enumeracion.materias.length; i++) {

            miCentro.añadirMateriasCentro(miCentro,Enumeracion.materias[i]);

             misMaterias=miCentro.getMateriasCentro();

            Materia miMateria= misMaterias.get(i);

            cantidadAlumnos = numAleatorioEntero(1, 15);
             /*
            Matriz para gastar id consumidos y volver a buscar
            otro alumno para completar los alumnos que cursen la materia
            ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
             */

            int [] alumnosGastados= new int[cantidadAlumnos];

            for (int j = 0; j < cantidadAlumnos; j++) {

                //1. Coger alumno aleatorio entre todos los que tiene el centro
                Alumno miCandidato;
                do {
                    miCandidato = miCentro.devolverCandidato(numAleatorioEntero(0,cantidadAlumnos));

                //2. Asegurar que no hemos cogido un alumno que ya está matriculado en la materia
                    for (int k = 0; k < alumnosGastados.length; k++) {
                        if (miCandidato.getId() == alumnosGastados[k]) {
                            alumnoValido = false;
                        }else{
                            alumnoValido=true;
                            alumnosGastados[k]=miCandidato.getId();
                            miCentro.añadirAlumnoMateria(miCandidato,miMateria,i);
                        }
                    }
                } while (!alumnoValido);

                /*
                3. AÑADIR ALUMNO A LA MATERIA
                3.1 Copiar la materia(un elemento de la lista)
                en miMateria(la obtenemos con getter)
                3.2 Si el alumno es válido, llamamos a un método del centro que añade un alumno a una materia
                y desde ese método(pasándole como parámetros en que materia y que alumno) añadimos en la materia
                que corresponde el alumno que queremos.
                3.3 Completado
                 */
            }

            //4. Vaciar la matriz de consumidos
            for (int n = 0; n < alumnosGastados.length; n++) {
                alumnosGastados[n]=0;
            }
        }

        //Rellenar las notas de los alumnos creados automáticamente

        for (int i = 0; i < misMaterias.size() ; i++) {
            for (int j = 0; j <miCentro.getMateriasCentro().get(i).getAlumnosMateria().size(); j++) {
                miCentro.getMateriasCentro().get(i).getAlumnosMateria().get(j).setNota(numAleatorioEntero(0,10));
            }
        }

    }
}
