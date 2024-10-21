package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class BasicBit
{
    public int findCircleNum(int[][] adj) {
        int n =  adj.length;
        int count  = 0;
        boolean vist[] = new boolean[n]; // false
        for(int i = 0; i < n; i++){
            if(!vist[i]){
                bfs(i,vist,adj);
                count++;

            }

        }
      return count;
    }

    private void bfs(int i, boolean[] vist, int[][] adj) {
        int n = adj.length;
        vist[i] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        while (q.size() > 0){
            int front = q.remove();
            for(int j = 0; j < n; j++){
                if(adj[front][j] == 1 && vist[j] == false){
                    q.add(j);
                    vist[j] = true;
                }

            }
        }
    }

    public static void main(String[] args) {

    }
}
