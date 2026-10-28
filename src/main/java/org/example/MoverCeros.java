package org.example;

public class MoverCeros {

    // Método para reacomodar los elementos poniendo todos los ceros al final
    public void mover(int[] arreglo) {
        // 1. Crea un puntero 'idxNoCero' que comienza en 0 para registrar dónde colocar números válidos.
        int idxNoCero = 0;

        // 2. Recorre el arreglo. Si encuentras un número distinto de 0, colócalo en 'arreglo[idxNoCero]' y avanza el puntero.
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != 0) {
                arreglo[idxNoCero] = arreglo[i];
                idxNoCero++;
            }
        }

        // 3. Haz otro ciclo desde donde quedó 'idxNoCero' hasta el final del arreglo rellenando con ceros (0s).
        while (idxNoCero < arreglo.length) {
            arreglo[idxNoCero] = 0;
            idxNoCero++;
        }
    }
}
