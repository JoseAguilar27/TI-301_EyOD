/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4_Ordenamiento;

import static tema4_Ordenamiento.OrdenamientoLineal.ejemploUso;
import static tema4_Ordenamiento.OrdenamientoLineal.informacionAlgoritmo;
import static tema4_Ordenamiento.OrdenamientoLineal.menuInteractivo;
import static tema4_Ordenamiento.OrdenamientoLineal.simulacionArregloGrande;

/**
 *
 * @author Jose
 */
public class OrdenamientoLinealTest {
    public static void main(String[] args) {
        // Ejecutar ejemplo básico
        ejemploUso();
        
        // Mostrar información del algoritmo
        informacionAlgoritmo();
        
        // Preguntar al usuario qué desea hacer
        System.out.println("\n" + "=".repeat(50));
        System.out.println("OPCIONES DISPONIBLES:");
        System.out.println("1. Ejecutar ejemplo con arreglo pequeño (recomendado para prueba)");
        System.out.println("2. Simulación con 1,000,000 de elementos (puede ser lento)");
        System.out.println("3. Menú interactivo personalizado");
        System.out.print("Selecciona una opción (1-3): ");
        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int opcion = scanner.nextInt();
        
        switch (opcion) {
            case 1:
                // Ya se ejecutó en ejemploUso()
                break;
            case 2:
                simulacionArregloGrande();
                break;
            case 3:
                menuInteractivo();
                break;
            default:
                System.out.println("Opción no válida. Ejecutando ejemplo básico.");
        }
        
        scanner.close();
        
        // Nota final
        System.out.println("\n" + "=".repeat(60));
        System.out.println("NOTA SOBRE EFICIENCIA:");
        System.out.println("=".repeat(60));
        System.out.println("""
            Para 1,000,000 de elementos en Java:
            • Búsqueda lineal: O(n) - hasta 1,000,000 comparaciones
            • En hardware moderno: ~1-10 ms para elemento al principio
            • En peor caso: ~10-100 ms para elemento al final/no encontrado
            
            Alternativas más eficientes:
            1. Si puedes ordenar: Arrays.sort() + Arrays.binarySearch() - O(log n)
            2. Para múltiples búsquedas: HashSet<Integer> - O(1) promedio
            3. Para datos que no cambian: ordenar una vez, buscar muchas veces
            """);
    }
}
