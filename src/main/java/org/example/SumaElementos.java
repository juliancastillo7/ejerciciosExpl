package org.example;

public class SumaElementos {

    // Método para acumular y sumar todos los valores numéricos del arreglo
    public int sumar(int[] arreglo) {
        // 1. Crea una variable 'suma' inicializada en 0 antes del ciclo for.
        int suma = 0;

        // 2. En el ciclo for, recorre cada posición del arreglo sumándola al acumulador.
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i]; // Equivalente a: suma = suma + arreglo[i]
        }

        // 3. Retorna la suma total acumulada.
        return suma;
    }
}