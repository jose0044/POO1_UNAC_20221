package co.edu.unac.poo1.unidad5.plantasMega;

import java.util.Objects;

public class MegaFrailejon extends MegaHerbacea {
    private Long consecutivo;

    public MegaFrailejon(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public MegaFrailejon(String nombre, Float altura, Integer edad, Float porcentajeAgua, Float porcentajeAguaRaiz, Long consecutivo) {
        super(nombre, altura, edad, porcentajeAgua, porcentajeAguaRaiz);
        this.consecutivo = consecutivo;
    }

    public MegaFrailejon(String estacion, Long consecutivo) {
        super(estacion);
        this.consecutivo = consecutivo;
    }

    public MegaFrailejon(String nombre, Float altura, Integer edad, Float porcentajeAgua, Float porcentajeAguaRaiz, String estacion, Long consecutivo) {
        super(nombre, altura, edad, porcentajeAgua, porcentajeAguaRaiz, estacion);
        this.consecutivo = consecutivo;
    }

    public Long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass()!=MegaFrailejon.class){
            return false;
        }
        MegaFrailejon megaFrailejonObj = (MegaFrailejon) obj;
        return Objects.equals(this.consecutivo, megaFrailejonObj.consecutivo) &&
                Objects.equals(this.altura, megaFrailejonObj.altura) &&
                Objects.equals(this.edad, megaFrailejonObj.edad) &&
                this.nombre.equals(megaFrailejonObj.nombre);
    }

    @Override
    public int hashCode() {
        return this.consecutivo.hashCode() +
                this.altura.hashCode() +
                this.edad.hashCode() +
                this.nombre.hashCode();
    }

    @Override
    public String toString() {
        return "MegaFrailejon{" +
                "consecutivo=" + consecutivo +
                ", nombre='" + nombre + '\'' +
                ", altura=" + altura +
                ", edad=" + edad +
                ", porcentajeAgua=" + porcentajeAgua +
                ", porcentajeAguaRaiz=" + porcentajeAguaRaiz +
                '}';
    }
}
