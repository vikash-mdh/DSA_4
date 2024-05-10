package GRAPH;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertex; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edge; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            graph.get(src).add(des); // only for directed graph
            //graph.get(des).add(src); // undirected graph: connect src to des and des to src
        }

        boolean[] visited = new boolean[vertex];
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