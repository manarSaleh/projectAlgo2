/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 *//*
public class SingleSourceSPAlg extends ShortestPathAlgorithm {
    public static void computeDijkstraAlg(int sizeOfGraph){
        
        // Get the graph
        int graph[][] = chooseGraph(sizeOfGraph);
        // Check the size
        int size = graph.length;
        final int INF = 999999;
        // Prepare the other material we need
        boolean[] isVisited = new boolean[size];
        int distance[] = new int[size];
        String[] path = new String[size];
        // Make all the vertices unvisited and distance as infinity
        for (int i = 0; i < size; i++) {
            isVisited[i] = false;
            distance[i] = INF;
        }
        // Take the source as the first vertix 'A', and prepare the paths
        distance[0] = 0;
        path[0] = "A --" + distance[0] + "--> ";

        // --- Start Dijkstra ---
        for (int i = 0; i < size; i++) {
            // Find the minium distance among all the vertices
            int u = -1;
            int minDistance = INF;
            for (int j = 0; j < size; j++) {
                if (isVisited[j] != true && distance[j] < minDistance) {
                    minDistance = distance[j];
                    u = j; // Min vertix index
                }
            }

            // Set u as visited
            isVisited[u] = true;

            // Update the adjacent distances
            for (int v = 0; v < size; v++) {
                if (isVisited[v] != true && graph[u][v] != INF && graph[u][v] != 0) {
                    if (distance[u] + graph[u][v] < distance[v]) {
                        distance[v] = distance[u] + graph[u][v];
                        // Update the path by adding the parent path plus the current vertix path
                        path[v] = path[u] + (char) (v + 65) + " --" + (distance[v] - distance[u]) + "--> ";
                    }
                }
            }
        }

        // Print all the distances with the pathes
        System.out.println("\n----- Dijkstra Algorithm -----");
        System.out.println("All the shortest distances from vertex 'A' to other vertices in graph");
        for (int i = 0; i < size; i++) {
            System.out.println("  > Shortest Distance from 'A' to '" + (char) (i + 65) + "' is " + distance[i] + ", the Path: " + path[i] + " " + (char) (i + 65) + " " + distance[i]);
        }
        System.out.println();
    }

        
    }
    */


