package Exercicios;

public class Memoria {
    private String marca;
    private String modelo;
    private String frequecia;
    
    public Memoria() {
    }

    public Memoria(String marca, String modelo, String frequecia) {
        this.marca = marca;
        this.modelo = modelo;
        this.frequecia = frequecia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFrequecia() {
        return frequecia;
    }

    public void setFrequecia(String frequecia) {
        this.frequecia = frequecia;
    }

    @Override
    public String toString() {
        return "\n== Memoria == \nMarca :" + marca + "\nModelo :" + modelo + "\nFrequecia :" + frequecia + "\nGetMarca() :"
                + getMarca() + "\nGetModelo():" + getModelo() + "\nGetFrequecia():" + getFrequecia() + "";
    }

    

}
