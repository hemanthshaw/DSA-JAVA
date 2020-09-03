import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {101, 309, 287, 756, 745, 567, 879, 498, 132, 265, 967, 798, 898, 118};
            
            System.out.println("User entered Array: ");
            RadixSort.printArray(array);
            
            int max_ele=getMax(array);
            for(int i=1;max_ele/i>0;i*=10)
            RadixSort.countSort(array,array.length,i);
            
            System.out.println("\n\nAfter sorting: ");
            RadixSort.printArray(array);
        }//end of method
        public static int getMax(int[] array)
        {
            int max_ele=array[0];
            for(int i=1;i<array.length;i++)
            max_ele=Math.max(max_ele,array[i]);
            return max_ele;
        }

    }//end of class
class RadixSort
{
       public static void countSort(int array[],int n,int pos)
            {
                int output[]=new int[n];
                int count[]=new int[10];
                for(int i=0;i<n;i++)
                   count[(array[i]/pos)%10]++;
                for(int i=1;i<10;i++)
                   count[i]=count[i-1]+count[i];
                for(int i=n-1;i>=0;i--)
                {
                    output[--count[(array[i]/pos)%10]]=array[i];
                }
                for(int i=0;i<n;i++)
                    array[i]=output[i];
         }//end of method
            public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
}