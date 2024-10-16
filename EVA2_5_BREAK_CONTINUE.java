/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_break_continue;

/**
 *
 * @author sanch
 */
public class EVA2_5_BREAK_CONTINUE {

    public static void main(String[] args) {
        //BREACK --> termina el ciclo completamente
        //CONTINUE --> Interrumpe la repetición actual
        for(int i = 1; i <= 10; i++){
              if(i == 8)
            break;
            System.out.print(i + " - ");
        
        }
         System.out.print("");
           for(int i = 1; i <= 10; i++){
               if(i == 8)
                   continue;
               System.out.print(i + " - ");
           }
    }
}
