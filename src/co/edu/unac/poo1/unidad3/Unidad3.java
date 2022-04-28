package co.edu.unac.poo1.unidad3;

import co.edu.unac.poo1.unidad3.plantas.Florales;
import co.edu.unac.poo1.unidad3.plantas.Frailejon;
import co.edu.unac.poo1.unidad3.plantas.Petalo;

import java.util.Scanner;

public class Unidad3 {
    public static void crearArregloFrailejones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese cuantos Frailejones desea crear:");
        Integer numeroFrailejones = 0;
        numeroFrailejones = scanner.nextInt();
        scanner.nextLine();

        Frailejon[] arregloFrailejones = new Frailejon[numeroFrailejones];

        for(int i=0; i < arregloFrailejones.length; i++){
            arregloFrailejones[i] = llenarFrailejon();
        }
        mostrarArregloFrailejones(arregloFrailejones);
    }

    private static Frailejon llenarFrailejon(){
        Scanner scanner = new Scanner(System.in);
        String nombre = "";
        Integer altura = 0;
        Integer edad = 0;
        Float porcentajeAgua = 0f;
        System.out.println("Por favor escriba los datos del Frailejon");
        System.out.println("NOMBRE");
        nombre = scanner.nextLine();
        System.out.println("ALTURA");
        altura = scanner.nextInt();
        scanner.nextLine();
        System.out.println("EDAD");
        edad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("PORCENTAJE DE AGUA QUE ALMACENA");
        porcentajeAgua = scanner.nextFloat();
        scanner.nextLine();
        return new Frailejon(nombre, altura, edad, porcentajeAgua);
    }

    private static void mostrarArregloFrailejones(Frailejon[] arregloFrailejones){
        System.out.println("------------Estos son los Frailejones creados------------");
        for(int i=0; i < arregloFrailejones.length; i++){
            System.out.println("Frailejon # " + (i+1));
            System.out.println("NOMBRE: " + arregloFrailejones[i].getNombre());
            System.out.println("ALTURA: " + arregloFrailejones[i].getAltura());
            System.out.println("EDAD: " + arregloFrailejones[i].getEdad());
            System.out.println("PORCENTAJE DE AGUA QUE ALMACENA: "+ arregloFrailejones[i].getPorcentajeAgua());
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void crearArreglosFloralesYVerUnoAlAzar(){
        /*PREVIO A ESTE METODO: Complete la clase Florales, agregando 2 atributos mas y un vector de tipo Petalo.
         * Este tipo NO hereda de planta y debe tener minimo 3 atributos*/

        /*Cree una funcion que defina un arreglo de 6 Florales (con mas de un Petalo cada una) y luego usando
         * math.random entre 1 y 6, muestre por pantalla la flor en la posicion correspondiente*/

        Petalo petaloBlanco = new Petalo("blanco", 6f, 0.23f);
        Petalo petaloCrema = new Petalo("crema", 5f, 0.13f);
        Petalo petaloAmarillo = new Petalo("amarillo", 6f, 0.33f);
        Petalo petaloAmarilloPalido = new Petalo("amarillo palido", 7f, 0.16f);
        Petalo petaloMorado = new Petalo("morado", 8f, 0.63f);
        Petalo petaloLila = new Petalo("lila", 9f, 0.65f);
        Petalo petaloRojo = new Petalo("rojo", 12f, 0.50f);
        Petalo petaloRosa = new Petalo("rosado", 11f, 0.85f);

        Florales flor1 = new Florales("Flor 1", 16, 2, "fuerte",
                23f, new Petalo[]{petaloBlanco, petaloRojo});
        Florales flor2 = new Florales("Flor 2", 12, 3, "suave",
                22f, new Petalo[]{petaloBlanco, petaloRojo, petaloAmarillo, petaloMorado});
        Florales flor3 = new Florales("Flor 3", 18, 1, "imperceptible",
                31f, new Petalo[]{petaloCrema, petaloLila});
        Florales flor4 = new Florales("Flor 4", 22, 3, "picante",
                20f, new Petalo[]{petaloCrema, petaloRosa});
        Florales flor5 = new Florales("Flor 5", 20, 4, "dulce",
                18f, new Petalo[]{petaloAmarilloPalido, petaloCrema, petaloRosa});
        Florales flor6 = new Florales("Flor 6", 17, 5, "fetido",
                19f, new Petalo[]{petaloLila, petaloRojo});

        Florales[] arregloFlores = new Florales[]{flor1, flor2, flor3, flor4, flor5, flor6};
        int posicionAleatoria = (int) (Math.random()*(6 - 1) + 1); //Se hace el random entre 1 y 6, pero la pos. es de 0 a 5
        verFlorPorPantalla(arregloFlores[posicionAleatoria-1]);
    }

    private static void verFlorPorPantalla(Florales flor){
        System.out.println("-------------FLOR--------------");
        System.out.println("NOMBRE: " + flor.getNombre());
        System.out.println("ALTURA: " + flor.getAltura() + "cms");
        System.out.println("EDAD: " + flor.getEdad() + " meses");
        System.out.println("TIPO DE POLEN: " + flor.getTipoDePolen());
        System.out.println("TEMP. RECOMENDADA: " + flor.getTemperatura() + "º");
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        System.out.println("------------PETALOS------------");
        for(int i=0; i<flor.getPetalos().length; i++){
            System.out.println("*******************************");
            System.out.println("PETALO #"+ (i+1));
            System.out.println("COLOR: "+ flor.getPetalos()[i].getColor());
            System.out.println("LARGO: "+ flor.getPetalos()[i].getLargo());
            System.out.println("GROSOR: "+ flor.getPetalos()[i].getGrosor());
            System.out.println("*******************************");
        }
    }

    public static void unirVectoresFrailejones(){
        /*Crear dos arreglos de 3 Frailejones cada uno, con sus intancias.
        Luego crear un vector resultante con todos los Frailejones pero intercalados y mostarlo
        por pantalla, esto es:
        VECTOR 1 = {A,B,C}
        VECTOR 2 = {D,E,F}

        VECTOR RESULTANTE = {A,D,B,E,C,F}
        */
        Frailejon frailejon1 = new Frailejon("Ernesto Perez", 23, 6, 70.5f);
        Frailejon frailejon2 = new Frailejon("Francisco Perez", 28, 6, 80f);
        Frailejon frailejon3 = new Frailejon("Andrea Perez", 13, 4, 60.15f);
        Frailejon frailejon4 = new Frailejon("Maria Perez", 30, 8, 90.9f);
        Frailejon frailejon5 = new Frailejon("Lina Perez", 12, 3, 74.3f);
        Frailejon frailejon6 = new Frailejon("Carlos Perez", 50, 16, 75.9f);

        Frailejon[] frailejones1 = new Frailejon[]{frailejon1, frailejon2, frailejon3};
        Frailejon[] frailejones2 = new Frailejon[]{frailejon4, frailejon5, frailejon6};

        Frailejon[] arregloFrailejones = new Frailejon[6];

        //Ciclo para las posiciones pares
        for(int i=0; i<arregloFrailejones.length; i+=2){
            arregloFrailejones[i] = frailejones1[i/2];
        }
        //Ciclo para las posiciones impares
        for(int i=1; i<arregloFrailejones.length; i+=2){
            arregloFrailejones[i] = frailejones2[i/2];
        }
        //Mostrar arreglo final por pantalla
        mostrarArregloFrailejones(arregloFrailejones);
    }
}
