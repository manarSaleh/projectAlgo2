
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sarah
 */
import java.util.*;
public class Application {
     static Scanner in = new Scanner(System.in);
     
    public static void main (String [] args) throws Exception{
        File input = new File("diagraph.txt");
        if (!input.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        }
        Scanner read = new Scanner(input);
        boolean isDigraph;
        String line = read.nextLine();
        if (line.equals("digraph0")) {
            isDigraph = false;
        } else {
            isDigraph = true;
        }
        
        int verticesNo = read.nextInt();
        
        int edgeNo = read.nextInt();
        
        Graph graph= new Graph(verticesNo,edgeNo,isDigraph);
        graph.readGraphFromFile();
        AllSourceSPAlg a = new AllSourceSPAlg();
        a.computeFloyedWarshalAlg(graph);

        
        
        
        
        
       /* graph.readGraphFromFile();
        int choice;
          do {

            System.out.println("----------------------------------------------");
            System.out.println("       --- CPCS324 PROJECT PART II ---");
            System.out.println("       ---        QUESTION 1       ---");
            System.out.println("----------------------------------------------");
            System.out.println("Choose from the menu:");
            System.out.println("> Enter 1 to answer task #1, Floyd-Warshall Algorithm");
            System.out.println("> Enter 2 to answer task #2, Dijkstra Algorithm");
            System.out.println("> Enter 0 to Quit");
            System.out.println("----------------------------------------------");
            System.out.print("Enter Your Choice: ");
            choice = in.nextInt();

            if (choice == 1) {
                // Show the graph before changes
                int graph[][] = chooseGraph(10);
                System.out.println("\n ---- Graph Before Changes ---- \n");
                printGraph(graph);
                System.out.println("\n ---- Graph After Floyed-Warshal Changes ---- \n");
                startTime = System.currentTimeMillis();
                FloydWarshall(10); // Call the graph of size 10 that was given to us
                finishTime = System.currentTimeMillis();
                double totalTime = finishTime - startTime;
                System.out.println("----------------------------------------------");
                System.out.println("Runtime (in Milliseconds) : " + totalTime + "\n\n");
            } else if (choice == 2) {
                startTime = System.currentTimeMillis();
                Dijkstra(10); // Call the graph of size 10 that was given to us
                finishTime = System.currentTimeMillis();
                System.out.println("----------------------------------------------");
                double totalTime = finishTime - startTime;
                System.out.println("Runtime (in Milliseconds) : " + totalTime + "\n\n");
            } else if (choice == 0) {
                // Terminate
                break;
            } else {
                System.out.println("\n-- Wrong input, please try again --\n");
            }

        } while (true);
        System.out.println("\n----------------------------------------------");
        System.out.println("             -- Thnak You ---");
        System.out.println("----------------------------------------------");

         
        
    }
   public static void createGraph(int vertNum, int EdNum, int choice) {
        Graph graph = new Graph(vertNum, EdNum);
        System.out.println("Is the graph directed?\n Enter (true) or (false) ");
        String isdi = in.next();
        if (isdi.equalsIgnoreCase("true")) {
            System.out.println(" Prim’s and Kruskal’s  MST Algorithms don't work on directed graphs");
            System.out.println(" Would you like to quit(enter quit) ,or continue considering the graph is undirected (enter cont) ");
            String contOrQuit = in.next();
            if (contOrQuit.equalsIgnoreCase("quit")) {
                System.exit(0);
            }

        } else {
            graph.make_graph(graph);
        }
        //KruskalAlg x = new KruskalAlg();
        //PQPrimAlg y = new PQPrimAlg();
        //MHPrimAlg z = new MHPrimAlg();

        switch (choice) {

            case 1:
              //  x.kruskalMST(graph);
               // y.PQ_Prim(graph);

                break;
            case 2:
               // y.PQ_Prim(graph);
               // z.primMinHeap(graph);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }*/

    }
 
    
}
