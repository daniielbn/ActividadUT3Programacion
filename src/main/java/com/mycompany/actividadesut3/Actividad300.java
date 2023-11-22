/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadesut3;

/**
 *
 * @author Daniel
 */
public class Actividad300 {
    /*
        Crear una función que devuelva el cubo de un número
    */
    public static int cuboNumero(int num) {
        int cuadrado = num * num;
        return cuadrado;
    }
    
    /*
        Crear una función que devuelva cual es el número menor de dos números enteros
    */
    public static int numeroMenor(int num1, int num2) {
        if(num1 < num2) {
            return num1;
        } else {
            return num2;
        }
    }
    
    /*
        Crear una función que reciba un número y devuelva -1 si el número es negativo, 1 si el número es positivo o 0 si es cero.
    */
    public static int positvoNegativoCero(int num) {
        if (num == 0) {
            return 0;
        } else if (num < 0) {
            return -1;
        } else {
            return 1;
        }
    }
    
    /*
        Crear una función que devuelva el área de un rectángulo dada la base y la altura.
    */
    public static int areaTriangulo(int base, int alutra) {
        int area = (base * alutra) / 2;
        return area;
    }
    
    /*
        Crear una función que reciba como parámetro un numero entero y escriba la tabla de multiplicar de ese número (por ejemplo: para el 3 deberá llegar desde 3x1=3 hasta 3x10=30)
    */
    public static void tablaMultiplicar(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
    
    /* 
        Desarrolle una función que reciba un número y devuelva el valor 1 si es un número primo o 0 en caso contrari
    */
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % i == 0 && i != num) {
                return false;
            }
        }
        return true;
    }
    
    /*
        Crear una función que reciba un número cualquiera y que devuelva como resultado la suma de sus dígitos.
    */
    public static int sumaDigitos(int num) {
        int sumatorio = 0;
        while(num >= 10) {
            int digito = num % 10;
            sumatorio += digito;
            num = num / 10;
        }
        sumatorio += num;
        return sumatorio;
    }
    
    /*
        Crear una función que reciba una cadena cualquiera y que devuelva la cadena invertida.
    */
    public static String invertirCadena(String cadena) {
        char[] caracteres = cadena.toCharArray();
        int longitud = cadena.length();
        
        for (int i = 0; i < longitud / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[longitud - 1 - i];
            caracteres[longitud - 1 - i] = temp;
        }
        return new String(caracteres);
    }
}
