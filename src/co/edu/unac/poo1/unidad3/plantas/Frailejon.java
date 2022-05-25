package co.edu.unac.poo1.unidad3.plantas;

public class Frailejon extends Herbacea {

    private Long consecutivo;
    private Float porcentajeAgua;

    public Frailejon() {
        super();
    }

    public Frailejon (String nombre,Integer altura, Integer edad,Float porcentajeAgua){
       super(nombre,altura,edad);
       this.porcentajeAgua = porcentajeAgua;
    }

    public Frailejon (Long consecutivo, String nombre,Integer altura, Integer edad,Float porcentajeAgua){
        super(nombre,altura,edad);
        this.consecutivo = consecutivo;
        this.porcentajeAgua = porcentajeAgua;
    }

    public Long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Float getPorcentajeAgua() {
        return porcentajeAgua;
    }

    public void setPorcentajeAgua(Float porcentajeAgua) {
        this.porcentajeAgua = porcentajeAgua;
    }

    public static Frailejon procesarLineaArchivoPlano(String linea){
        Frailejon frailejon = new Frailejon();
        String []lineaFrailejon = linea.split("\\|");
        String []lineaTexto = lineaFrailejon[0].split("CONSECUTIVO:");
        frailejon.consecutivo = Long.valueOf(lineaTexto[1]);
        lineaTexto = lineaFrailejon[1].split("NOMBRE:");
        frailejon.nombre = lineaTexto[1];
        lineaTexto = lineaFrailejon[2].split("ALTURA:");
        frailejon.altura = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaFrailejon[3].split("EDAD:");
        frailejon.edad = Integer.valueOf(lineaTexto[1]);
        lineaTexto = lineaFrailejon[4].split("PORCENTAJE AGUA:");
        frailejon.porcentajeAgua = Float.valueOf(lineaTexto[1]);

        return frailejon;
    }
}
