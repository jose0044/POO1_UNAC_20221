package co.edu.unac.poo1;

import co.edu.unac.poo1.unidad1.globo.Globo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //saludo();
        //saludoConNombre();
        ejemploGlobos();
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

    private static void ejemploGlobos(){
        Globo globo = new Globo("Michelin", "Aerostatico", 8);
        Globo globo2 = new Globo("Pirelli", "Mini aerostatico", 2);
        //Vamos a sugerir una marca y tipo de globo de acuerdo al numero de personas dado por el usuario
        Integer numeroPersonasUsuario;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el numero de personas que iran en el globo");
        numeroPersonasUsuario = scanner.nextInt();

        if(numeroPersonasUsuario > 0 && numeroPersonasUsuario <= 2){
            System.out.println("El globo recomendado es el "+globo2);
        }
        //El AND en Java es con &&
        else if(numeroPersonasUsuario > 2 && numeroPersonasUsuario <=8){
            System.out.println("El globo recomendado es el "+globo);
        }
        else{
            System.out.println("No hay Globo disponible en el momento");
        }
    }
}
