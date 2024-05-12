package GRAPH;
import java.util.*;

public class bfss {

        static void addEdge(ArrayList<ArrayList<Integer>> adj, int src, int des)
        {
            adj.get(src).add(des);
            adj.get(des).add(src);
        }

        static void BFS(ArrayList<ArrayList<Integer>> adj,int V,int s)
        {
            boolean[] visited=new boolean[V];
            for(int i = 0; i < V; i++)
                visited[i] = false;

            Queue<Integer> q=new LinkedList<>();

            visited[s] = true;
            q.add(s);

            while(!q.isEmpty())
            {
                int u = q.poll();
                System.out.print(u + " ");

                for(int v:adj.get(u)){
                    if(!visited[v]){
                        visited[v]=true;
                        q.add(v);
                    }
                }
            }
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


            BFS(adj,vertex,0);
        }
    }
