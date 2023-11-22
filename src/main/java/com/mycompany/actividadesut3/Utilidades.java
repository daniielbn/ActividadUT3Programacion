/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesut3;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Utilidades {
    public static void mostrar(String texto) {
        System.out.println(texto);
    }
    
    public static int pedirValores (String texto) {
        mostrar(texto);
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
    
    public static int pedirValores (String texto, int Max) {
        Scanner in = new Scanner(System.in);
        int edad = in.nextInt();
        while (edad > Max) {
            System.out.println("La edad supera el límite. Vuelve a introducir una edad: ");
            edad = in.nextInt();
        }
        return edad;
    }
    
    public static int pedirValores (String texto, int Max, int Min) {
        Scanner in = new Scanner(System.in);
        int edad = in.nextInt();
        while(edad > Max || edad < Min) {
            if(edad > Max) {
                System.out.println("La edad supera el límite. Vuelva a introducir una edad: ");
                edad = in.nextInt();
            } else if (edad < Min) {
                System.out.println("La edad está por debajo del límite. Vuelva a introducir una edad: ");
                edad = in.nextInt();
            }
        }
        return edad;
    }
    
    public static int pedirValores (int Min, String texto) {
        Scanner in = new Scanner(System.in);
        int edad = in.nextInt();
        while (edad < Min) {
            System.out.println("La edad está por debajo del límite. Vuelve a introducir una edad: ");
            edad = in.nextInt();
        }
        return edad;
    }
}
