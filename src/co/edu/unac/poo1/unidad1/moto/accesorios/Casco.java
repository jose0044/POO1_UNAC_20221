package co.edu.unac.poo1.unidad1.moto.accesorios;

public class Casco {

    private String color;
    private String talla;
    private String marca;
    private String tipo;
    private String material;
    private Visor visor;

    public boolean abrir(){
        return false;
    }

    public void abrochar(){
    }

    public Casco(){
    }

    public Casco(String color, String talla, String marca,
                 String tipo, String material, Visor visor){
        this.color = color;
        this.talla = talla;
        this.marca = marca;
        this.tipo = tipo;
        this.material = material;
        this.visor = visor;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getTalla(){
        return this.talla;
    }

    public void setTalla(String talla){
        this.talla = talla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Visor getVisor(){
        return this.visor;
    }

    public void setVisor(Visor visor){
        this.visor = visor;
    }




}
