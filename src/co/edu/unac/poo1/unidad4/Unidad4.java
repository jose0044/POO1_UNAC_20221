package co.edu.unac.poo1.unidad4;

import co.edu.unac.poo1.unidad3.plantas.Frailejon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Unidad4 {

    //NOTA: Recuerde cambiar la ruta del archivo aqui disponible por la ruta en su equipo
    private static final String RUTA_ARCHIVO_CAFES = "/Users/jjaramillo/Documents/TallerIS/2022-1/POO/CodigoCurso/src/co/edu/unac/poo1/unidad4/cafes.txt";
    private static final String RUTA_ARCHIVO_FRAILEJONES = "/Users/jjaramillo/Documents/TallerIS/2022-1/POO/CodigoCurso/src/co/edu/unac/poo1/unidad4/frailejones.txt";

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

    //Ver listado de ejemplos de Frailejones
    public static void verListaFrailejones(){
        for(Frailejon frailejonActual : leerArchivoPlanoFrailejones()){
            mostrarFrailejonPorPantalla(frailejonActual);
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

    public static void quizListas5Pct(){
        System.out.println("ENUNCIADO:");
        System.out.println("Crear 5 instancias de Cafe, agruparlas en una lista, luego");
        System.out.println("mostrar por pantalla 2 instancias primas (aquellas donde");
        System.out.println("el campo sizeBean es un numero primo).");
        System.out.println("----------------------------------------------------------");

        ArrayList<Cafe> listaCafes = obtenerListaArrayListCafes();
        int contadorInstancias = 0;
        for (Cafe cafeActual : listaCafes) {
            if (contadorInstancias < 2) {
                if (esPrimo(cafeActual.getSizeBean().intValue())) {
                    mostrarCafePorPantalla(cafeActual);
                    contadorInstancias++;
                }
            } else {
                break;
            }
        }
    }
    /**
     * Cree un mapa de frailejones, luego busque aquellos frailejones
     * cuya suma total de porcentaje de agua sea igual a 1
     * y luego remueva del mapa ese listado de frailejones,
     * muestre luego el numero total de frailejones que quedaron en el mapa
     * */
    public static void quizMayo18Frailejones (){
        HashMap<Long, Frailejon> mapaFrailejones = new HashMap<>();
        ArrayList<Long> idsFrailejonesBorrar = new ArrayList<>();
        Float sumaPorcentajes = 0f;
        for( Frailejon frailejonActual : leerArchivoPlanoFrailejones()){
            sumaPorcentajes += frailejonActual.getPorcentajeAgua();
            if(sumaPorcentajes <= 1){
                idsFrailejonesBorrar.add(frailejonActual.getConsecutivo());
            }
            mapaFrailejones.put(frailejonActual.getConsecutivo(), frailejonActual);
        }

        for(Long idFrailejonBorrar : idsFrailejonesBorrar){
            mapaFrailejones.remove(idFrailejonBorrar);
        }
        System.out.println("El total de Frailejones es: "+mapaFrailejones.size());
    }

    /**
     * Cree un mapa de Cafe, luego busque aquellos cafes
     * cuya altura y edad sean numeros primos
     * y luego remueva del mapa ese listado de Cafes,
     * muestre luego el numero total de Cafes que quedaron en el mapa
     * */
    public static void quizMayo18Cafes() {
        HashMap<String, Cafe> mapaCafes = new HashMap<>();
        for (Cafe cafeActual : obtenerListaArrayListCafes()) {
            if (!(esPrimo(cafeActual.getAltura()) && esPrimo(cafeActual.getEdad()))){
                mapaCafes.put(cafeActual.getSerial(), cafeActual);
            }
        }
        System.out.println("El total de cafés es:" + (mapaCafes.size()));

    }
    public static void verTablasMultiplicar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escriba un numero por pantalla");
        int numeroLimite = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        for(int i=1;i<=numeroLimite; i++){
            listaNumeros.add(i);
        }

        for(Integer numero1: listaNumeros){
            System.out.println("Tabla del "+ numero1 + ":");
            for(Integer numero2 : listaNumeros){
                System.out.println(numero1 +" X "+numero2 +" = "+numero1*numero2);
            }
            System.out.println("----------------------");
        }
    }

    //Crear 5 instancias de cafe, pida un serial por pantalla e imprima los datos del cafe solicitado
    public static void verCafeEnMapa(){
        HashMap<String, Cafe> mapaCafes = new HashMap<>();
        for(Cafe cafeActual : obtenerListaArrayListCafes()){
            mapaCafes.put(cafeActual.getSerial(), cafeActual);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escriba un serial de un cafe");
        String serialCafe = scanner.nextLine();
        Cafe cafeConsultado = mapaCafes.get(serialCafe);
        if(cafeConsultado != null){
            mostrarCafePorPantalla(cafeConsultado);
        } else{
            System.out.println("El cafe consultado no existe");
        }
    }

    public static boolean esPrimo(Integer numero){
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void mostrarCafePorPantalla(Cafe cafeActual){
        System.out.println("Serial:"+cafeActual.getSerial());
        System.out.println("Nombre:"+cafeActual.getNombre());
        System.out.println("Altura: "+cafeActual.getAltura());
        System.out.println("Sabor: "+cafeActual.getSabor());
        System.out.println("Edad: "+cafeActual.getEdad());
        System.out.println("Tamaño del grano: "+cafeActual.getSizeBean());
    }

    private static void mostrarFrailejonPorPantalla(Frailejon frailejonActual){
        System.out.println("Consecutivo:"+frailejonActual.getConsecutivo());
        System.out.println("Nombre:"+frailejonActual.getNombre());
        System.out.println("Altura: "+frailejonActual.getAltura());
        System.out.println("Edad: "+frailejonActual.getEdad());
        System.out.println("Porcentaje de Agua: "+Math.round(frailejonActual.getPorcentajeAgua()*100.0)+"%");
    }
    private static Vector<Cafe> obtenerListaVectorCafes(){
        return new Vector<>(leerArchivoPlanoCafes());
    }

    public static ArrayList<Cafe> obtenerListaArrayListCafes(){
        Vector<Cafe> listaCafes = obtenerListaVectorCafes();
        return new ArrayList<>(listaCafes);
    }

    public static List<Cafe> leerArchivoPlanoCafes() {
        Stream<String> lines = null;
        Path pathArchvioPlano = Paths.get(RUTA_ARCHIVO_CAFES);
        ArrayList<Cafe> listaCafes = new ArrayList<>();
        try {
            lines = Files.lines(pathArchvioPlano);
            List<String> datos = lines.collect(Collectors.toList());
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
            for (String dato : datos) {
                Cafe nuevoCafe = Cafe.procesarLineaArchivoPlano(dato);
                listaCafes.add(nuevoCafe);
            }
        } catch (IOException ioex){
            System.err.println("Error de IO al leer el archivo plano " + ioex.getMessage());
        } finally {
            assert lines != null;
            lines.close();
        }
        return listaCafes;
    }

    public static List<Frailejon> leerArchivoPlanoFrailejones() {
        Stream<String> lines = null;
        Path pathArchvioPlano = Paths.get(RUTA_ARCHIVO_FRAILEJONES);
        ArrayList<Frailejon> listaFrailejones = new ArrayList<>();
        try {
            lines = Files.lines(pathArchvioPlano);
            List<String> datos = lines.collect(Collectors.toList());
            System.out.println(ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME));
            for (String dato : datos) {
                Frailejon frailejon = Frailejon.procesarLineaArchivoPlano(dato);
                listaFrailejones.add(frailejon);
            }
        } catch (IOException ioex){
            System.err.println("Error de IO al leer el archivo plano " + ioex.getMessage());
        } finally {
            assert lines != null;
            lines.close();
        }
        return listaFrailejones;
    }
}
