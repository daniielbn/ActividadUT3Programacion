/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesut3;

/**
 *
 * @author Daniel
 */
public class Actividad32Vocales {
    public static void mostrarFrase(String frase) {
        char[] caracteres = frase.toCharArray();
        
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print(caracteres[i]);
        }
    }
    public static void contarVocales(String frase) {
        int vocalA = 0;
        int vocalE = 0;
        int vocalI = 0;
        int vocalO = 0; 
        int vocalU = 0; // Declaración de contadores para saber cuantas vocales existen
        
        for (int i = 0; i < frase.length(); i++) {
            switch(frase.charAt(i)) {
                case 'a':
                    vocalA++;
                    break;
                case 'e':
                    vocalE++;
                    break;
                case 'i':
                    vocalI++;
                    break;
                case 'o':
                    vocalO++;
                    break;
                case 'u':
                    vocalU++;
                    break;     
            }
        }
        System.out.println("Hay un total de " + vocalA + " aes(A)");
        System.out.println("Hay un total de " + vocalE + " es(E)");
        System.out.println("Hay un total de " + vocalI + " ies(I)");
        System.out.println("Hay un total de " + vocalO + " oes(O)");
        System.out.println("Hay un total de " + vocalU + " ues(U)");
    }
    
    public static void contarVocalesArray(String frase) {
        int contadores[] = {0, 0, 0, 0, 0}; // Establecemos el orden de los contadores del índice 0 hasta el 4, siendo la posición 0 el contador de A, 1 el contador de E...
        
        for(int i = 0; i < frase.length(); i++) {
            switch(frase.charAt(i)) {
                case 'a':
                    contadores[0]++;
                    break;
                case 'e':
                    contadores[1]++;
                    break;
                case 'i':
                    contadores[2]++;
                    break;
                case 'o':
                    contadores[3]++;
                    break;
                case 'u':
                    contadores[4]++;
                    break;     
            }
        }
        System.out.println("Hay un total de " + contadores[0] + " aes(A)");
        System.out.println("Hay un total de " + contadores[1] + " es(E)");
        System.out.println("Hay un total de " + contadores[2] + " ies(I)");
        System.out.println("Hay un total de " + contadores[3] + " oes(O)");
        System.out.println("Hay un total de " + contadores[4] + " ues(U)");
    }
    
    public static void contarVocales(String frase, char[] letras) {
        int contador[] = new int[letras.length]; // La posición de la letra establece la posición de su contador dentro del array. Es decir, la posicion 0, corresponde a las veces que aparece la letra con posición 0.
        for (int i = 0; i < letras.length; i++) { // Bucle para recorrer cada letra del array letras[]
            for (int j = 0; j < frase.length(); j++) { // Bucle anidado para ir recorriendo la frase entera por cada posición del array letras[]
                if (letras[i] == frase.charAt(j)) { // Se compara si la letra[i] es igual que el caracter de la frase[j]. 
                    contador[i]++; // Se le suma uno al contador de la letra[i]
                }                
            }
            System.out.println("La letra " + letras[i] + " aparece " + contador[i] + " vez");
        }
    }
}
