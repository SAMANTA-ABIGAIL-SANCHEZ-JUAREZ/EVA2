/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_8_Validar {

    public static void main(String[] args) {
       int dia;
       Scanner captu = new Scanner(System.in);
       do{
       System.out.println("Numero correspondiente al dia(1 - 7):");
       dia = captu.nextInt();
    }while(dia < 1 || dia > 7);
       switch(dia){
            case 1: 
                System.out.println("Lunes");
                break;//break //Utiliza instruccion - FIN DEL CASO 
                case 2: 
                System.out.println("Martes");
                break;//Utiliza instruccion - FIN DEL CASO 
                case 3: 
                System.out.println("Miercoles");
                break;//Utiliza instruccion - FIN DEL CASO 
                case 4: 
                System.out.println("Jueves");
                break;//Utiliza instruccion - FIN DEL CASO 
                case 5: 
                System.out.println("Viernes");
                break;//Utiliza instruccion - FIN DEL CASO 
                case 6: 
                System.out.println("Sabado");
                break;//Utiliza instruccion - FIN DEL CASO 
                case 7: 
                System.out.println("Domingo");
                break;//Utiliza instruccion - FIN DEL CASO 
                default: //OPCIONAL, SIN BREAK, ULTIMA SECCION DEL SWITCH
                     System.out.println("Numero no valido (deben ser entre 1 al 7):");
}
}
}