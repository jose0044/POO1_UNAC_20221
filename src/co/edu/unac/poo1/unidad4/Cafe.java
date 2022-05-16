package co.edu.unac.poo1.unidad4;

import co.edu.unac.poo1.unidad3.plantas.Planta;

public class Cafe extends Planta {
    private String serial;
    private String variedad;
    private String sabor;
    private Float sizeBean;

    public Cafe(){
        super();
    }

    public Cafe(String serial, String nombre, Integer altura, Integer edad, String variedad, String sabor, Float sizeBean) {
        super(nombre, altura, edad);
        this.serial = serial;
        this.variedad = variedad;
        this.sabor = sabor;
        this.sizeBean = sizeBean;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
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

    public static Cafe procesarLineaArchivoPlano(String linea){
        Cafe cafe = new Cafe();
        String []lineaCafe = linea.split("\\|");
        String []lineaTexto = lineaCafe[0].split("SERIAL:");
        cafe.serial = lineaTexto[1];
        lineaTexto = lineaCafe[1].split("NOMBRE:");
        cafe.nombre = lineaTexto[1];
        lineaTexto = lineaCafe[2].split("ALTURA:");
        cafe.altura = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[3].split("EDAD:");
        cafe.edad = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaCafe[4].split("VARIEDAD:");
        cafe.variedad = lineaTexto[1];
        lineaTexto = lineaCafe[5].split("SABOR:");
        cafe.sabor = lineaTexto[1];
        lineaTexto = lineaCafe[6].split("TAMAÑO:");
        cafe.sizeBean = Float.valueOf(lineaTexto[1]);

        return cafe;
    }
}
