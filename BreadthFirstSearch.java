import java.util.*;
public class BreadthFirstSearch{
static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj){
    int v=adj.size();
    int s=0;// source node or root node
    //to Store data
    ArrayList<Integer> res=new ArrayList<>();
    //Traverse the data follow FIFO
    Queue<Integer> q=new LinkedList<>();
    boolean[] visited=new boolean[v];
    visited[s]=true;
    q.add(s);
    while(!q.isEmpty()){
        int curr=q.poll();
        res.add(curr);
        for(int x:adj.get(curr)){
            if(!visited[x]){
                visited[x]=true;
                q.add(x);
            }
        }
    }
    return res;
}
public static void main(String[] args){
    //{2,3,1} {0} {0,4}, {0}, {2}
    ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
    adj.add(new ArrayList<>(Arrays.asList(1,2)));
    adj.add(new ArrayList<>(Arrays.asList(0,2,3)));
    adj.add(new ArrayList<>(Arrays.asList(0,4)));
    adj.add(new ArrayList<>(Arrays.asList(1,4)));
    adj.add(new ArrayList<>(Arrays.asList(2,3)));
    ArrayList<Integer> ans=bfs(adj);
    for(int i:ans){
        System.out.println(i+" ");
    }
}
}