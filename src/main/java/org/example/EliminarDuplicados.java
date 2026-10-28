package org.example;

public class EliminarDuplicados {
    Nodo cabeza;

    // Método para limpiar duplicados consecutivos en una lista que ya se encuentra ordenada
    public void eliminar() {
        // 1. Inicializa un puntero 'actual' apuntando a la Cabeza.
        Nodo actual = cabeza;

        // Recorre la lista mientras haya nodos y un nodo siguiente disponible
        while (actual != null && actual.siguiente != null) {
            // 2. Si el dato actual es igual al siguiente dato, hay un duplicado: sáltalo conectando al que sigue del siguiente.
            if (actual.dato == actual.siguiente.dato) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                // 3. Si no son iguales, simplemente avanza de manera normal: actual = actual.siguiente.
                actual = actual.siguiente;
            }
        }
    }
}