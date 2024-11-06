/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_11_NUMERO_MAYOR {

    public static void main(String[] args) {
        int numEntero, x, y = 0;
   Scanner captu = new Scanner(System.in);
   while(true){
        System.out.println("Numero correspondiente (1 - 10): ");
        numEntero = captu.nextInt();
        if(numEntero > y){
            y = (y - y) + numEntero;
        }
        x = y;
        if(numEntero < 0)
            break;
        
    }
   System.out.println("El mayor es: " + x);
}
}
