package co.edu.unac.poo1.unidad4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class Unidad4 {

    //Ver listado de ejemplos de Cafe
    public static void verCafesDeListaEjemplo(){
        Vector<Cafe> listaCafes = obtenerListaVectorCafes();
        /*Forma tradicional del for
        for(int i=0;i < listaCafes.size(); i++){
            System.out.println("Nombre del cafe "+listaCafes.get(i).getNombre());
        }*/

        //Forma mejorada del for, recorre toda la lista
        for(Cafe cafeActual : listaCafes){
            mostrarCafePorPantalla(cafeActual);
        }
    }

    //Funcion que muestra los cafes ordenados por altura, de menor a mayor
    //NOTA: Vector es mas lento que arrayList, por lo que veremos su uso a manera de ejemplo SOLO en este ejercicio
    public static void mostrarCafesOrdenadosAlturaMenorMayor(){
        Vector<Cafe> listaCafes = obtenerListaVectorCafes();
        //Lista de salida
        Vector<Cafe> listaCafesOrdenados = new Vector<>();
        Cafe cafeAlturaMenor;
        int indiceCafeAlturaMenor;
        while (listaCafesOrdenados.size() < listaCafes.size()) {
            for (Cafe cafeActual : listaCafes) {
                //Se toma el primer elemento de la lista como el cafe de altura menor con su indice
                cafeAlturaMenor = cafeActual;
                indiceCafeAlturaMenor = listaCafes.indexOf(cafeActual);
                for (Cafe cafeActualRestante : listaCafes) {
                    //Se valida que no haya valores nulos, si estan nulos es porque ya fueron eliminados
                    if (cafeActual!=null && cafeActualRestante !=null) {
                        //Si el cafe que sigue en la lista, es menor en altura, que el primer elemento de la lista, se
                        //actualiza el valor e indice del cafe altura menor
                        if (cafeActual.getAltura() > cafeActualRestante.getAltura()) {
                            cafeAlturaMenor = cafeActualRestante;
                            indiceCafeAlturaMenor = listaCafes.indexOf(cafeActualRestante);
                        }
                    }
                }
                //Agregar el cafe altura menor a la lista y hacer un setNull
                if (cafeAlturaMenor != null) {
                    listaCafes.set(indiceCafeAlturaMenor, null);
                    listaCafesOrdenados.add(cafeAlturaMenor);
                }
            }
        }
        System.out.println("--CAFES ORDENADOS POR ALTURA DE MENOR A MAYOR--");
        for(Cafe cafeActual : listaCafesOrdenados){
            mostrarCafePorPantalla(cafeActual);
        }
    }

    //Mostrar los cafes que su edad es multiplo de un numero dado por pantalla
    public static void mostrarCafesEdadMultiploNumeroDado(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba un numero, para buscar los cafes con edad multiplo de este");
        Integer numeroUsuario = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Cafe> listaCafes = obtenerListaArrayListCafes();
        for(Cafe cafeActual : listaCafes){
            if(cafeActual.getEdad() % numeroUsuario == 0){
                mostrarCafePorPantalla(cafeActual);
            }
        }
    }

    private static void mostrarCafePorPantalla(Cafe cafeActual){
        System.out.println("Nombre:"+cafeActual.getNombre());
        System.out.println("Altura: "+cafeActual.getAltura());
        System.out.println("Sabor: "+cafeActual.getSabor());
        System.out.println("Edad: "+cafeActual.getEdad());
    }
    private static Vector<Cafe> obtenerListaVectorCafes(){
        Cafe cafe1 = new Cafe("cafe arabiga joven",
                1400, 6, "arabiga",
                "suave",1.5F);

        Cafe cafe2 = new Cafe("cafe arabiga",
                1400, 8, "arabiga",
                "suave",1.1F);

        Cafe cafe3 = new Cafe("cafe bourbon",
                1600, 2, "bourbon",
                "dulce",3F);

        Cafe cafe4 = new Cafe("old coffee bourbon",
                1150, 9, "bourbon",
                "dulce",2.6F);

        Cafe cafe5 = new Cafe("small coffee bourbon",
                1920, 6, "bourbon",
                "dulce",1F);

        Vector<Cafe> listaCafes = new Vector<>();
        listaCafes.add(cafe1);
        listaCafes.add(cafe2);
        listaCafes.add(cafe3);
        listaCafes.add(cafe4);
        listaCafes.add(cafe5);
        return listaCafes;
    }

    private static ArrayList<Cafe> obtenerListaArrayListCafes(){
        Vector<Cafe> listaCafes = obtenerListaVectorCafes();
        return new ArrayList<>(listaCafes);
    }
}
