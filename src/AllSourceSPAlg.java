
/**
 *
 * @author mnr
 */
// Floyd Warshall Algorithm in Java
public class AllSourceSPAlg extends ShortestPathAlgorithm {

    final static int INFINITE = 9999;
    

    // Implementing floyd warshall algorithm
    void computeFloyedWarshalAlg(Graph graph) {
        //Create the distance matrix 
        int DMatrix[][] = new int[graph.verticesNo][graph.verticesNo];

        int i, j, k;

        for (i = 0; i < graph.verticesNo; i++) {
            for (j = 0; j < graph.verticesNo; j++) {
                if (graph.matrix[i][j] == null) {
                    DMatrix[i][j] = INFINITE;
                            
                } else {
                    DMatrix[i][j] = graph.matrix[i][j].getWeight();
                }
            }
        }

        // Adding vertices individually
        for (k = 0; k < graph.verticesNo; k++) {
            for (i = 0; i < graph.verticesNo; i++) {
                for (j = 0; j < graph.verticesNo; j++) {
                    if (DMatrix[i][k] + DMatrix[k][j] < DMatrix[i][j]) {
                        DMatrix[i][j] = DMatrix[i][k] + DMatrix[k][j];
                    }
                }
            }
        }
        printMatrix(DMatrix);
    }

    void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] == INFINITE) {
                    System.out.print("INF ");
                } else {
                    System.out.printf(matrix[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

}
