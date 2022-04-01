package co.edu.unac.poo1;

import co.edu.unac.poo1.unidad1.plantas.FrailejonSimple;
import co.edu.unac.poo1.unidad1.plantas.PlantaSimjple;
import co.edu.unac.poo1.unidad1.globo.Globo;
import co.edu.unac.poo1.unidad1.moto.Moto;
import co.edu.unac.poo1.unidad1.moto.accesorios.Casco;
import co.edu.unac.poo1.unidad1.moto.accesorios.Visor;
import co.edu.unac.poo1.unidad3.plantas.Florales;
import co.edu.unac.poo1.unidad3.plantas.Frailejon;
import co.edu.unac.poo1.unidad3.plantas.Petalo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //saludo();
        //saludoConNombre();

        int opcionMenu = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Bienvenido a la aplicacion de transportes");
            System.out.println("Por favor digite una opcion");
            System.out.println("1. Ver Globos existentes");
            System.out.println("2. Recomendar un tipo de Globo");
            System.out.println("3. Ver tipos de Cascos");
            System.out.println("4. Registrar y ver una moto");
            System.out.println("5. Quiz #3");
            System.out.println("6. Ver arreglo de Frailejones");
            System.out.println("7. Ver suma de matrices de Orden 4");
            System.out.println("8. Crear y ver arreglo de Frailejones");
            System.out.println("9. Crear un arreglo de 6 flores y ver una al azar usando Random");
            System.out.println("10. Salir de la aplicacion");
            opcionMenu = scanner.nextInt();
            scanner.nextLine(); //Se agrega para procesar el enter despues de digitar un numero
            switch(opcionMenu){
                case 1:
                    verTodosLosGlobos();
                    break;
                case 2:
                    verGloboPorNumeroPersonas();
                    break;
                case 3:
                    verCascosCreados();
                    break;
                case 4:
                    registrarYVerMoto();
                    break;
                case 5:
                    quiz3();
                    break;
                case 6:
                    mostrarArregloFrailejones();
                    break;
                case 7:
                    sumarMatricesOrden4();
                    break;
                case 8:
                    crearArregloFrailejones();
                    break;
                case 9:
                    crearArreglosFloralesYVerUnoAlAzar();
                    break;
                case 10:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.err.println("ERROR: Opcion invalida");
                    break;
            }

        }while(opcionMenu!=10);
    }

    private static void saludo(){
        System.out.println("Bienvenidos al curso de POO1");
        System.out.print("Exitos");
        System.out.print(" en el semestre");
    }

    private static void saludoConNombre(){
        String nombre = new String();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escriba su nombre");
        nombre = scanner.nextLine();
        System.out.println("Bienvenido "+nombre+" al curso de POO1");
    }

    private static void verTodosLosGlobos(){
        Globo globo = new Globo("Michelin", "Aerostatico", 8);
        Globo globo2 = new Globo("Pirelli", "Mini aerostatico", 2);
        System.out.println("Globos existentes");
        System.out.println(("--------------------------------------------------"));
        System.out.println("MARCA: " + globo.getMarca());
        System.out.println("TIPO: "+ globo.getTipoGlobo());
        System.out.println("CAPACIDAD: "+ globo.getCapacidadPersonas());
        System.out.println(("--------------------------------------------------"));
        System.out.println("MARCA: "+ globo2.getMarca());
        System.out.println("TIPO: "+ globo2.getTipoGlobo());
        System.out.println("CAPACIDAD: "+ globo2.getCapacidadPersonas());
        System.out.println(("--------------------------------------------------"));
    }

    private static void verGloboPorNumeroPersonas(){
        Globo globo = new Globo("Michelin", "Aerostatico", 8);
        Globo globo2 = new Globo("Pirelli", "Mini aerostatico", 2);
        //Vamos a sugerir una marca y tipo de globo de acuerdo al numero de personas dado por el usuario
        Integer numeroPersonasUsuario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero de personas que iran en el globo");
        numeroPersonasUsuario = scanner.nextInt();

        if(numeroPersonasUsuario > 0 && numeroPersonasUsuario <= 2){
            System.out.println("El globo recomendado es el "+globo2.getMarca()
                    + " -> "+ globo2.getTipoGlobo());
        }
        //El AND en Java es con &&
        else if(numeroPersonasUsuario > 2 && numeroPersonasUsuario <=8){
            System.out.println("El globo recomendado es el "+globo.getMarca()
                    + " -> "+ globo.getTipoGlobo());
        }
        else{
            System.out.println("No hay Globo disponible en el momento");
        }
    }

    private static void verCascosCreados(){
        Visor visorSpartan = new Visor ("verde","vidrio");
        Visor visorAgv = new Visor ("negro", "acrilico");

        Casco cascoSpartan =  new Casco ("azul","m","Spartan",
                "completo","carbono",visorSpartan);

        Casco cascoAgv = new Casco ("rosado" , "l", "Agv",
                "racing", "fibra de vidrio",visorAgv);
        System.out.println("El casco " +cascoSpartan.getMarca()+" es de color " +cascoSpartan.getColor()
        + " y de visor color " +cascoSpartan.getVisor().getColor());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("El casco " +cascoAgv.getMarca()+" es de color " +cascoAgv.getColor()
        + " y de visor color " +cascoAgv.getVisor().getColor());
    }

    private static void registrarYVerMoto(){
        Scanner scanner = new Scanner(System.in);
        String color = "";
        Integer tamano = 0;
        Integer modelo = 0;

        System.out.println("Por favor ingrese los datos de la moto");
        System.out.println("Color");
        color = scanner.nextLine();
        System.out.println("Tamaño");
        tamano = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Modelo");
        modelo = scanner.nextInt();
        scanner.nextLine();

        Moto motoBryan = new Moto();
        motoBryan.setColor(color);
        motoBryan.setTamano(tamano);
        motoBryan.setModelo(modelo);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("La moto es modelo " + motoBryan.getModelo()
        + " con un tamaño "+motoBryan.getTamano()+" y de color "+ motoBryan.getColor());
        System.out.println("-------------------------------------------------------------------------");
    }

    //Quiz #3
    private static void quiz3(){
        PlantaSimjple plantaSimjple1 = new PlantaSimjple("Frailejon", 20, 40);
        FrailejonSimple frailejonSimple1 = new FrailejonSimple(plantaSimjple1, 65);
        PlantaSimjple plantaSimjple2 = new PlantaSimjple("Frailejon gigante", 60, 80);
        FrailejonSimple frailejonSimple2 = new FrailejonSimple(plantaSimjple2, 80);
        PlantaSimjple plantaSimjple3 = new PlantaSimjple("Frailejon mini", 4, 1);
        FrailejonSimple frailejonSimple3 = new FrailejonSimple(plantaSimjple3, 19);

        verAlturaFrailejonDivisorExacto(frailejonSimple1,2);
        verAlturaFrailejonDivisorExacto(frailejonSimple2,2);
        verAlturaFrailejonDivisorExacto(frailejonSimple3,2);

        mostrarMensajeFrailejon(frailejonSimple1);
        mostrarMensajeFrailejon(frailejonSimple2);
        mostrarMensajeFrailejon(frailejonSimple3);
    }

    private static void verAlturaFrailejonDivisorExacto(FrailejonSimple frailejonSimple, Integer n){
        if(frailejonSimple.getAltura() % n == 0){
            System.out.println("El nombre del Frailejon es "+ frailejonSimple.getPlanta().getNombre());
            System.out.println("La altura del Frailejon es "+ frailejonSimple.getAltura());
        }
    }

    private static void mostrarMensajeFrailejon(FrailejonSimple frailejonSimple){
        System.out.println("Ernesto Perez tiene "+ frailejonSimple.getPlanta().getNumeroHojas() +
                           " hojas y tiene "+ frailejonSimple.getPlanta().getEdad() + " años y"+
                           " una altura de "+ frailejonSimple.getAltura());
    }

    private static void mostrarArregloFrailejones(){
        PlantaSimjple plantaSimjple1 = new PlantaSimjple("Frailejon", 20, 40);
        PlantaSimjple plantaSimjple2 = new PlantaSimjple("Frailejon gigante", 60, 80);
        PlantaSimjple plantaSimjple3 = new PlantaSimjple("Frailejon mini", 4, 1);
        //Crear un arreglo de Frailejones
        FrailejonSimple[] arregloFrailejones = new FrailejonSimple[3];
        arregloFrailejones[0] = new FrailejonSimple(plantaSimjple1, 65);
        arregloFrailejones[1] = new FrailejonSimple(plantaSimjple2, 80);
        arregloFrailejones[2] = new FrailejonSimple(plantaSimjple3, 19);

        //Mostrar los frailejones del arreglo mediante un ciclo
        for(int k = 0; k < arregloFrailejones.length; k++){
            mostrarMensajeFrailejon(arregloFrailejones[k]);
        }
    }

    private static void sumarMatricesOrden4(){
        Integer[][] matriz1 = {{3,6,9,12}, {4,8,12,16}, {5,10,15,20}, {2,4,6,8}};
        Integer[][] matriz2 = {{6,21,18,24}, {7,14,21,28}, {9,18,27,36}, {1,2,3,4}};
        Integer[][] resultado = new Integer[4][4];

        //Suma de matrices (termino a termino) y se guarda en resultado
        for(int x=0;x<matriz1.length;x++){
            for(int y=0; y< matriz2.length; y++){
                resultado[x][y]= matriz1[x][y] + matriz2[x][y];
            }
        }

        //Imprimir matriz resultado
        for(int x=0;x<matriz1.length;x++){
            for(int y=0; y< matriz2.length; y++){
                System.out.print(resultado[x][y]+" ");
            }
            System.out.print("\n");
        }
    }

    private static void crearArregloFrailejones(){
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

    private static void crearArreglosFloralesYVerUnoAlAzar(){
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
}
