package co.edu.unac.poo1.unidad5.estudiante;

import java.util.Scanner;

public abstract class AccionesEstudiante {
    protected String carnet;
    protected String primeraPalabra;

    public Boolean matricularse(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el recibo de pago del estudiante:");
        String reciboPago = scanner.nextLine();
        return (!reciboPago.equalsIgnoreCase("")) &&
                Long.parseLong(reciboPago) > 0L;
    }
    public abstract Boolean estudiar();
}
