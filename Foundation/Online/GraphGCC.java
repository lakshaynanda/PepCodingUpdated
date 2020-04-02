import java.util.*;

public class GraphGCC {

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
            
    public static void gccComponent(ArrayList<ArrayList<edge>> graph,int src,ArrayList<Integer> scomp,boolean[] visited)
    {
        Queue<Integer> qu=new LinkedList<>();
        qu.add(src);
        while(qu.size()>0)
        {
            int cp=qu.remove();
            if(visited[cp])
            {
                continue;
            }
            else
            {
                visited[cp]=true;
            }
            scomp.add(cp);
            for(int i=0;i<graph.get(cp).size();i++)
            {
                int nbr=graph.get(cp).get(i).v2;
                {
                    if(visited[nbr]==false)
                    {
                        qu.add(nbr);
                    }
                }
            }
        }
    }
    public  static void gcc(ArrayList<ArrayList<edge>> graph,ArrayList<ArrayList<Integer>> comps){
        	boolean[] visited=new boolean[graph.size()];
        	for(int i=0;i<graph.size();i++)
        	{
        	    if(visited[i]==false)
        	    {
        	        ArrayList<Integer> scomp=new ArrayList<>();
        	        gccComponent(graph,i,scomp,visited);
        	        comps.add(scomp);
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

	
        
        ArrayList<ArrayList<Integer>> comps=new ArrayList<>();
        gcc(graph,comps);

        for(int i=0;i<comps.size();i++){
        	System.out.println(comps.get(i));
        }
		
	}	
}