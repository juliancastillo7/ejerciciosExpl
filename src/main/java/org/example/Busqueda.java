package org.example;

public class Busqueda {

    // Método para buscar un valor en un arreglo y devolver su índice o -1 si no existe
    public int buscar(int[] arreglo, int valor) {
        // 1. Haz un for desde 0 hasta la longitud (Length) del arreglo.
        for (int i = 0; i < arreglo.length; i++) {
            // 2. Si el elemento actual en el arreglo es igual al valor buscado, retorna 'i' (O(n)).
            if (arreglo[i] == valor) {
                return i;
            }
        }
        // 3. Fuera del ciclo, si nunca coincidió, retorna -1 indicando que no está.
        return -1;
    }
}