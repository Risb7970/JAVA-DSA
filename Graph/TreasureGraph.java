package Graph;

import java.util.ArrayList;
import java.util.Scanner;

//You are given an undirected graph with n nodes and m edges. Each node has a treasure value. Starting from node 1, your goal is to reach node n by traversing any valid path. Along the path, you can collect the treasure at every node you visit (including start and end nodes).
//Your task is to find the maximum possible treasure you can collect by moving from node 1 to node n.
public class TreasureGraph {
    static  class Edge{
        int src , dest;
        public Edge(int s , int d){
            this.src = s;
            this.dest =d;
        }
    }
    static int maxTreasure=0;
    public static void createGraph(ArrayList<Edge>[] graph , int [][] edges){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int [] edge : edges){
            int u = edge[0];
            int v = edge[1];
            graph[u].add(new Edge(u,v));
            graph[v].add(new Edge(v,u));
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, int dest, boolean[] vis, int[] treasure, int currSum) {
        currSum += treasure[curr];
        if (curr == dest) {
            maxTreasure = Math.max(maxTreasure, currSum);
            return;
        }

        vis[curr] = true;
        for (Edge e : graph[curr]) {
            if (!vis[e.dest]) {
                dfs(graph, e.dest, dest, vis, treasure, currSum);
            }
        }
        vis[curr] = false; // Backtrack
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //nodes
        int m = sc.nextInt(); //edges

        int treasure[] = new int[n];
        for(int i=0; i<n; i++){
            treasure[i] = sc.nextInt();
        }

        int [][] edges = new int[m][2];
        for(int i=0; i<m; i++){
            edges[i][0] = sc.nextInt()-1;
            edges[i][1] = sc.nextInt()-1;
        }

        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(graph , edges);

        boolean [] vis  = new boolean[n];
        dfs(graph , 0 , n-1 , vis , treasure , 0);

        System.out.println(maxTreasure);


    }
}
