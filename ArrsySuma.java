/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrsysuma;

import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class ArrsySuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double suma = 0;
        int num;
        Scanner ent = new Scanner(System.in);
        System.out.println("Cuantos numeros desea sumar?");
        num = ent.nextInt();
        double [] numeros; 
        numeros = new double [num];
        for (int i = 0; i < num; i++){
            System.out.println("Ingrese el numero");
            numeros[i] = ent.nextInt();
            suma += numeros[i];
        
        }
        System.out.println("La suma de los numeros es: "+ suma);
    }
    
}
