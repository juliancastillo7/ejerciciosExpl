package org.example;

public class DetectarBucle {
    Nodo cabeza;

    // Método basado en el algoritmo de la liebre y la tortuga para saber si la lista es infinita (tiene un bucle)
    public boolean tieneBucle() {
        Nodo lento = cabeza;
        Nodo rapido = cabeza;

        // Recorre mientras el puntero rápido y su sucesor no sean nulos
        while (rapido != null && rapido.siguiente != null) {
            // 1. El puntero Lento avanza de 1 en 1 paso: lento = lento.siguiente.
            lento = lento.siguiente;
            // 2. El puntero Rápido avanza de 2 en 2 pasos: rapido = rapido.siguiente.siguiente.
            rapido = rapido.siguiente.siguiente;

            // 3. Si en algún momento se cruzan y coinciden (lento == rapido), significa que hay un círculo y retorna true.
            if (lento == rapido) {
                return true;
            }
        }
        // Si el ciclo termina con normalidad, la lista no tiene bucle y retorna false.
        return false;
    }
}