
public class Graph {
	int[][] adjMatrix;
	public Graph(int nodes) {
		this.adjMatrix = new int[nodes][nodes];
		
	}
	public void addEdge(int u, int v) {
		this.adjMatrix[u][v]= 1;
		this.adjMatrix[v][u]=1;
	}
	public void display(int[][] matrix) {
		for(int i =0; i<matrix.length; i++) {
			for(int j =0; j<matrix.length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Graph g  = new Graph(4);
		g.addEdge(0,1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3,0);
		g.display(g.adjMatrix);
		AdjacencyListGraph alg = new AdjacencyListGraph(5);
		alg.addEdge(0, 1);
		alg.addEdge(1, 2);
		alg.addEdge(2,3);
		alg.addEdge(3,0);
		alg.addEdge(2, 4);
//		alg.addEdge(5,7);
		System.out.println("dfs: ");
		alg.bfs(0);
		System.out.println("\nbfs: ");
		alg.dfs(0);
		System.out.print("\nRecursive dfs: ");
		alg.recursiveDFS();
	}
}
