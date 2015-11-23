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
public class Ejercio8PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hilos h = new Hilos();

        new Monitor(1, h).start();
        new Monitor(2, h).start();
        new Monitor(3, h).start();
    }

}
