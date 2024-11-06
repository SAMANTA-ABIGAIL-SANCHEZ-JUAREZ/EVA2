/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author sanch
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
        
        final String USUSARIO = "Admin";
        final String PASSWORD = "Admin";
        //final doble PI = 3.1416;
        String usuario = null, pwd;
        String contraseña;
        Scanner captu = new Scanner(System.in);
        System.out.println(usuario);
        usuario = captu.nextLine();
        System.out.println("Password");
        pwd = captu.nextLine();
        Object USUARIO = null;
        //Como validamos el acceso?
        if(usuario.equals(USUARIO) && pwd.equals(PASSWORD)){
            System.out.println("ACCESO CONCEDIDO!!");
    }while(usuario.equals("Admin")&& pwd.equals("1234"));
    System.out.println("BIENVENIDO!!!");
    }
}
