package tema4_Ordenamiento;

import java.util.Random ;
public class OrdenamientoBurbuja {

    

    public class OrdenamientoBurbujaMillon {

        /**
         * Método que implementa el algoritmo de ordenamiento burbuja
         *
         * @param arreglo El arreglo a ordenar
         */
        public static void ordenarBurbuja(int[] arreglo) {
            int n = arreglo.length;
            boolean intercambiado;

            for (int i = 0; i < n - 1; i++) {
                intercambiado = false;

                for (int j = 0; j < n - i - 1; j++) {
                    if (arreglo[j] > arreglo[j + 1]) {
                        // Intercambiar elementos
                        int temp = arreglo[j];
                        arreglo[j] = arreglo[j + 1];
                        arreglo[j + 1] = temp;
                        intercambiado = true;
                    }
                }

                // Si no hubo intercambios, el arreglo ya está ordenado
                if (!intercambiado) {
                    break;
                }

                // Mostrar progreso cada 10,000 iteraciones
                if (i % 10000 == 0 && i > 0) {
                    System.out.println("Progreso: " + (i * 100 / n) + "% completado");
                }
            }
        }

        /**
         * Método para generar un arreglo con números aleatorios
         *
         * @param tamaño Tamaño del arreglo
         * @param min Valor mínimo
         * @param max Valor máximo
         * @return Arreglo con números aleatorios
         */
        public static int[] generarArregloAleatorio(int tamaño, int min, int max) {
            int[] arreglo = new int[tamaño];
            Random random = new Random();

            for (int i = 0; i < tamaño; i++) {
                arreglo[i] = random.nextInt(max - min + 1) + min;
            }

            return arreglo;
        }

        /**
         * Método para imprimir los primeros y últimos elementos de un arreglo
         *
         * @param arreglo El arreglo a mostrar
         * @param cantidad Cantidad de elementos a mostrar al inicio y al final
         */
        public static void mostrarArregloLimitado(int[] arreglo, int cantidad) {
            System.out.println("Primeros " + cantidad + " elementos:");
            for (int i = 0; i < Math.min(cantidad, arreglo.length); i++) {
                System.out.print(arreglo[i] + " ");
            }

            System.out.println("\n\nÚltimos " + cantidad + " elementos:");
            for (int i = Math.max(0, arreglo.length - cantidad); i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }
            System.out.println();
        }

        /**
         * Método para verificar si un arreglo está ordenado
         *
         * @param arreglo El arreglo a verificar
         * @return true si está ordenado, false en caso contrario
         */
        public static boolean estaOrdenado(int[] arreglo) {
            for (int i = 0; i < arreglo.length - 1; i++) {
                if (arreglo[i] > arreglo[i + 1]) {
                    return false;
                }
            }
            return true;
        }

    }
}
