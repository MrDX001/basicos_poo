package interfaz;

import logica.CapturaTeclado;
import logica.EjemploCiclo;
import logica.EjemploCondicional;

public class Principal {

    public static void main(String[] args) {

        System.out.println("Ejemplo de captura");
        CapturaTeclado ct = new CapturaTeclado();
        ct.operacion();
        System.out.println("Ejemplo de condicional");
        EjemploCondicional ec= new EjemploCondicional();
        ec.operacion();
        System.out.println("Ejemplo de ciclos");
        EjemploCiclos el = new EjemploCiclo();
        el.operacion();
    }
    

}
