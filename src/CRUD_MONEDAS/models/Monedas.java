package CRUD_MONEDAS.models;

public class Monedas {
    private  int id;
    private String nombre;
    private String simbolo;
    private double valor;

    public Monedas() {
    }

    public Monedas(int id, String nombre, String simbolo, double valor) {
        this.id = id;
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public double getValor() {
        return valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Monedas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
