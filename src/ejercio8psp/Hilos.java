/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio8psp;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Óscar
 */
public class Hilos {

    private static int semaforo;

    public Hilos() {
    }

    public synchronized void hilo1() {

        if (semaforo != 011) {
            do {
                try {
                    System.out.println("hilo1 en espera");
                    wait();
                    System.out.println("hilo1 termina de esperar");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (semaforo != 011);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo1 i=" + (i + 1));
            semaforo = 111;
        }
        System.out.println("Hilo1 Finalizado\n");
    }

    public synchronized void hilo2() {

        if (semaforo != 001) {
            do {
                try {
                    System.out.println("hilo2 en espera");
                    wait();
                    System.out.println("hilo2 termina de esperar");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Hilos.class.getName()).log(Level.SEVERE, null, ex);
                }
            } while (semaforo != 001);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo2 i=" + (i + 1));
            semaforo = 011;
            notifyAll();
        }
        System.out.println("Hilo2 Finalizado\n");

    }

    public synchronized void hilo3() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hilo3 i=" + (i + 1));
            semaforo = 001;
            notifyAll();
        }
        System.out.println("Hilo3 Finalizado\n");
    }

}
