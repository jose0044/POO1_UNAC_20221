package co.edu.unac.poo1.unidad1.moto;

public class Moto {

    private String color;
    private Integer tamano;
    private Integer modelo;

    public boolean encender(){
        return false;
    }

    public void acelerar(){
    }

    public char darCambio(){
        return 'N';
    }

    public Moto() {
    }

    public Moto(String color, Integer tamano, Integer modelo) {
        this.color = color;
        this.tamano = tamano;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getTamano() {
        return tamano;
    }

    public void setTamano(Integer tamano) {
        this.tamano = tamano;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }
}
