import java.util.*;
class graph1{
    static class edge
    {
        int v1;
        int v2;
        int wt;
        edge(int a, int b, int cost)
        {
            v1=a;
            v2=b;
            wt=cost;
        }
    }
    public static void addEdge(ArrayList<ArrayList<edge>> graph, int v1,int v2,int wt)
    {
        graph.get(v1).add(new edge(v1,v2,wt));
        graph.get(v2).add(new edge(v2,v1,wt));
    }
    public static void displayGraph(ArrayList<ArrayList<edge>> graph)
    {
        for(int i=0;i<graph.size();i++)
        {
            System.out.print(i+"->");
            for(int j=0;j<graph.get(i).size();j++)
            {
                edge ce=graph.get(i).get(j);
                System.out.print("("+ce.v2+","+ce.wt+")");
            }
            System.out.println();
        }
    }
    public static boolean hasPath(int s,int d,boolean[] visited, ArrayList<ArrayList<edge>> graph, String path)
    {
        if(s==d)
        {
            System.out.println(path+" "+d);
            return true;
        }
        visited[s]=true;
        for(int i=0;i<graph.get(s).size();i++)
        {
            edge ce=graph.get(s).get(i);
            if(!visited[ce.v2])
            {
                boolean ans=hasPath(ce.v2, d, visited, graph,path+" "+s);
                if(ans)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void allPath(int s,int d,boolean[] visited, ArrayList<ArrayList<edge>> graph, String path)
    {
        if(s==d)
        {
            System.out.println(path+" "+d);
            return;
        }
        visited[s]=true;
        for(int i=0;i<graph.get(s).size();i++)
        {
            edge ce=graph.get(s).get(i);
            if(!visited[ce.v2])
            {
                allPath(ce.v2, d, visited, graph,path+" "+s);
            }
        }
        visited[s]=false;
    }
    public static void main(String args[])
    {
        ArrayList<ArrayList<edge>> graph=new ArrayList<>();
        for(int i=0;i<=7;i++)
        {
            graph.add(new ArrayList<edge>());
        }
        addEdge(graph,1,4,40);
        addEdge(graph,1,2,10);
        addEdge(graph,2,3,10);
        addEdge(graph,3,4,10);
        addEdge(graph,4,5,2);
        addEdge(graph,5,6,3);
        addEdge(graph,6,7,3);
        addEdge(graph,5,7,8);
        // displayGraph(graph);
        boolean visited[]=new boolean[graph.size()];
        allPath(1, 7, visited, graph,"");
    }
}