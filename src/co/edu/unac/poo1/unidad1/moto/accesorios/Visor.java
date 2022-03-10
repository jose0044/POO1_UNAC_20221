package co.edu.unac.poo1.unidad1.moto.accesorios;

public class Visor {
    private String color;
    private String material;

    public void subir(){
    }

    public void bajar(){
    }

    public Visor(){
    }

    public Visor(String color, String material){
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
