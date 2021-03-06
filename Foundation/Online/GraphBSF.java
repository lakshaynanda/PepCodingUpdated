import java.util.*;

public class GraphBSF {

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
	static class Helper
	{
	    int vtx;
	    String psf;
	    int dsf;
	    Helper(int vtx,String psf, int dsf)
	    {
	        this.vtx=vtx;
	        this.psf=psf;
	        this.dsf=dsf;
	    }
	}

	static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b, int wt) {
		graph.get(a).add(new edge(a, b, wt));
		graph.get(b).add(new edge(b, a, wt));
	}

	static void BFSi(ArrayList<ArrayList<edge>> graph, int src) {
    boolean[] visited=new boolean[graph.size()];
    Queue<Helper> queue=new LinkedList<>();
    Helper rh=new Helper(src,""+src,0);
    queue.add(rh);
    while(queue.size()>0)
    {
        Helper cp=queue.remove();
        if(visited[cp.vtx]==true)
        {
            continue;
        }
        else
        {
            visited[cp.vtx]=true;
        }
        System.out.println(cp.vtx+" via "+cp.psf+" @"+cp.dsf);
        for(int i=0;i<graph.get(cp.vtx).size();i++)
        {
            int nbr=graph.get(cp.vtx).get(i).v2;
            int dist=graph.get(cp.vtx).get(i).wt;
            if(visited[nbr]==false)
            {
                Helper np=new Helper(nbr,cp.psf+nbr,cp.dsf+dist);
                queue.add(np);
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
		BFSi(graph,a);

	}	
}