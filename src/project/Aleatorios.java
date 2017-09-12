/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author JOHN JAIRO
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    void obtenerDatos() {
        // TODO code application logic here
        String aux = "";
        String funcion = "";
        int semilla = 0;
        int iteraciones = 0;
        
        
        
        semilla = Integer.parseInt(aux = JOptionPane.showInputDialog("Ingrese la semilla: "));
        iteraciones = Integer.parseInt(aux = JOptionPane.showInputDialog("Ingrese la cantidad de iteraciones: "));
        funcion = JOptionPane.showInputDialog("Ingrese la función: ");
        
        //primera formula T(x) = (x+2)(x^2)
        //segunda formula G(x) = x/33
        
        int x[] = new int [iteraciones];
        int u[] = new int [iteraciones];
        
        for (int i = 0; i < x.length; i++){
            x[i] = (semilla+2)*(semilla^2);
        }
        for (int i = 0; i < x.length; i++){
            u[i] = x[i] / 33;
        }
        
        System.out.println("Aleatorios función transicion:        Aleatorios función final:");
        
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]+"                                   "+u[i]);
        }
        
        
    }
    
}
