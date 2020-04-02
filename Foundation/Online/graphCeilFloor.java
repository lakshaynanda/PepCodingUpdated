import java.util.Scanner;
import java.util.*;

public class graphCeilFloor {

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

	static String cp; // ceilpath
	static String fp; // floorpath
	static int cpc = Integer.MAX_VALUE; // cp cost
	static int fpc = Integer.MIN_VALUE; // fp cost

	static void CeilfloorPath(ArrayList<ArrayList<edge>> graph, int src, int dest,boolean[] visited,String psf,int costsofar, int factor) {
		// write your code here	
		if(src==dest)
		{
		    psf=psf+dest;
		    if(costsofar>factor && costsofar<cpc)
		    {
		        cp=psf;
		        cpc=costsofar;
		    }
		    if(costsofar<factor && costsofar>fpc)
		    {
		        fp=psf;
		        fpc=costsofar;
		    }
		    return;
		}
		visited[src]=true;
		for(int i=0;i<graph.get(src).size();i++)
		{
		    int neighbour=graph.get(src).get(i).v2;
		    int cost=graph.get(src).get(i).wt;
		    if(visited[neighbour]==false)
		    {
		        CeilfloorPath(graph,neighbour,dest,visited,psf+src+"-",costsofar+cost,factor);
		    }
		}
		visited[src]=false;
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
		int factor=scn.nextInt();
		
		// write extra parameter here
		boolean[] visited=new boolean[graph.size()];
		CeilfloorPath(graph, a, b,visited,"",0,factor);
		System.out.println(cp + "@" + cpc);
		System.out.print(fp + "@" + fpc);
	}	
}