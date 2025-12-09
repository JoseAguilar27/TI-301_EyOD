/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.estaOrdenado;
import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.generarArregloAleatorio;
import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.mostrarArregloLimitado;
import static tema4_Ordenamiento.OrdenamientoBurbuja.OrdenamientoBurbujaMillon.ordenarBurbuja;

/**
 *
 * @author Jose
 */
public class OrdenamientoBurbujaTest {
    public static void main(String[] args) {
            final int TAMANO = 1000000;  // Un millón de elementos
            final int ELEMENTOS_A_MOSTRAR = 10;

            System.out.println("=== ORDENAMIENTO BURBUJA CON 1,000,000 DE DATOS ===");
            System.out.println("Generando " + TAMANO + " números aleatorios...");

            // Generar arreglo aleatorio
            long inicioGeneracion = System.currentTimeMillis();
            int[] numeros = generarArregloAleatorio(TAMANO, 1, 1000000);
            long finGeneracion = System.currentTimeMillis();

            System.out.println("Generación completada en " + (finGeneracion - inicioGeneracion) + " ms");

            // Hacer una copia para mostrar el antes/después
            int[] copiaOriginal = numeros.clone();

            System.out.println("\n--- ANTES DE ORDENAR ---");
            mostrarArregloLimitado(copiaOriginal, ELEMENTOS_A_MOSTRAR);

            // Ordenar el arreglo usando el método burbuja
            System.out.println("\n--- INICIANDO ORDENAMIENTO BURBUJA ---");
            System.out.println("Este proceso puede tardar varios minutos debido a la complejidad O(n²)...");

            long inicioOrdenamiento = System.currentTimeMillis();
            ordenarBurbuja(numeros);
            long finOrdenamiento = System.currentTimeMillis();

            long tiempoOrdenamiento = finOrdenamiento - inicioOrdenamiento;

            // Verificar si está ordenado
            boolean ordenado = estaOrdenado(numeros);

            System.out.println("\n--- RESULTADOS ---");
            System.out.println("Tiempo de ordenamiento: " + tiempoOrdenamiento + " ms");
            System.out.println("Tiempo de ordenamiento: " + (tiempoOrdenamiento / 1000.0) + " segundos");
            System.out.println("Tiempo de ordenamiento: " + (tiempoOrdenamiento / 60000.0) + " minutos");
            System.out.println("¿Arreglo ordenado correctamente? " + (ordenado ? "SÍ" : "NO"));

            System.out.println("\n--- DESPUÉS DE ORDENAR ---");
            mostrarArregloLimitado(numeros, ELEMENTOS_A_MOSTRAR);

            // Versión optimizada para comparación (opcional)
            System.out.println("\n\n=== VERSIÓN MÁS ÓPTIMA (con menos datos) ===");
            System.out.println("NOTA: Para 1,000,000 de datos, el burbuja es muy lento.");
            System.out.println("Probando con 10,000 datos para demostración más rápida...");

            int[] pruebaRapida = generarArregloAleatorio(10000, 1, 10000);
            long inicioPrueba = System.currentTimeMillis();
            ordenarBurbuja(pruebaRapida);
            long finPrueba = System.currentTimeMillis();

            System.out.println("10,000 datos ordenados en: " + (finPrueba - inicioPrueba) + " ms");
            System.out.println("¿Ordenado correctamente? " + estaOrdenado(pruebaRapida));
}
}
