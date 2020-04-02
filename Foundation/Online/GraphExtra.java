
import java.util.*;

public class GraphExtra {


	static class edge{
		int v1;
		int v2;
		int wt;
		edge(int a,int b,int wt){
			this.v1 = a;
			this.v2 = b;
			this.wt = wt;
		}
	}
	
	static void addEdge(ArrayList<ArrayList<edge>> graph, int a, int b , int wt){
		// write your code here
		graph.get(a).add(new edge(a,b,wt));
		graph.get(b).add(new edge(b,a,wt));
	}
	
	static void display(ArrayList<ArrayList<edge>> graph){
		// write your code here	
		for(int i=0;i<graph.size();i++)
		{
		    System.out.print(i+" -> ");
		    for(int j=0;j<graph.get(i).size();j++)
		    {
		        edge ce=graph.get(i).get(j);
                System.out.print("("+ce.v2+","+ce.wt+"), ");
		    }
		    System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// write your code here
		ArrayList< ArrayList< edge > > graph = new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int e=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            graph.add(new ArrayList<edge>());
        }
        
       for(int i=0;i<e;i++){
			int a = sc.nextInt(), b = sc.nextInt(), wt = sc.nextInt();
			addEdge(graph,a,b,wt);
		}
        
		display(graph);
	}
}
