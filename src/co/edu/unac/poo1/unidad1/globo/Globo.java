package co.edu.unac.poo1.unidad1.globo;

public class Globo {

    private String marca;
    private String tipoGlobo;
    private Integer capacidadPersonas;

    //Constructor por defecto
    public Globo(){
    }
    //Constructor con parametros
    public Globo(String marca, String tipoGlobo, Integer capacidadPersonas){
        //El this se usa para acceder a atributos y metodos de la clase
        this.marca = marca;
        this.tipoGlobo = tipoGlobo;
        this.capacidadPersonas = capacidadPersonas;
    }
    //Otro constructor con parametros
    public Globo(String marca, String tipoGlobo){
        //El this se usa para acceder a atributos y metodos de la clase
        this.marca = marca;
        this.tipoGlobo = tipoGlobo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoGlobo() {
        return tipoGlobo;
    }

    public void setTipoGlobo(String tipoGlobo) {
        this.tipoGlobo = tipoGlobo;
    }

    public Integer getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(Integer capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }
}
