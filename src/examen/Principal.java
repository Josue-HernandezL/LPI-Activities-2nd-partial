package examen;
import examen.Models.Distrito;
import examen.Models.Distrito.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    static  String red = "\u001B[31m";
    static  String green = "\u001B[32m";
    static  String yellow = "\u001B[33m";

    static ArrayList<Distrito> distritos = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void agregarValores() {
        System.out.println("Ingrese el listado:");
        int listado = input.nextInt();
        System.out.println("Ingrese el numero de votantes");
        int votantes = input.nextInt();
        distritos.add(new Distrito(listado, votantes));
        System.out.println(distritos.toString());
        porcentajeParticipacion();
    }

    public static void porcentajeParticipacion() {
        int votantes = distritos.get(0).getVotantes();
        int listado = distritos.get(0).getListado();
        double operacion = ((double) votantes / listado) * 100;
        System.out.println(yellow + "Porcentaje de participacion: " + operacion + "%");
        porcentajeAbstinencia(votantes, listado);
    }

    public static void porcentajeAbstinencia(int votantes, int listados) {
        int resto = listados-votantes;
        double operacion = ((double) resto / listados) * 100;
        System.out.println(red + "Porcentaje de abstinencia: " + operacion + "%");
        faltantes(votantes, listados);
    }

    public static void faltantes(int votantes, int listados) {
        int operacion = (listados-votantes);
        System.out.println(green + "Faltantes: " + operacion);
    }

    public static void main(String[] args) {
        agregarValores();
    }

}
