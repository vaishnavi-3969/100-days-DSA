import java.util.*;
import java.lang.*;

public class AdjacencyListGraph {
	LinkedList<Integer>[] adj;
	int vertices=0;
	public AdjacencyListGraph(int nodes) {
		this.adj = new LinkedList[nodes];
		this.vertices = nodes;
		for(int i =0; i<nodes; i++) {
			this.adj[i] = new LinkedList<>();
		}
	}
	public void addEdge(int u, int v) {
		this.adj[u].add(v);
		this.adj[v].add(u);
	}
	public void bfs(int start) {
		boolean[] visited = new boolean[vertices];
		Queue<Integer> q = new LinkedList<>();
		visited[start] = true;
		q.offer(start);
		while(!q.isEmpty()) {
			int u = q.poll();
			System.out.print(u+" ");
			for(int v: adj[u]) {
				if(!visited[v]) {
					visited[v] = true;
					q.offer(v);
				}
			}
		}
	}
	public void dfs(int s) {
		boolean[] visited = new boolean[vertices];
		Stack<Integer> stack = new Stack<>();
		stack.push(s);
		while(!stack.isEmpty()) {
			int u = stack.pop();
			if(!visited[u]) {
				visited[u] = true;
				System.out.print(u+" ");
				for(int v: adj[u]) {
					if(!visited[v]) {
						stack.push(v);
					}
				}
			}
		}
	}
	public void recursiveDFS() {
		boolean[] visited = new boolean[vertices];
		for(int v=0; v<vertices; v++) {
			if(!visited[v]) {
				depthForSearch(v,visited);
			}
		}
	}
	private void depthForSearch(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v+" ");
		for(int w: adj[v]) {
			if(!visited[w]) {
				depthForSearch(w,visited);
			}
		}
	}
	
}
