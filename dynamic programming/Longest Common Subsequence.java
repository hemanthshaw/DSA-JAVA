import java.util.*;
import java.io.*;
class MaxPairwiseProduct
{
    public static void main(String[] args) {
        FastScanner sc=new FastScanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int n=a.length();
        int m=b.length();
        int dp[][]=new int[n+1][m+1];
        for(int i[] : dp)
            Arrays.fill(i,-1);
        System.out.println(Solve(a,b,n,m,dp)); 
    }
    public static int Solve(String a,String b,int n,int m,int dp[][])
    {
      if(m==0 || n==0)
        return m+n;

       if(dp[n][m]!=-1)
        return dp[n][m];

       if(a.charAt(n-1)==b.charAt(m-1))
        return dp[n][m]=Solve(a,b,n-1,m-1,dp);
       else
        return dp[n][m]=1+Math.min(Solve(a,b,n-1,m,dp),Math.min(Solve(a,b,n,m-1,dp),Solve(a,b,n-1,m-1,dp)));

    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new
                    InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
