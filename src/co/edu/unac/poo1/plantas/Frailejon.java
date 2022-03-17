package co.edu.unac.poo1.plantas;

public class Frailejon {
    private Planta planta;
    private Integer altura;

    public Frailejon() {
    }

    public Frailejon(Planta planta, Integer altura) {
        this.planta = planta;
        this.altura = altura;
    }

    public Planta getPlanta() {
        return planta;
    }

    public void setPlanta(Planta planta) {
        this.planta = planta;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
}
