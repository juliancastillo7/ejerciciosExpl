package org.example;

// Clase que representa un nodo individual para formar las listas enlazadas
public class Nodo {
    int dato;          // Almacena el valor numérico del nodo
    Nodo siguiente;    // Referencia o "flecha" que apunta al siguiente nodo de la lista

    // Constructor para inicializar el nodo con un valor y su enlace en nulo
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}