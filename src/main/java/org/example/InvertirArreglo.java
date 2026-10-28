package org.example;

public class InvertirArreglo {

    // Método para invertir los valores directamente en el mismo arreglo sin crear uno nuevo
    public void invertir(int[] arreglo) {
        // 1. Crea dos punteros: 'inicio' en la primera posición (0) y 'fin' en la última (length - 1).
        int inicio = 0;
        int fin = arreglo.length - 1;

        // 2. En un while que se ejecuta mientras inicio sea menor que fin, intercambia valores.
        while (inicio < fin) {
            // Guarda temporalmente el valor de inicio para no perderlo
            int temp = arreglo[inicio];
            // Pasa el valor del extremo final al extremo inicial
            arreglo[inicio] = arreglo[fin];
            // Pasa el valor guardado en temp al extremo final
            arreglo[fin] = temp;

            // 3. Acerca los punteros hacia el centro: incrementa inicio y decrementa fin.
            inicio++;
            fin--;
        }
    }
}