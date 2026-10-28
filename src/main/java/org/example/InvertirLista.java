package org.example;

public class InvertirLista {
    Nodo cabeza;

    // Método de entrevista para voltear los enlaces de la lista (A->B->null pasa a B->A->null)
    public void invertir() {
        // 1. Inicializa 3 punteros: prev en null, actual en la Cabeza, y sig en null.
        Nodo prev = null;
        Nodo actual = cabeza;
        Nodo sig = null;

        // Recorre mientras 'actual' tenga nodos por procesar
        while (actual != null) {
            // 2. En el while, guarda temporalmente el siguiente nodo: sig = actual.siguiente.
            sig = actual.siguiente;
            // 3. Invierte la flecha del nodo actual para que apunte hacia atrás: actual.siguiente = prev.
            actual.siguiente = prev;
            // 4. Avanza los punteros para la siguiente iteración: prev = actual, y actual = sig.
            prev = actual;
            actual = sig;
        }
        // Al terminar, 'prev' se convierte en la nueva Cabeza de la lista invertida.
        cabeza = prev;
    }
}