package GRAPH;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ver = sc.nextInt();
        int edg = sc.nextInt();
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        // frist loop iterate in the vertex
        for(int i = 0; i < ver; i++){
            graph.add(new ArrayList<>());
        }
        // second loop iterate in the edge
        for(int i = 0; i < edg; i++){
            int src =  sc.nextInt();
            int des = sc.nextInt();
            graph.get(src).add(des);  // only for directed graph
           // graph.get(des).add(src);  // if i am write the two line then write the  src to des and des to src directed graph

        }
        boolean[] visited = new boolean[ver];
        dfs(graph, 0, visited);
    }
    public static void dfs(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int nbr : graph.get(node)) {
            if (!visited[nbr]) {
                dfs(graph, nbr, visited);
            }
        }
    }
}




