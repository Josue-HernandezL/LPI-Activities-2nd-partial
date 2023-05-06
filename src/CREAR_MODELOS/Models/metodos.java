package CREAR_MODELOS.Models;
import static CREAR_MODELOS.Models.Controles_E_M_L.*;

public class metodos {
    public static void main(String[] args) {
        menu();
    }
    public static String opcionEML() {
        System.out.println("Ingrese una opcion");
        System.out.println("(1)ESTADOS (2)MUNICIPIO (3)LOCALIDAD");
        int opcion = input.nextInt();
        return (opcion == 1)? "Estado" : (opcion == 2)? "Municipio" : (opcion ==3)? "Localidad" : "Invalida";
    }

    public  static int opcion () {
        System.out.println("Ingrese una opcion:");
        System.out.println("(1)Crear (2)Modificar (3)Salir");
        int opcion = input.nextInt();
        return opcion;
    }
    public static void menu () {
        int opcion = opcion();
        do {
            switch (opcion) {
                case 1: darAlta();
                break;
                case 2: actualizarControl();
                    break;
                case 3:
                    System.out.println("Adios...");
                break;
                default:
                    System.out.println("Opcion invalida");

            }
        }while (opcion!=5);
    }

    public static void darAlta() {
        String name = opcionEML().toLowerCase();
        int id;
        String nombre;
        int numHabitantes;
        double latitud;
        double longitud;
        switch (name) {
            case "estado":
            System.out.println("Ingrese el id:");
            id = input.nextInt();
            System.out.println("Ingrese el nombre:");
            nombre = input.next();
            System.out.println("Ingrese el num. de habitantes:");
            numHabitantes = input.nextInt();
            System.out.println("Ingrese la latitud:");
            latitud = input.nextDouble();
            System.out.println("Ingrese la longitud");
            longitud = input.nextDouble();
            controlesE.add(new Controles_E_M_L(id, nombre, numHabitantes, latitud, longitud));
            System.out.println(controlesE.toString());
                    break;

            case "municipio":
                System.out.println("Ingrese el id:");
                id = input.nextInt();
                System.out.println("Ingrese el nombre:");
                nombre = input.next();
                System.out.println("Ingrese el num. de habitantes:");
                numHabitantes = input.nextInt();
                System.out.println("Ingrese la latitud:");
                latitud = input.nextDouble();
                System.out.println("Ingrese la longitud");
                longitud = input.nextDouble();
                controlesM.add(new Controles_E_M_L(id, nombre, numHabitantes, latitud, longitud));
                System.out.println(controlesM.toString());
                    break;

            case "localidad":
                System.out.println("Ingrese el id:");
                id = input.nextInt();
                System.out.println("Ingrese el nombre:");
                nombre = input.next();
                System.out.println("Ingrese el num. de habitantes:");
                numHabitantes = input.nextInt();
                System.out.println("Ingrese la latitud:");
                latitud = input.nextDouble();
                System.out.println("Ingrese la longitud");
                longitud = input.nextDouble();
                controlesL.add(new Controles_E_M_L(id, nombre, numHabitantes, latitud, longitud));
                System.out.println(controlesL.toString());
                    break;
            default:
                System.out.println("Opcion incorrecta");
        }
        menu();
    }

    public static void actualizarControl() {
        String name = opcionEML().toLowerCase();
        int numReg;
        int id;
        String nombre;
        int numHabitantes;
        double latitud;
        double longitud;
        switch (name) {
            case "estado":
                System.out.println("Ingrese el numero de registro:");
                numReg = input.nextInt();
                System.out.println("Ingrese el id:");
                id = input.nextInt();
                System.out.println("Ingrese el nombre:");
                nombre = input.next();
                System.out.println("Ingrese el num. de habitantes:");
                numHabitantes = input.nextInt();
                System.out.println("Ingrese la latitud:");
                latitud = input.nextDouble();
                System.out.println("Ingrese la longitud");
                longitud = input.nextDouble();
                controlesE.get(numReg).setId(id);
                controlesE.get(numReg).setNombre(nombre);
                controlesE.get(numReg).setHabitantes(numHabitantes);
                controlesE.get(numReg).setLatitud(latitud);
                controlesE.get(numReg).setLongitud(longitud);
                System.out.println(controlesE.toString());
                break;

            case "municipio":
                System.out.println("Ingrese el numero de registro:");
                numReg = input.nextInt();
                System.out.println("Ingrese el id:");
                id = input.nextInt();
                System.out.println("Ingrese el nombre:");
                nombre = input.next();
                System.out.println("Ingrese el num. de habitantes:");
                numHabitantes = input.nextInt();
                System.out.println("Ingrese la latitud:");
                latitud = input.nextDouble();
                System.out.println("Ingrese la longitud");
                longitud = input.nextDouble();
                controlesM.get(numReg).setId(id);
                controlesM.get(numReg).setNombre(nombre);
                controlesM.get(numReg).setHabitantes(numHabitantes);
                controlesM.get(numReg).setLatitud(latitud);
                controlesM.get(numReg).setLongitud(longitud);
                System.out.println(controlesM.toString());
                break;
            case "localidad":
                System.out.println("Ingrese el numero de registro:");
                numReg = input.nextInt();
                System.out.println("Ingrese el id:");
                id = input.nextInt();
                System.out.println("Ingrese el nombre:");
                nombre = input.next();
                System.out.println("Ingrese el num. de habitantes:");
                numHabitantes = input.nextInt();
                System.out.println("Ingrese la latitud:");
                latitud = input.nextDouble();
                System.out.println("Ingrese la longitud");
                longitud = input.nextDouble();
                controlesL.get(numReg).setId(id);
                controlesL.get(numReg).setNombre(nombre);
                controlesL.get(numReg).setHabitantes(numHabitantes);
                controlesL.get(numReg).setLatitud(latitud);
                controlesL.get(numReg).setLongitud(longitud);
                System.out.println(controlesL.toString());
                break;
        }

        menu();

    }
}
