package co.edu.unac.poo1.unidad3.plantas;

public class Florales extends Planta {
    private String tipoDePolen;
    private Float temperatura;
    private Petalo[] petalos;

    public Florales() {
        super();
    }

    public Florales(String nombre, Integer altura, Integer edad, String tipoDePolen,
                    Float temperatura, Petalo[] petalos) {
        super(nombre, altura, edad);
        this.tipoDePolen = tipoDePolen;
        this.temperatura = temperatura;
        this.petalos = petalos;
    }

    public String getTipoDePolen() {
        return tipoDePolen;
    }

    public void setTipoDePolen(String tipoDePolen) {
        this.tipoDePolen = tipoDePolen;
    }

    public Float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Float temperatura) {
        this.temperatura = temperatura;
    }

    public Petalo[] getPetalos() {
        return petalos;
    }

    public void setPetalos(Petalo[] petalos) {
        this.petalos = petalos;
    }
}
