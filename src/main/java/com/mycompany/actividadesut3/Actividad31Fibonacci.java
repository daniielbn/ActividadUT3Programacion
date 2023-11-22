/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesut3;

/**
 *
 * @author Daniel
 */
public class Actividad31Fibonacci {
    public static void FibonacciString(int longitud) {
        int anterior = 1;
        int anAnterior = 1;
        String resultado = "1, 1"; // Como necesitamos imprimir la serie de Fibonacci tenemos que almacenar el resultado en un String para luego imprimirla.
        int siguiente; // Declaramos la variable siguiente fuera del bucle for ya que si no lo hiciesemos así no la podríamos usar fuera del bucle
        for (int i = 0; i < longitud; i++) {
            /*
                Anterior = 1      ||  = 1   ||  = 2
                AnAnterior = 1    ||  = 2   ||  = 3
                Siguiente = 2     ||  = 3   ||  = 5
            
                Para calcular Siguente debemos hacer Siguiente = Anterior + AnAnterior
                Una vez que hayamos calcuado Siguiente necesitamos que el valor de AnAnterior se almacene en la variable Anterior, y que el valor de la variable Siguiente se almacene en AnAnterior
                necesitamos un cambio de variable
                si AnAnterior = 1 tenemos que Anterior = AnAnterior
                y Siguiente = 2 tenemos que AnAnterior = Siguiente
            
            */
            siguiente = anterior + anAnterior; // 2(siguiente) = 1(anterior) + 1(anAnterior)
            anterior = anAnterior;             // 1(anterior) = 1(anAnterior)
            anAnterior = siguiente;            // 1(anAnterior) = 2(siguiente)
            resultado = resultado + ", " + siguiente; // Almacenamos toda la serie en la String resultado
        }
        System.out.println(resultado);
    }
    
    public static void FibonacciArray(int semilla1, int semilla2, int longitud) {
        if (longitud <= 1) {
            System.out.println("La longitud debe ser mayor a 1.");
        } else {
            int Fibonacci[] = new int[longitud]; // Creamos un array con la longitud que se desee realizar la serie de Fibonacci
            Fibonacci[0] = semilla1; // Ponemos en la primera posición del array la semilla 1 de la sucesión.
            Fibonacci[1] = semilla2; // Ponemos en la segunda posición del arrày la semilla 2 de la suceción.
            String resultado = Fibonacci[0] + ", " + Fibonacci[1]; // Inicializamos el String con el que vamos a imprimir la serie de Fibonacci entera.
            for (int i = 2; i < Fibonacci.length; i++) { // Este bucle crea la sucesión sumando el anterior y el anterior del anterior, para dar resultado a la suma de esos números. Inicia en 2 ya que la posición 0 y 1 ya estan asignadas en el vector.
                Fibonacci[i] = Fibonacci[i - 1] + Fibonacci[i - 2]; // Calculo de siguiente = anterior + anAnterior.
            }
            for (int j = 2; j < Fibonacci.length; j++) { // Bucle para almacenar los variables del array en el String para poder imprimir el resultado
                resultado = resultado + ", " + Fibonacci[j];
            }
            System.out.println(resultado);
        }
    }
}
