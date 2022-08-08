/*
En este ejercicio practicarás las estructuras de control, para ello deberás crear:

- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
- Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.
- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
- Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */
package com.OB.ejercicios.tema4_1;

public class Main {

    public static int numeroIf = 1;
    public static int numeroWhile = 0;

    public static String estacion = "verano";

    public static void main(String[] args) {
        numeroIf(numeroIf);
        numeroWhile(numeroWhile);
        doWhile(numeroWhile);
        forLoop();
        switchCase(estacion);
    }

    public static void numeroIf(int numeroIf) {
        System.out.println("If, if else, else");
        if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número " + numeroIf + " es negativo");
        } else {
            System.out.println("El número " + numeroIf + " es cero");
        }
    }

    public static void numeroWhile(int numeroWhile) {
        System.out.println("While");
        while (numeroWhile < 3) {
            System.out.println("El número actual es " + numeroWhile);
            numeroWhile++;
        }
    }

    public static void doWhile(int numeroWhile) {
        System.out.println("Do While");
        do {
            System.out.println("El número actual es " + numeroWhile);
        } while (numeroWhile == 3);
    }

    public static void forLoop() {
        System.out.println("For Loop");
        for (int numeroFor = 0; numeroFor <= 3 ; numeroFor++) {
            System.out.println("El número actual es " +numeroFor);
        }
    }

    private static void switchCase(String estacion) {
        System.out.println("Switch");

        switch (estacion) {
            case "invierno" -> System.out.println("Es invierno");
            case "primavera" -> System.out.println("Es primavera");
            case "verano" -> System.out.println("Es verano");
            case "otoño" -> System.out.println("Es otoño");
            default -> System.out.println("No has especificado ninguna estación");
        }
    }
}
