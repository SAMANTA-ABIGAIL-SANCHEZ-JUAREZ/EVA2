/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {
       int cantidad;
       int califas;
       String nombres[];
       Scanner captu = new Scanner(System.in);
       System.out.println("Cantidad de calificaciones a capturar:");
       cantidad= captu.nextInt();
       captu.nextLine();
       califas = new int[cantidad];
       nombres = new String[cantidad];
       for(int i = 0; i < califas.length; i++){
           System.out.println("Calificaion estudiante #:" + i);
           califas[i] = captu.nextInt();
           captu.nextLine();
       }
       //IMPRIMIR CALIFICACIONES
       for(int i = 0; i < califas.length; i++){
           System.out.print(califas[i] +" - " );
           
           
       }
    }
}
