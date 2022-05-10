package co.edu.unac.poo1.unidad1;

import co.edu.unac.poo1.unidad1.globo.Globo;
import co.edu.unac.poo1.unidad1.moto.Moto;
import co.edu.unac.poo1.unidad1.moto.accesorios.Casco;
import co.edu.unac.poo1.unidad1.moto.accesorios.Visor;
import co.edu.unac.poo1.unidad2.Unidad2;
import co.edu.unac.poo1.unidad3.Unidad3;
import co.edu.unac.poo1.unidad4.Unidad4;

import java.util.Scanner;

public class Unidad1 {

    private static final int MAXIMA_OPCION_MENU = 15;

    public static void menuPrincipal(){
        int opcionMenu;
        Scanner scanner = new Scanner(System.in);
        do{
            Unidad1.saludo();
            System.out.println("\nPor favor digite una opcion:");
            System.out.println("1. Ver Globos existentes");
            System.out.println("2. Recomendar un tipo de Globo");
            System.out.println("3. Ver tipos de Cascos");
            System.out.println("4. Registrar y ver una moto");
            System.out.println("5. Quiz #3");
            System.out.println("6. Ver arreglo de Frailejones");
            System.out.println("7. Ver suma de matrices de Orden 4");
            System.out.println("8. Crear y ver arreglo de Frailejones");
            System.out.println("9. Crear un arreglo de 6 flores y ver una al azar usando Random");
            System.out.println("10. Unir dos vectores de Frailejones");
            System.out.println("11. Ver lista de ejemplo de Cafes");
            System.out.println("12. Ver lista de Cafes ordenados por altura de menor a mayor");
            System.out.println("13. Ver lista de Cafes cuya edad es multiplo de un numero dado");
            System.out.println("14. Quiz de Listas, 5%");
            System.out.println("15. Salir de la aplicacion");
            opcionMenu = scanner.nextInt();
            scanner.nextLine(); //Se agrega para procesar el enter
            // despues de digitar un numero
            switch(opcionMenu){
                case 1:
                    Unidad1.verTodosLosGlobos();
                    break;
                case 2:
                    Unidad1.verGloboPorNumeroPersonas();
                    break;
                case 3:
                    Unidad1.verCascosCreados();
                    break;
                case 4:
                    Unidad1.registrarYVerMoto();
                    break;
                case 5:
                    Unidad2.quiz3();
                    break;
                case 6:
                    Unidad2.mostrarArregloFrailejones();
                    break;
                case 7:
                    Unidad2.sumarMatricesOrden4();
                    break;
                case 8:
                    Unidad3.crearArregloFrailejones();
                    break;
                case 9:
                    Unidad3.crearArreglosFloralesYVerUnoAlAzar();
                    break;
                case 10:
                    Unidad3.unirVectoresFrailejones();
                    break;
                case 11:
                    Unidad4.verCafesDeListaEjemplo();
                    break;
                case 12:
                    Unidad4.mostrarCafesOrdenadosAlturaMenorMayor();
                    break;
                case 13:
                    Unidad4.mostrarCafesEdadMultiploNumeroDado();
                    break;
                case 14:
                    Unidad4.quizListas5Pct();
                    break;
                case MAXIMA_OPCION_MENU:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.err.println("ERROR: Opcion invalida");
                    break;
            }

        }while(opcionMenu!=MAXIMA_OPCION_MENU);
    }

    public static void saludo(){
        System.out.print("Bienvenidos al curso de POO1, ");
        System.out.print("Exitos");
        System.out.print(" en el semestre!!");
    }

    public static void verTodosLosGlobos(){
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

    public static void verGloboPorNumeroPersonas(){
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

    public static void verCascosCreados(){
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

    public static void registrarYVerMoto(){
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
}
