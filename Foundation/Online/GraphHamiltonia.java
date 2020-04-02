
import java.util.*;

public class GraphHamiltonian {
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


	public static boolean hamiltonian(int s, ArrayList<ArrayList<edge>> graph, boolean[] visited, ArrayList<Integer> psf, int os) {
		// write your code here
		if(psf.size()==graph.size()-1)
		{
		    psf.add(s);
		    for(int i=0;i<psf.size();i++)
		    {
		        System.out.print(psf.get(i)+" -> ");
		    }
		    System.out.println();
		    boolean cycledetected=false;
		    for(int i=0;i<graph.get(s).size();i++)
		    {
		        int neighbour=graph.get(s).get(i).v2;
		        if(neighbour==os)
		        {
		            cycledetected=true;
		            break;
		        }
		    }
		    psf.remove(psf.size()-1);
		    if(cycledetected)
		    {
		        return true;
		    }
		    return false;
		}
    	visited[s]=true;
    	psf.add(s);
    	for(int j=0;j<graph.get(s).size();j++)
    	{
    	    int neighbour=graph.get(s).get(j).v2;
    	    if(visited[neighbour]==false)
    	    {
    	        boolean ans=hamiltonian(neighbour,graph,visited,psf,os);
    	        if(ans)
    	        {
    	            return ans;
    	        }
    	    }
    	}
        psf.remove(psf.size()-1);
    	visited[s]=false;
    	return false;
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
//		addEdge(graph, 0, 5, 15);
		addEdge(graph, 4, 3, 2);
		addEdge(graph, 5, 4, 3);
		addEdge(graph, 6, 5, 3);
		addEdge(graph, 6, 4, 8);

		boolean cycle = false;
		for (int i = 0; i < graph.size(); i++) {
			boolean[] visited = new boolean[graph.size()];
			ArrayList<Integer> psf = new ArrayList<>();
			boolean ans = hamiltonian( i , graph , visited , psf , i);
			if (ans) {
				cycle = true;
			}
		}

		// write some code here
		System.out.println(cycle);
	}
}