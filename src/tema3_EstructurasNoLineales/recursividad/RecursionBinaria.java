package tema3_EstructurasNoLineales.recursividad;

public class RecursionBinaria {

    //sumar elementos de un arreglo 
    public static int binarySum(int[] data, int low, int high) {
        if (low > high) {  //Si el rango no es válido (low > high)
            return 0; // No hay elementos para sumar, retornar 0
        } else if (low == high) { //Si solo hay un elemento en el rango
            return data[low];  // Retornar el único elemento
            //Si hay más de un elemento en el rango
        } else {
            int mid = (low + high) / 2; // Calcular el punto medio del arreglo
            return binarySum(data, low, mid) + binarySum(data, mid + 1, high); /*Dividir el problema en dos partes y sumar los resultados:
                                                                                 Sumar la mitad izquierda del arreglo (desde low hasta mid)
                                                                                 Sumar la mitad derecha del arreglo (desde mid+1 hasta high)*/
        }
    }
}
