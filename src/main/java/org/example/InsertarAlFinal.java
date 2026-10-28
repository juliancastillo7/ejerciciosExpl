package org.example;

public class InsertarAlFinal {
    Nodo cabeza; // Referencia al primer elemento de la lista

    // Método para agregar un nuevo nodo al final de la cola o lista
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // 1. Si la Cabeza es null, la lista está vacía, por lo que el nuevo nodo pasa a ser la Cabeza.
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            // 2. Si no, crea un puntero auxiliar 'actual = Cabeza' y recorre hasta que 'actual.siguiente == null'.
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            // 3. Asigna al último nodocontrado que su 'siguiente' sea el nuevoNodo.
            actual.siguiente = nuevoNodo;
        }
    }
}