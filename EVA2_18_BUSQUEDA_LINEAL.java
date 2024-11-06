/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    int[] datos = {5, 45, 11, 94, 32, 64, 85, 77, 56, 19};
    int valor, posi = -1;
    Scanner captu = new Scanner(System.in);
    System.out.println("Valor a encontrar:");
    valor = captu.nextInt();
    for (int i = 0; < datos.length; i++){
        if(valor == datos[i]){
            //regresar la posicion
            posi = i;
            //detener el ciclo
            break;
        }
        
    }
    if(posi == -1)
         System.out.println("VALOR NO ENCONTRADO");
    else
         System.out.println("El valor esta en la posicion " + posi);
    }
}

