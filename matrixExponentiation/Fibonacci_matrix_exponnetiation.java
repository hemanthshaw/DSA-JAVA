import java.util.*;
class Change {
	public static long mod;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
	    mod=sc.nextLong();
		long T[][]=new long[2][2];
		for(long i[] : T)
		Arrays.fill(i,1);
		T[0][0]=0;

		long f[]=new long[2];
		f[0]=0;
		f[1]=1;
		T=power(T,n);
		long res=0;
		for(int i=0;i<2;i++)
		res+=(T[0][i]*f[i]);
		System.out.println(res%mod);
	  }
	public static long[][] power(long[][] T,long n)
	{
		if(n==1)
		return T;

		if(n%2!=0)
		{
           return multiply(T,power(T,n-1));
		}
		else
		{
	         T=power(T,n/2);
			 return multiply(T,T);
		}
	}
	public static long[][] multiply(long[][] A,long [][] B)
	{
		long res[][]=new long[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				res[i][j]=(res[i][j]+(A[i][k]*B[k][j])%mod)%mod;
			}
		}
		return res;
	}
}