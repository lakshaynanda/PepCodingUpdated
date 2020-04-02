import java.util.*;

public class GraphDjikstra {

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
	static class Dhelper implements Comparable<Dhelper>
	{
	    int vtx;
	    String psf;
	    int dsf;
	    Dhelper(int vtx,String psf,int dsf)
	    {
	        this.vtx=vtx;
	        this.psf=psf;
	        this.dsf=dsf;
	    }
	    public int compareTo(Dhelper other) {
			return this.dsf - other.dsf;
		}
	}
	

	static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b, int wt) {
		graph.get(a).add(new edge(a, b, wt));
		graph.get(b).add(new edge(b, a, wt));
	}

	static void Dijkstra(ArrayList<ArrayList<edge>> graph, int src) {
		// write your code here	
		boolean[] visited=new boolean[graph.size()];
		PriorityQueue<Dhelper> pq=new PriorityQueue<>();
		Dhelper rh=new Dhelper(src,""+src,0);
		pq.add(rh);
		while(pq.size()>0)
		{
		    Dhelper cp=pq.peek();
		    pq.remove();
		    if(visited[cp.vtx]==true)
		    {
		        continue;
		    }
		    else
		    {
		        visited[cp.vtx]=true;
		    }
		    System.out.println(cp.vtx+" via "+cp.psf+" @ "+cp.dsf);
		    for(int i=0;i<graph.get(cp.vtx).size();i++)
		    {
		        int nbr=graph.get(cp.vtx).get(i).v2;
		        int dist=graph.get(cp.vtx).get(i).wt;
		        if(visited[nbr]==false)
		        {
		            Dhelper np=new Dhelper(nbr,cp.psf+nbr,cp.dsf+dist);
		            pq.add(np);
		        }
		    }
		}
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
		Dijkstra(graph, a);
	}	
}