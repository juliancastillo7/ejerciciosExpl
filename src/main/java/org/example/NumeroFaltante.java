package org.example;

public class NumeroFaltante {

    // Método matemático para hallar el número faltante en una secuencia de 1 a N
    public static int encontrar(int[] arreglo, int n) {
        // 1. Calcula la suma ideal teórica usando la fórmula matemática: N * (N + 1) / 2.
        int sumaIdeal = n * (n + 1) / 2;

        // 2. Suma de forma real todos los elementos presentes en el arreglo recibido.
        int sumaReal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaReal += arreglo[i];
        }

        // 3. La resta de la suma ideal menos la suma real nos da exactamente el número faltante.
        int faltante = sumaIdeal - sumaReal;

        return faltante;
    }
}