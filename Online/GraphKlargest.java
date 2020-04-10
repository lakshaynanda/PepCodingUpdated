
import java.util.*;

public class GraphKlargest {
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

	static int currentLargestPath = Integer.MAX_VALUE;
	static int cmax = Integer.MIN_VALUE;
	static String currentPath = "";

	static void floorOfCLP(ArrayList<ArrayList<edge>> graph, int s, int d, int cost,String path,boolean[] visited) {
    if(s==d)
    {
        if(cost>cmax && cost<currentLargestPath)
        {
            cmax=cost;
            currentPath=path+s;
        }
        return;
    }
    visited[s]=true;
    for(int ce=0;ce<graph.get(s).size();ce++)
    {
        edge e=graph.get(s).get(ce);
        if(visited[e.v2]==false)
        {
            floorOfCLP(graph,e.v2,d,cost+e.wt,path+s+" -> ",visited);
        }
    }
    visited[s]=false;
	}

	static int kthLargestPath(ArrayList<ArrayList<edge>> graph, int a, int b, int k) {
		// write your code here
        boolean[] visited=new boolean[graph.size()];
        while(k>0)
        {
            cmax=Integer.MIN_VALUE;
            floorOfCLP(graph,a,b,0,"",visited);
            currentLargestPath=cmax;
            k--;
        }
		return currentLargestPath;
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
		int k = scn.nextInt();
		int kthPathCost = kthLargestPath(graph, a, b, k);
		System.out.println( currentPath + " @ " + kthPathCost );
	}
}