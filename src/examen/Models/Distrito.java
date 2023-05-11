package examen.Models;

public class Distrito {
    private int listado;
    private int votantes;

    public Distrito() {
    }

    public Distrito(int listado, int votantes) {
        this.listado = listado;
        this.votantes = votantes;
    }

    public int getListado() {
        return listado;
    }

    public int getVotantes() {
        return votantes;
    }

    public void setListado(int listado) {
        this.listado = listado;
    }

    public void setVotantes(int votantes) {
        this.votantes = votantes;
    }

    @Override
    public String toString() {
        return "Distrito{" +
                "listado=" + listado +
                ", votantes=" + votantes +
                '}';
    }
}
