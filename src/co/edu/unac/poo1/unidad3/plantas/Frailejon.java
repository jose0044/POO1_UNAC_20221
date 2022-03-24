package co.edu.unac.poo1.unidad3.plantas;

public class Frailejon extends Herbacea {

    private Float porcentajeAgua;

    public Frailejon() {
        super();
    }

    public Frailejon (String nombre,Integer altura, Integer edad,Float porcentajeAgua){
       super(nombre,altura,edad);
       this.porcentajeAgua = porcentajeAgua;
    }

    public Float getPorcentajeAgua() {
        return porcentajeAgua;
    }

    public void setPorcentajeAgua(Float porcentajeAgua) {
        this.porcentajeAgua = porcentajeAgua;
    }
}
