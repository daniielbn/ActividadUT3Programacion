/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadesut3;

/**
 *
 * @author Daniel
 */
public class ActividadesUT3 {

    public static void main(String[] args) {
//        Actividad31Fibonacci.FibonacciString(10);
//        Actividad31Fibonacci.FibonacciArray(1, 1, 2);
        String frase = "Hola caracola pepsicola maradona";
            Actividad32Vocales.mostrarFrase(frase);
            System.out.println("\n================================================");
            Actividad32Vocales.contarVocales(frase);
            System.out.println("================================================");
            Actividad32Vocales.contarVocalesArray(frase);
            char[] letras = {'e', 'o', 'j', 'm', 'r'};
            System.out.println("================================================");
            Actividad32Vocales.contarVocales(frase, letras);
            System.out.println("================================================");
            System.out.println(frase);
    }
}
