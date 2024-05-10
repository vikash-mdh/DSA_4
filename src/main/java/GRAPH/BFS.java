package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Graph{
    int vertex;
    ArrayList<ArrayList<Integer>> graph;

    public Graph(int vertex) {
        this.vertex = vertex+1;
        this.graph = new ArrayList<>();
        for (int i = 0; i < vertex; i++)
            graph.add( new ArrayList<>(vertex+1));
    }
    void Addedge(int vertex, int edge){
        graph.get(vertex).add(edge); // this is directed graph
    }
    void bfs(int vertex){
        Queue<Integer> q = new LinkedList<>();
        q.add(vertex);
        boolean[] vist = new boolean[vertex];
        while (q.size() > 0){
            int node =  q.poll();
            if(!vist[node]){
                continue;
            }
            vist[node] = true;
            System.out.print(node +" ");
            for(int nbr : graph.get(node)){
                if(vist[nbr] == false){
                    q.add(nbr);
                }
            }


        }
    }
}

public  class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        Graph obj = new Graph(110);
        for (int i = 0; i < edge; i++) {
            int src = sc.nextInt();
            int des = sc.nextInt();
            obj.Addedge(src,des);

        }
        obj.bfs(0);

    }
}
