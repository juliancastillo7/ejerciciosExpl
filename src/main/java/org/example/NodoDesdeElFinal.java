package org.example;

public class NodoDesdeElFinal {
    Nodo cabeza;

    // Método para encontrar un nodo a N pasos desde el final sin conocer el tamaño total de la lista
    public Nodo obtenerNthDesdeElFinal(int n) {
        // 1. Usa dos punteros ('Rápido' y 'Lento') posicionados inicialmente en la Cabeza.
        Nodo rapido = cabeza;
        Nodo lento = cabeza;

        // 2. Avanza el puntero 'Rápido' exactamente N pasos primero para crear una distancia de separación.
        for (int i = 0; i < n; i++) {
            if (rapido == null) return null; // Evita errores si N es mayor que el tamaño de la lista
            rapido = rapido.siguiente;
        }

        // 3. Mueve ambos punteros (Rápido y Lento) de 1 en 1 paso hasta que Rápido llegue a null.
        while (rapido != null) {
            rapido = rapido.siguiente;
            lento = lento.siguiente; // En ese momento, Lento estará ubicado exactamente en el nodo buscado.
        }

        return lento;
    }
}
