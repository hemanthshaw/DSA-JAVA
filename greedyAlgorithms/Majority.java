import java.util.*;
import java.lang.*;
import java.io.*;
class Second
{
	public static void Main(String srgs[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		HashMap<Long,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(map.containsKey(a[i]))
			{
               map.put(a[i],map.get(a[i])+1);
               if(map.get(a[i]>n/2)){
                	System.out.println("1");
                     return;
                 } 
			}
			else
			map.put(a[i],1);
		}
		System.out.println("0");
	}
}