package co.edu.unac.poo1.unidad1.plantas;

public class FrailejonSimple {
    private PlantaSimjple plantaSimjple;
    private Integer altura;

    public FrailejonSimple() {
    }

    public FrailejonSimple(PlantaSimjple plantaSimjple, Integer altura) {
        this.plantaSimjple = plantaSimjple;
        this.altura = altura;
    }

    public PlantaSimjple getPlanta() {
        return plantaSimjple;
    }

    public void setPlanta(PlantaSimjple plantaSimjple) {
        this.plantaSimjple = plantaSimjple;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }
}
