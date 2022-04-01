package co.edu.unac.poo1.unidad3.plantas;

public class Petalo {
    private String color;
    private Float largo;
    private Float grosor;

    public Petalo() {
    }

    public Petalo(String color, Float largo, Float grosor) {
        this.color = color;
        this.largo = largo;
        this.grosor = grosor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getLargo() {
        return largo;
    }

    public void setLargo(Float largo) {
        this.largo = largo;
    }

    public Float getGrosor() {
        return grosor;
    }

    public void setGrosor(Float grosor) {
        this.grosor = grosor;
    }
}
