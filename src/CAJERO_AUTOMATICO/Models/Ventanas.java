package CAJERO_AUTOMATICO.Models;
import java.util.ArrayList;
import  java.util.Scanner;
import CAJERO_AUTOMATICO.Models.*;

public class Ventanas {

    static ArrayList<Objetos> objetos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void inicio() {
        System.out.println("=========================\n|| CAJERO || AUTOMATICO || \n=========================");
    }

    public static int opciones() {
        inicio();
        System.out.println("|| INGRESE UNA OPCIÓN: ||");
        System.out.println("|| (1)REGISTRAR (2)INICIAR SESION (3)SALIR ||");
        return input.nextInt();
    }

    public static void menu () {
        int opcion = opciones();
        switch (opcion) {
            case 1:
                registrar();
                break;
            case 2:
                iniciar();
                break;
            case 3:
                System.out.println("Adiosss");
                break;
            default:
                System.out.println("Opción incorrecta");
                break;
        }
    }

    public static void registrar  () {
        System.out.println("|| REGISTRAR ||");
        System.out.println("Ingrese su id");
        int id = input.nextInt();
        System.out.println("Cree su usuario:");
        String usuario = input.next();
        System.out.println("Monto a ingresar:");
        double saldo = input.nextDouble();
        System.out.println("Cree su pin:");
        int pin = input.nextInt();

        objetos.add(new Objetos(id, usuario, saldo, pin));
        System.out.println(objetos.toString());

        opciones();
    }

    public static void iniciar() {
        System.out.println("Iniciar sesión");
        System.out.println("Ingrese su nombre:");
        String nombre = input.next();
        System.out.println("Ingrese su usuario: ");
        String usuario = input.next();

        System.out.println("|| (1)Regresar (2)INICIAR");
        int opcion = input.nextInt();
        if(opcion == 1) {
            menu(); }
        if(opcion == 2) {

            layoutPrincipal();}
        else{
            System.out.println("Opcion incorrecta");}

    }

    public static void layoutPrincipal() {
        for (Objetos objeto: objetos) {
            objeto.toString();
        }
    }

    public static void ex() {
        String [] cars = {"1", "2", "3"};
        System.out.println(cars.length);
    }

    public static void main(String[] args) {
        ex();
    }

}