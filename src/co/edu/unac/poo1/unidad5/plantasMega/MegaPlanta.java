package co.edu.unac.poo1.unidad5.plantasMega;

public class MegaPlanta implements AccionesPlantas {

    protected String nombre;
    protected Float altura;
    protected Integer edad;
    protected Float porcentajeAgua;
    protected Float porcentajeAguaRaiz;

    public MegaPlanta() {
    }

    public MegaPlanta(String nombre, Float altura, Integer edad, Float porcentajeAgua, Float porcentajeAguaRaiz) {
        this.nombre = nombre;
        this.altura = altura;
        this.edad = edad;
        this.porcentajeAgua = porcentajeAgua;
        this.porcentajeAguaRaiz = porcentajeAguaRaiz;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Float getPorcentajeAgua() {
        return porcentajeAgua;
    }

    public void setPorcentajeAgua(Float porcentajeAgua) {
        this.porcentajeAgua = porcentajeAgua;
    }

    public Float getPorcentajeAguaRaiz() {
        return porcentajeAguaRaiz;
    }

    public void setPorcentajeAguaRaiz(Float porcentajeAguaRaiz) {
        this.porcentajeAguaRaiz = porcentajeAguaRaiz;
    }

    @Override
    public Float crecimiento(Float ultimaAltura) {
        return ultimaAltura - this.altura;
    }

    @Override
    public Boolean alimentarse(Float ultimoPorcentajeAgua) {
        return ultimoPorcentajeAgua > this.porcentajeAgua;
    }

    @Override
    public Boolean marchitarse() {
        return this.porcentajeAguaRaiz <= 0;
    }
}
