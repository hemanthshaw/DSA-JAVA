import java.util.*;
import java.io.*;
public class Check{
    private static class Pair
    {
        char c;
        int pos;
        Pair(char c,int pos)
        {
            this.c=c;
            this.pos=pos;
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        int ans=isbalanced(s);
        if(ans==0)
        System.out.println("Success");
        else
         System.out.println(ans);
    }
    public static int isbalanced(String s)
    {
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Pair>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
           char cc=s.charAt(i);
           if(cc==')' || cc=='}' || cc==']')
           {
               if(stack.size()>0 && stack.peek().c==map.get(cc))
                 stack.pop();
               else
                  return i+1;
           }
           else if(cc=='(' || cc=='{' || cc=='[')
           stack.push(new Pair(cc,i));
        }
         return stack.size()>0?stack.peek().pos+1:0;
    }
}