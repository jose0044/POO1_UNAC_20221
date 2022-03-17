package co.edu.unac.poo1.plantas;

public class Planta {
    private String nombre;
    private Integer numeroHojas;
    private Integer edad;

    public Planta() {
    }

    public Planta(String nombre, Integer numeroHojas, Integer edad) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroHojas() {
        return numeroHojas;
    }

    public void setNumeroHojas(Integer numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
