    import java.awt.Point;
    import java.util.Scanner;
     
     
    public class rank {
     
    	public static void main(String[] args) {
    		// TODO Auto-generated method stub
     
    		
    		Scanner input = new Scanner(System.in);
    		 int n = input.nextInt();
    		 int k = input.nextInt();
    		 Point[] a  = new Point[n];
    		 
    		 for(int i=0 ; i<n ; i++){
    			 int x = input.nextInt();
    			 int y = input.nextInt();
    			 a[i] = new Point(x,y);
    			 
    			 int j =i;
    			 while(j>0 && 
    					 (a[j].x > a[j-1].x || (a[j].x == a[j-1].x && a[j].y < a[j-1].y))){
    				 Point temp = a[j];
    				 a[j] = a[j-1];
    				 a[j-1] = temp;
    				 j--;
    			 }
    		 }
    		 
    		 int counter =0;
    		 for(int i=0 ;i<n ; i++){
    			 if(a[i].equals(a[k-1])){
    				 counter++;
    			 }
    		 }
    		 System.out.println(counter);
    		 input.close();
    	}
     
    }