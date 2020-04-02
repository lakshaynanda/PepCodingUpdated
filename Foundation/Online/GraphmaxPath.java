
import java.util.*;

public class GraphmaxPath {

	static class edge {
		int v1;
		int v2;
		int wt;

		edge(int a, int b, int wt) {
			this.v1 = a;
			this.v2 = b;
			this.wt = wt;
		}
	}

	static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b, int wt) {
		graph.get(a).add(new edge(a, b, wt));
		graph.get(b).add(new edge(b, a, wt));
	}

	static int max = Integer.MIN_VALUE;

	static void maxCostPath(ArrayList<ArrayList<edge>> graph, int s, int d, boolean[] visited,int cost) {
		// write your code here
		if(s==d)
		{
		    if(cost>max)
		    {
		        max=cost;
		    }
		    return;
		}
		visited[s]=true;
		for(int e=0;e<graph.get(s).size();e++)
		{
		    edge ce=graph.get(s).get(e);
		    if(!visited[ce.v2])
		    {
		        maxCostPath(graph,ce.v2,d,visited,cost+ce.wt);
		        
		    }
		}
		visited[s]=false;
	}
	

	public static void main(String[] args) {
		ArrayList<ArrayList<edge>> graph = new ArrayList<>();
		for (int i = 0; i < 7; i++) {
			graph.add(new ArrayList<edge>());
		}

		addEdge(graph, 0, 3, 40);
		addEdge(graph, 1, 0, 10);
		addEdge(graph, 2, 1, 10);
		addEdge(graph, 3, 2, 10);
		addEdge(graph, 4, 3, 2);
		addEdge(graph, 5, 4, 3);
		addEdge(graph, 6, 5, 3);
		addEdge(graph, 6, 4, 8);

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		// write extra parameter here
		boolean[] visited=new boolean[graph.size()];
		maxCostPath(graph, a, b, visited,0);
		System.out.println(max);
	}	
}