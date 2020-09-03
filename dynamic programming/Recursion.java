     
import java.util.*;
import java.io.*;   
 public class cf222b {
        public static void main(String[] args) throws Exception {
     //        Scanner in = new Scanner(System.in);
            FastReader sc = new FastReader();
            PrintWriter out = new PrintWriter(System.out);

        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int grid[][]=new int[n+1][n+1];
            for(int i=1;i<=n;i++)
               for(int j=1;j<=n;j++)
                  grid[i][j]=sc.nextInt();
            long count=0;
            int used=0;
            long dp[][]=new long[n+1][(1<<n)+5];
            for(int i=0;i<=n;i++)
             for(int j=0;j<=(1<<n);j++)
                dp[i][j]=-1;
            for(int i=1;i<=n;i++){
             if(grid[1][i]==1)
             {
              used=set(used,i);
              count+=go(grid,2,n,used,dp);      
              used=unset(used,i);
             }
            }
           out.println(count);       
        }
    }
    public static long go(int grid[][],int s,int n,int used,long dp[][])
    {
        if(s==n+1)
        return 1;
       
       if(dp[s][used]!=-1)
       return dp[s][used];
       long count=0; 
        for(int t=1;t<=n;t++){
         if(grid[s][t]==1 && !check(used,t)){
             used=set(used,t);
           count+=go(grid,s+1,n,used,dp);
             used=unset(used,t);
         }
        }
     return dp[s][used]=count;
    }
    public static int set(int n,int i)
    {
        int mask=(1<<(i-1));
        int ans=(mask|n);
        return ans;
    }
    public static int unset(int n,int i)
    {
        int mask=~(1<<(i-1));
        int ans=(n & mask);
        return ans;
    }
    public static boolean check(int n,int i)
    {
        int mask=(1<<(i-1));
        if((n&mask)!=0)
            return true;
        else 
           return false;


    }          
        }
        static class FastReader {
            BufferedReader br;
            StringTokenizer st;
            FastReader() {
                br = new BufferedReader(new InputStreamReader(System.in));
            }
            FastReader(File f) {
                try {
                    br = new BufferedReader(new FileReader(f));
                } catch (FileNotFoundException x) {
                    System.out.println(x);
                }
            }
            String next() throws IOException {
                while (st == null || !st.hasMoreTokens()) {
                    st = new StringTokenizer(br.readLine());
                }
                return st.nextToken();
            }
            String nextLine() throws IOException {
                return br.readLine();
            }
     
            int nextInt() throws IOException {
                return Integer.parseInt(next());
            }
            long nextLong() throws IOException {
                return Long.parseLong(next());
            }
            double nextDouble() throws IOException {
                return Double.parseDouble(next());
            }
            boolean hasNext() throws IOException {
                String s = br.readLine();
                if (s == null) {
                    return false;
                }
                st = new StringTokenizer(s);
                return true;
            }
        }
