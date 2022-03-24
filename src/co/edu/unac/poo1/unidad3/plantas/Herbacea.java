package co.edu.unac.poo1.unidad3.plantas;

//Extends se usa para indicar herencia
public class Herbacea extends Planta {
    private String estacion;

    //Constructor de la clase Herbacea (hija de Planta)

    public Herbacea(){
        super();
    }

    public Herbacea(String nombre, Integer altura, Integer edad, String estacion){
        //Para llamar al constructor de la clase padre, podemos usar super
        super(nombre, altura, edad);
        this.estacion = estacion;
    }

    public Herbacea(String nombre, Integer altura, Integer edad){
        //Para llamar al constructor de la clase padre, podemos usar super
        super(nombre, altura, edad);
    }

}
