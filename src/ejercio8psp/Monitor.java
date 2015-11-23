/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercio8psp;

/**
 *
 * @author Óscar
 */
public class Monitor extends Thread {

    Hilos h;
    private int numero;

    public Monitor(int n, Hilos h) {
        this.h = h;
        numero = n;
    }

    @Override
    public void run() {

        if (numero == 3) {
            h.hilo3();
        } else if (numero == 2) {
            h.hilo2();
        } else if (numero == 1) {
            h.hilo1();
        }

    }

}
