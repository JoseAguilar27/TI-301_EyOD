package tema3_EstructurasNoLineales.recursividad;

public class InvertirArreglo {

    //Invertir arreglo
    public static void reverseArray(int[] data, int low, int high) { // metodo para invertir un arreglo (nombre del arreglo, pocision inicial (0), pocision final)
        if (low < high) { //Continuar solo si low es menor que high, cuando low >= high, significa que ya invertimos todo el arreglo
            int temp = data[low]; //Intercambiar los elementos en las posiciones low y high, guardar temporalmente el valor de la posición low
            data[low] = data[high];// Mover el valor de high a low
            data[high] = temp;// Mover el valor temporal (original de low) a high
            reverseArray(data, low + 1, high - 1);
            /* Llamar recursivamente para el siguiente par de elementos, low aumenta en 1 (se mueve hacia la derecha)
                                                   high disminuye en 1 (se mueve hacia la izquierda)*/
        }
    }
}
