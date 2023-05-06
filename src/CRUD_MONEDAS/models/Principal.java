package CRUD_MONEDAS.models;
import CRUD_MONEDAS.models.Monedas;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static ArrayList<Monedas> monedas = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        System.out.println("Ingrese que opcion desea:");
        System.out.println("(1) Crear moneda");
        System.out.println("(2) Listar moneda");
        System.out.println("(3) Actualizar moneda");
        System.out.println("(4) Borrar moneda");
        System.out.println("(5) Salir");
        int opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("(1) Crear moneda");
                    System.out.println("------------------");
                    crearMonedas(); break;
                case 2:
                    System.out.println("(2) Listar moneda");
                    System.out.println("------------------");
                    listarMonedas(); break;
                case 3:
                    System.out.println("(3) Actualizar moneda");
                    System.out.println("------------------");
                    actualizarMonedas(); break;
                case 4:
                    System.out.println("(4) Borrar moneda");
                    borrarMonedas();
                    break;
                case 5:  System.out.println("Adios"); break;
            }

    }


    public static void crearMonedas() {
        System.out.println("Ingrese el id de la moneda:");
        int id = input.nextInt();
        System.out.println("Ingrese el nombre de su moneda");
        String name = input.next();
        System.out.println("Ingrese el simbolo de su moneda");
        String simbolo = input.next();
        System.out.println("Ingrese el valor de su moneda");
        int valor = input.nextInt();

        monedas.add(new Monedas(id, name, simbolo, valor));
        System.out.println("Moneda: " + name + " agregada correctamente");
        System.out.println("--------------------------------");
        menu();
    }

    public static void borrarMoneda(int id) {
        monedas.remove(id-1);
        menu();
    }

    public static void borrarMonedas() {
        System.out.println("Ingrese el id de la moneda a eliminar:");
        int id = input.nextInt();
        borrarMoneda(id);
    }

    public static void listarMonedas() {

        for (Monedas moneda : monedas) {
            System.out.println(moneda.toString());
        }

        menu();

    }
    public static void actualizarMonedas() {
        System.out.println("Ingrese el numero de registro:");
        int numReg = input.nextInt();
        System.out.println("Ingrese el id");
        int id = input.nextInt();
        System.out.println("Ingrese el nombre de su moneda");
        String moneda = input.next();
        System.out.println("Ingrese el simbolo");
        String simbolo = input.next();
        System.out.println("Ingrese el valor de su moneda");
        double valor = input.nextDouble();
        actualizarMoneda(numReg, id, moneda, simbolo, valor);

    }
    public static void actualizarMoneda(int numReg, int id, String nombre, String simbolo, double valor) {
        monedas.get(numReg).setId(id);
        monedas.get(numReg).setNombre(nombre);
        monedas.get(numReg).setSimbolo(simbolo);
        monedas.get(numReg).setValor(valor);
        menu();
    }

}
