package CAJERO_AUTOMATICO.Models;

public class Objetos {

    private int id;
    private String usuario;
    private double saldo;
    private int pin;

    public Objetos() {
    }

    public Objetos(int id, String usuario, double saldo, int pin) {
        this.id = id;
        this.usuario = usuario;
        this.saldo = saldo;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }
    public String getUsuario() {
        return usuario;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getPin() {
        return pin;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Cash_machine{" +
                "id='" + id + '\'' +
                "usuario='" + usuario +
                ", saldo=" + saldo +
                ", pin=" + pin +
                '}';
    }
}
