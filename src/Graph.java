
//import static Application.read;
import java.io.File;
import java.util.*;


/**
 *
 * @author Sarah
 */


public class Graph {

    int verticesNo;
    int edgeNo;
    boolean isDigraph;
    Edge[][] matrix;
    
    //can be array if we know the number of vertex before hand. could be turned to array list
    ArrayList<Vertex> vertices;
    
    // additions 
    static Scanner read;
    //might not need this if we have the array list of vertices
    ArrayList<Character> labels;//to store labels of the graph
    
    
    
    

    Graph(int verticesNo, int edgeNo, boolean isDigraph) {
        this.verticesNo = verticesNo;
        this.edgeNo = edgeNo;
        //we can set is diagraph outside
        this.isDigraph = isDigraph;
        matrix = new Edge[verticesNo][verticesNo];
        //initialize all elements of the adjMatrix with null.
        for(int i = 0; i < matrix.length; ++i)
        for(int j = 0; j < matrix[i].length; ++j)
            matrix[i][j] = null;
        
            vertices = new ArrayList<Vertex>();
            labels = new ArrayList<Character>();
        //vertices = new LinkedList[verticesNo];
        //initialize adjacency lists for all the verts
        //  for (int i = 0; i < verticesNo; i++) {
        // vertices[i] = new LinkedList<>();
        // }
    }

    Graph() {

    }

/*    public void make_graph(int verticesNo, int edgeNo) {
        // instance of Random class
        Random random = new Random();
        // ensure that all vertices are connected
        for (int i = 0; i < verticesNo - 1; i++) {
            int RandomNum = random.nextInt(10) + 1;
            Vertex sourceV = new Vertex(i);
            sourceV.setLabel(i);
            Vertex destinationV = new Vertex(i + 1);
            addEdge(sourceV, destinationV, RandomNum);

        }
        int remaning = edgeNo - (verticesNo - 1);

        for (int i = 0; i < remaning; i++) {
            Vertex source = new Vertex(random.nextInt(graph.verticesNo));
            Vertex Destination = new Vertex(random.nextInt(graph.verticesNo));
            if (Destination.getLabel() == source.getLabel() || isConnected(source.getLabel(), Destination.getLabel(), graph.vertices)) { // to avoid self loops and duplicate edges
                i--;
                continue;
            }
            // generate random weights in range 0 to 20
            int weight = random.nextInt(20) + 1;
            // add edge to the graph
            addEdge(source, Destination, weight);

        }
    }*/

    public void readGraphFromFile() throws Exception {
        File input = new File("diagraph.txt");
        if (!input.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        }
         read = new Scanner(input);
         read.nextLine();
         read.nextInt();
         read.nextInt();
        char source;
        char destination;
        int weight;
        while(read.hasNextLine()){
        source = read.next().charAt(0);
        destination = read.next().charAt(0);
        weight = read.nextInt();
        
        addEdge(source, destination, weight);
        }        
    }

    public Edge addEdge(char source, char destination, int weight) {//source: v, destination(target): u, vertex weight: w
        Vertex d;
        Vertex s;
        //if source vertex exist
        if (labels.contains(source)){
            s = vertices.get(labels.indexOf(source));
        
        }
        //if source is a new vertix
        else{
            s = new Vertex(labels.size(), source);
            vertices.add(s);
            labels.add(source);
        
        }
        //if destination vertix exist
        if (labels.contains(destination)){
            d = vertices.get(labels.indexOf(destination));
            
        }
        //if desstination vertix is new
        else{
            d = new Vertex(labels.size(), destination);
            vertices.add(d);
            labels.add(destination);
        
        }
        
        
        //-------------------------check if the label is already exists, if not create a vertex object------------------------------------
       
        //-----------------------------------------------------------
        Edge edge = new Edge(s, d, weight);
        if (isIsDigraph()) {
            matrix[s.getPosition()][d.getPosition()] = edge;
        }
        if (isIsDigraph() == false) {
            matrix[s.getPosition()][d.getPosition()] = edge;
            matrix[d.getPosition()][s.getPosition()] = edge;
        }
        return edge;

    }

    public boolean addVertLabel(/*vLabel*/) {
        return false;
    }

    public void setIsDigraph(boolean isDigraph) {
        this.isDigraph = isDigraph;
    }

    public void setVerticesNo(int verticesNo) {
        this.verticesNo = verticesNo;
    }

    public void setEdgeNo(int edgeNo) {
        this.edgeNo = edgeNo;
    }

    public int getVerticesNo() {
        return verticesNo;
    }

    public int getEdgeNo() {
        return edgeNo;
    }

    public boolean isIsDigraph() {
        return isDigraph;
    }

}
