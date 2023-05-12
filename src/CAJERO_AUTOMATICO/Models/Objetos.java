package CAJERO_AUTOMATICO.Models;

public class Objetos {

    private int id;
    private String usuario;
    private int pin;

    public Objetos() {
    }

    public Objetos(int id, String usuario, int pin) {
        this.id = id;
        this.usuario = usuario;
        this.pin = pin;
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
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

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Objetos{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", pin=" + pin +
                '}';
    }
}
