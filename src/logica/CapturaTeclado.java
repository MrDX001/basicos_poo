package logica;

import java.util.Scanner;

public class CapturaTeclado {

    public void operacion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre= sc.nextLine();
        System.out.println("Hola " + nombre);
    }

}
