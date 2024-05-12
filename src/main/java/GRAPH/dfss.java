package GRAPH;
import java.util.*;

public class dfss {

        static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v)
        {
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited)
        {
            visited[s]=true;
            System.out.print(s +" ");

            for(int u:adj.get(s)){
                if(!visited[u])
                    DFSRec(adj,u,visited);
            }
        }

        static void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s){
            boolean[] visited=new boolean[V];
            for(int i = 0; i<V; i++)
                visited[i] = false;

            DFSRec(adj,s,visited);
        }

        public static void main(String[] args)
        {
           Scanner sc = new Scanner(System.in);
           int vertex =  sc.nextInt();
           int edge   = sc.nextInt();
           ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

           for(int i = 0; i < vertex; i++) graph.add(new ArrayList<>());

           for(int i = 0; i < edge; i++){
               int src = sc.nextInt();
               int des = sc.nextInt();

               addEdge(graph, src,des);
           }
            DFS(graph,vertex,0);
        }
    }



