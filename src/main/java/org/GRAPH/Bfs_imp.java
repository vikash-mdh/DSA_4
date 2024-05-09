package org.GRAPH;

import java.util.*;

class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;

    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];

        for (int i = 0; i <= v; i++)
            adjList[i] = new ArrayList<Integer>();
    }
     // v is the source
    // w is the destanitation
    void addEdge(int v, int w) {
        // add the v may w ko add keya hai
        adjList[v].add(w); // edge ti connct

    }
    // example input
    // n - 5,  e - 4
    //0 1 0 2 0 3 2 4
    // output
     // 0 1 2 3 4

    void BFS(int x) {
        boolean[] vis = new boolean[vertices]; // to keep track of visited nodes
        Queue<Integer> q = new LinkedList<>(); // queue for BFS traversal

        vis[x] = true; // mark the starting node as visited
        q.add(x); // add the starting node to the queue

        while (!q.isEmpty()) {
            int curr = q.poll(); // remove the first node from the queue
            System.out.print(curr + " "); // print the current node

            // Visit all adjacent nodes of the current node
            for (int nbr : adjList[curr]) {
                if (!vis[nbr]) {
                    vis[nbr] = true; // mark the neighbor as visited
                    q.add(nbr); // add the neighbor to the queue for further exploration
                }
            }
        }
    }

}

public class Bfs_imp {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            // this is vertex
            int x = sc.nextInt();
            // this is edge
            int y = sc.nextInt();
            // function call
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}

