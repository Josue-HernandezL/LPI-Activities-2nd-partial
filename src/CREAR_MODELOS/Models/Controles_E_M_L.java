package CREAR_MODELOS.Models;
import java.util.Scanner;
import java.util.ArrayList;

public class Controles_E_M_L {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Controles_E_M_L> controlesE = new ArrayList<>();
    public static ArrayList<Controles_E_M_L> controlesM = new ArrayList<>();
    public static ArrayList<Controles_E_M_L> controlesL = new ArrayList<>();

    private int id;
    private String nombre;
    private int habitantes;
    private double latitud;
    private double longitud;

    public Controles_E_M_L() {
    }

    public Controles_E_M_L(int id, String nombre, int abitantes, double latitud, double longitud) {
        this.id = id;
        this.nombre = nombre;
        this.habitantes = abitantes;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public double getLatitud() {
        return latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Controles_E_M_L{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", abitantes=" + habitantes +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                '}';
    }
}
