package co.edu.unac.poo1.unidad3.plantas;

public class Frutales extends Planta {
    private String nombreFruta;
    private Integer mesesMaduracion;

    public Frutales(String nombre, Integer altura, Integer edad,
                    String nombreFruta, Integer mesesMaduracion) {
        super(nombre, altura, edad);
        this.nombreFruta = nombreFruta;
        this.mesesMaduracion = mesesMaduracion;
    }

    public String getNombreFruta() {
        return nombreFruta;
    }

    public void setNombreFruta(String nombreFruta) {
        this.nombreFruta = nombreFruta;
    }

    public Integer getMesesMaduracion() {
        return mesesMaduracion;
    }

    public void setMesesMaduracion(Integer mesesMaduracion) {
        this.mesesMaduracion = mesesMaduracion;
    }
}
