/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JOHN JAIRO
 */
public class AlCuadrado {
    
    static void cuadradoNumero(){
        
        DecimalFormat dc = new DecimalFormat("#.####");
        
        int numero = 0;
        int cuadrado = 0;
        int longitud = 0;
        int mitad = 0;
        double valorFinal = 0;
        String aux = "";
        String cadena = "";
        String subCadena = "";
        
        aux = JOptionPane.showInputDialog("Ingrese el número a elevar al ^2: ");
        numero = Integer.parseInt(aux);
        
        cuadrado = numero * numero;
        
        cadena = String.valueOf(cuadrado);
        
        longitud = cadena.length();
        mitad = longitud / 2;
        
        if(longitud < 4){
            System.out.println("Con el número ingresado no se puede realizar la operación.");
        } else if (longitud == 4){
            subCadena = cadena.substring(0,3);
            valorFinal = Integer.parseInt(subCadena) / 10000;
            System.out.println("Valor final es: "+valorFinal);
        } else if (longitud > 4){
            subCadena = cadena.substring(mitad-2, mitad+2);
            valorFinal = Double.parseDouble(subCadena) / 10000;
            System.out.println("Valor final es: "+dc.format(valorFinal));
        }
        
    }
    
}
