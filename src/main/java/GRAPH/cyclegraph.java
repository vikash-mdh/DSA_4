package GRAPH;
import java.util.*;
public class cyclegraph {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static boolean DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited, int parent)
    {
        visited[s]=true;

        for(int u:adj.get(s)){
            if(visited[u]==false){
                if(DFSRec(adj,u,visited,s)==true)
                {return true;}}
            else if(u!=parent)
            {return true;}
        }
        return false;
    }

    static boolean DFS(ArrayList<ArrayList<Integer>> adj, int V){
        boolean[] visited=new boolean[V];
        for(int i = 0; i<V; i++)
            visited[i] = false;

        for(int i=0;i<V;i++){
            if(visited[i]==false)
                if(DFSRec(adj,i,visited,-1)==true)
                    return true;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(vertex);

        for (int i = 0; i < vertex; i++)
            adj.add(new ArrayList<Integer>());

        for(int i = 0; i < edge; i++){
            int src = sc.nextInt();
            int des = sc.nextInt();
            addEdge(adj,src,des);
        }
        if(DFS(adj,vertex)==true)
            System.out.println("Cycle found");
        else
            System.out.println("No cycle found");
    }
}

