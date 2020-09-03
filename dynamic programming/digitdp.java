import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String l=sc.next();
        long n=Long.parseLong(l)-1;
        String r=sc.next();
        System.out.println(solve(r,0,0,0,true)-solve(n+"",0,0,0,true));
    }
    public static long solve(String s,int pos,int n6,int n8,boolean tight)
    {
        if(pos==s.length())
        {
            if((n6!=0 && n8!=0 )|| (n6==0 && n8==0))
            return 0;
            else
            return 1;
        }
        long res=0;
        if(tight)
        {
             for(int i=0;i<=s.charAt(pos)-'0';i++)
             {
                    if(i==6)
                    res+=solve(s,pos+1,n6+1,n8,i==s.charAt(pos)-'0');
                    else if(i==8)
                    res+=solve(s,pos+1,n6,n8+1,i==s.charAt(pos)-'0');
                    else
                    res+=solve(s,pos+1,n6,n8,i==s.charAt(pos)-'0');
             } 
        }
        else
        {
            for(int i=0;i<=9;i++)
            {
                   if(i==6)
                    res+=solve(s,pos+1,n6+1,n8,i==s.charAt(pos)-'0');
                    else if(i==8)
                    res+=solve(s,pos+1,n6,n8+1,i==s.charAt(pos)-'0');
                    else
                    res+=solve(s,pos+1,n6,n8,i==s.charAt(pos)-'0');
            }
        }
        return res;
    }
}