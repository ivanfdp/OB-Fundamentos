/*
Primera parte:
 - Crear una función con tres parámetros que sean números que se suman entre sí.
 - Llamar a la función en el main y darle valores.
*/

package com.OB.ejercicios.tema3_1;

public class Main {
    public static void main(String[] args) {
        sumaDeTres(10, 20, 30);
    }

    public static void sumaDeTres(int a, int b, int c) {
        int resultado;
        resultado = a +b + c;
        System.out.println(resultado);
    }
}