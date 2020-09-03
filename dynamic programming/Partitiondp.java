import java.util.*;
import java.io.*;

public class Partition3 {
    static int tsum=0;
    private static int partition3(int[] a) {
        int n=a.length,sum=0;
        for(int i=0;i<n;i++)
        sum+=a[i];
        tsum=sum/3;
        int dp[][][]=new int[(1<<a.length)][tsum+1][4];
        for(int i[][] : dp)
         for(int j[] : i)
          Arrays.fill(j,-100);
        if(sum%3!=0)
           return 0;
        else
           return CanPartition(a,sum/3,3,0,dp);
    }
   public static int CanPartition(int a[],int sum,int k,int used,int [][][] dp)
   {
       if(used==(1<<a.length))
       return k==0?1:0;
       if(k==0)
       return 1;
       if(sum==0)
       return CanPartition(a,tsum,k-1,used,dp);

       if(sum<0)
       return 0;
       if(dp[used][sum][k]!=-100)
       return dp[used][sum][k];
       
       int ans=0;
       //System.out.println(used);
       for(int i=0;i<a.length;i++)
       {
           if((used & (1<<i))==0)
           ans=(ans | CanPartition(a,sum-a[i],k,set(used,i),dp));
       }
      return dp[used][sum][k]=ans; 
   }
  
   public static int set(int n,int i)
   {
       int mask=(1<<i);
       return (n|mask);
   }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
        System.out.println(partition3(A));
    }
}

