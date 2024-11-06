/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclos_arreglos;

/**
 *
 * @author sanch
 */
public class EVA2_14_CICLOS_ARREGLOS {

    public static void main(String[] args) {
       
        int dato, valores[];//un solo arreglos --> valores
        int[] datos, x, y, z;//todos son arreglos
        int[] arreglo = new int[1000];
        
        for (int i = 0; i <arreglo.length; i++){//asignar valores
            arreglo[i] = (int)(Math.random()* 100);
            System.out.print(arreglo[i] + " - ");
        
    }
        //System.out.println(arreglo); SOLO IMPRIME LA DIRECCION EN MI 
    }
}
