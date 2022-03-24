package co.edu.unac.poo1.unidad3.plantas;

public class Planta {

    protected String nombre;
    protected Integer altura;
    protected Integer edad;

    public Planta() {
    }

    public Planta(String nombre, Integer altura, Integer edad) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
