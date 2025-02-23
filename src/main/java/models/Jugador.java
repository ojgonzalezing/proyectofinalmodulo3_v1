package models;

public class Jugador {

    private String nombre;
    private int numeroJuegos;
    private int juegosGanados;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroJuegos() {
        return numeroJuegos;
    }

    public void setNumeroJuegos(int numeroJuegos) {
        this.numeroJuegos = numeroJuegos;
    }

    public int getJuegosGanados() {
        return juegosGanados;
    }

    public void setJuegosGanados(int juegosGanados) {
        this.juegosGanados = juegosGanados;
    }
}
