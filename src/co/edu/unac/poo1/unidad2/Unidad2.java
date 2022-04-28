package co.edu.unac.poo1.unidad2;

import co.edu.unac.poo1.unidad1.plantas.FrailejonSimple;
import co.edu.unac.poo1.unidad1.plantas.PlantaSimjple;

public class Unidad2 {

    //Quiz #3
    public static void quiz3(){
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

    public static void mostrarArregloFrailejones(){
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

    public static void sumarMatricesOrden4(){
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
