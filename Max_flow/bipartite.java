import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int e=sc.nextInt();
        //String s=sc.next();
        int cap[][]=new int[26+5][26+5];
        for(int i=0;i<e;i++)
        {
            int u=sc.nextInt();
            int v=sc.nextInt();
            int wt=sc.nextInt();
            cap[u][v]=wt;
        }
        System.out.println(solve(cap,0,1));
    }
    public static int solve(int cap[][],int src,int sink)
    {
        int par[]=new int[35];
        int ans=0;
        while(bfs(cap,par))
        {
           ArrayList<Integer> curr=new ArrayList<>();
           int flow=Integer.MAX_VALUE/2;
           int v=sink;
           while(v!=src)
           {
               int u=par[v]; 
               curr.add(v);
               flow=Math.min(flow,cap[u][v]);
               v=u;
           }
           curr.add(src);
           Collections.reverse(curr);
           System.out.println(curr);
           v=sink;
           while(v!=src)
           {
               int u=par[v];
               cap[u][v]-=flow;
               cap[v][u]+=flow;
               v=u;
           }
           ans+=flow;
        }
        return ans;
    }
    public static  boolean bfs(int cap[][],int[] par)
    {
         Queue<Integer> q=new LinkedList<>();
         q.add(0);
         boolean found=false;
         boolean vis[]=new boolean[35];
         while(q.size()>0)
         {
             int u=q.poll();
             for(int v=0;v<=27;v++)
             {
                 if(!vis[v] &&  cap[u][v]>0)
                 { 
                     par[v]=u;
                     vis[v]=true;
                     q.add(v);
                     if(v==27)
                     {
                       found=true;
                       break;
                     }
                 }
             }
             if(found)
             return true;
         }
         return found;
    }
}