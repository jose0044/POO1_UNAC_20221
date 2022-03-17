package co.edu.unac.poo1;

import co.edu.unac.poo1.plantas.Frailejon;
import co.edu.unac.poo1.plantas.Planta;
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
            System.out.println("5. Quiz #3");
            System.out.println("6. Ver arreglo de Frailejones");
            System.out.println("7. Ver suma de matrices de Orden 4");
            System.out.println("8. Salir de la aplicacion");
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
                    System.out.println("Hasta pronto");
                    break;
                default:
                    System.err.println("ERROR: Opcion invalida");
                    break;
            }

        }while(opcionMenu!=7);
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
        Planta planta1 = new Planta("Frailejon", 20, 40);
        Frailejon frailejon1 = new Frailejon(planta1, 65);
        Planta planta2 = new Planta("Frailejon gigante", 60, 80);
        Frailejon frailejon2 = new Frailejon(planta2, 80);
        Planta planta3 = new Planta("Frailejon mini", 4, 1);
        Frailejon frailejon3 = new Frailejon(planta3, 19);

        verAlturaFrailejonDivisorExacto(frailejon1,2);
        verAlturaFrailejonDivisorExacto(frailejon2,2);
        verAlturaFrailejonDivisorExacto(frailejon3,2);

        mostrarMensajeFrailejon(frailejon1);
        mostrarMensajeFrailejon(frailejon2);
        mostrarMensajeFrailejon(frailejon3);
    }

    private static void verAlturaFrailejonDivisorExacto(Frailejon frailejon, Integer n){
        if(frailejon.getAltura() % n == 0){
            System.out.println("El nombre del Frailejon es "+frailejon.getPlanta().getNombre());
            System.out.println("La altura del Frailejon es "+frailejon.getAltura());
        }
    }

    private static void mostrarMensajeFrailejon(Frailejon frailejon){
        System.out.println("Ernesto Perez tiene "+frailejon.getPlanta().getNumeroHojas() +
                           " hojas y tiene "+frailejon.getPlanta().getEdad() + " años y"+
                           " una altura de "+frailejon.getAltura());
    }

    private static void mostrarArregloFrailejones(){
        Planta planta1 = new Planta("Frailejon", 20, 40);
        Planta planta2 = new Planta("Frailejon gigante", 60, 80);
        Planta planta3 = new Planta("Frailejon mini", 4, 1);
        //Crear un arreglo de Frailejones
        Frailejon[] arregloFrailejones = new Frailejon[3];
        arregloFrailejones[0] = new Frailejon(planta1, 65);
        arregloFrailejones[1] = new Frailejon(planta2, 80);
        arregloFrailejones[2] = new Frailejon(planta3, 19);

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
}
