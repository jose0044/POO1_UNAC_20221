package co.edu.unac.poo1;

import co.edu.unac.poo1.unidad1.globo.Globo;
import co.edu.unac.poo1.unidad1.moto.Moto;
import co.edu.unac.poo1.unidad1.moto.accesorios.Casco;
import co.edu.unac.poo1.unidad1.moto.accesorios.Visor;

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
            System.out.println("5. Salir de la aplicacion");
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
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.err.println("ERROR: Opcion invalida");
                    break;
            }

        }while(opcionMenu!=5);
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
        +" y de visor color " +cascoSpartan.getVisor().getColor());
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("El casco " +cascoAgv.getMarca()+" es de color " +cascoAgv.getColor()
        +" y de visor color " +cascoAgv.getVisor().getColor());
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

        System.out.println("La moto es modelo " + motoBryan.getModelo()
        +" con un tamaño "+motoBryan.getTamano()+" y de color "+ motoBryan.getColor());
    }
}
