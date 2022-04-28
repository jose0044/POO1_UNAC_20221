package co.edu.unac.poo1.unidad4;

import co.edu.unac.poo1.unidad3.plantas.Planta;

public class Cafe extends Planta {
    private String variedad;
    private String sabor;
    private Float sizeBean;

    public Cafe(){
        super();
    }
    public Cafe(String variedad, String sabor, Float sizeBean) {
        this.variedad = variedad;
        this.sabor = sabor;
        this.sizeBean = sizeBean;
    }

    public Cafe(String nombre, Integer altura, Integer edad, String variedad, String sabor, Float sizeBean) {
        super(nombre, altura, edad);
        this.variedad = variedad;
        this.sabor = sabor;
        this.sizeBean = sizeBean;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Float getSizeBean() {
        return sizeBean;
    }

    public void setSizeBean(Float sizeBean) {
        this.sizeBean = sizeBean;
    }
}
