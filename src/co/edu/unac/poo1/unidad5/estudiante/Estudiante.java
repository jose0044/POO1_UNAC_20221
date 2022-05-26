package co.edu.unac.poo1.unidad5.estudiante;

public class Estudiante extends AccionesEstudiante {
    private String cedula;
    private String nombre;
    private Float promedio;
    private Float concentracion;

    public Estudiante(String cedula, String nombre, Float promedio, Float concentracion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.promedio = promedio;
        this.concentracion = concentracion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPromedio() {
        return promedio;
    }

    public void setPromedio(Float promedio) {
        this.promedio = promedio;
    }

    public Float getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(Float concentracion) {
        this.concentracion = concentracion;
    }

    @Override
    public Boolean estudiar() {
        return concentracion >= 0.6F;
    }
}
