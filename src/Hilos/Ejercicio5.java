package Hilos;

import static java.lang.Thread.MAX_PRIORITY;
import static java.lang.Thread.MIN_PRIORITY;

/**
 *
 * @author dpazolopez
 */
public class Ejercicio5 extends Thread {

    public Ejercicio5(String nom) {
        super(nom);
    }

    public static void main(String[] args) {

        Ejercicio5 H1 = new Ejercicio5("Hilo1");
        Ejercicio5 H2 = new Ejercicio5("Hilo2");
        H2.setPriority(MAX_PRIORITY);
        H1.setPriority(MIN_PRIORITY);
        H2.start();
        H1.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName());
        }

    }
}
