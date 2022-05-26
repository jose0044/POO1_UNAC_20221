package co.edu.unac.poo1.unidad5.plantasMega;

//Extends se usa para indicar herencia
public class MegaHerbacea extends MegaPlanta {
    private String estacion;

    public MegaHerbacea(){
        super();
    }

    public MegaHerbacea(String nombre, Float altura, Integer edad, Float porcentajeAgua, Float porcentajeAguaRaiz) {
        super(nombre, altura, edad, porcentajeAgua, porcentajeAguaRaiz);
    }

    public MegaHerbacea(String estacion) {
        this.estacion = estacion;
    }

    public MegaHerbacea(String nombre, Float altura, Integer edad, Float porcentajeAgua, Float porcentajeAguaRaiz, String estacion) {
        super(nombre, altura, edad, porcentajeAgua, porcentajeAguaRaiz);
        this.estacion = estacion;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }
}
