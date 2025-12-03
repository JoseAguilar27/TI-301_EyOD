/*
* ITESS-TICS 2025 Estructura y Organizacion de Datos
* Periodo: Agosto Diciembre 2025
* Docente: Francisco Javier Montecillo Puente
*Tema 3. Estructuras no Lineales
        Adjacency List for a Tree
* Programador: JEAA
* Email: ti24110122@itess.edu.mx --- aguilaralvezjoseemanuel@gmail.com
* Fecha: 26/Noviembre/2025

 */
package tema3_EstructurasNoLineales;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {

    private List<List<Integer>> graph;
    private int n;// numero de vertices

    public GraphAdjacencyList(int n) {
        this.n = n;

        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public void print() {
        int node = 0;
        for (var al : graph) {
            System.out.print(node + ":");
            for (var i : al) {
                System.out.print(i + ",");
            }
            node++;
            System.out.println(" ");
        }
    }

    public int depth(int p) {
        //is root
        if (p == 0) {
            return 0;
        }
        return 1 + depth(graph.get(p).get(0));
    }

    private void preorderRecursive(int vertex, boolean[] visited) {
        // 1. Visitar el nodo (acción de visita)
        System.out.print(vertex + " ");
        visited[vertex] = true;

        // 2. Recorrer todos los vértices adyacentes
        for (int neighbor : graph.get(vertex)) {
            if (!visited[neighbor]) {
                // 3. Llamada recursiva para cada vértice no visitado
                preorderRecursive(neighbor, visited);
            }
        }
    }

    public void preorder(int start) {
        boolean[] visited = new boolean[n];
        System.out.print("Recorrido preorder: ");
        preorderHelper(start, visited);
        System.out.println();
    }

    private void preorderHelper(int p, boolean[] visited) {
        // realizar la acción de "visitar" para la posición p
        System.out.print(p + " ");
        visited[p] = true;

        // para cada hijo c en children(p) hacer
        for (int c : graph.get(p)) {
            if (!visited[c]) {
                // preorder(c) { recorrer recursivamente el subárbol enraizado en c }
                preorderHelper(c, visited);
            }
        }
    }
}
