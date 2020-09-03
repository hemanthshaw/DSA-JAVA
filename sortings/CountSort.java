import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
            
            System.out.println("User entered Array: ");
            CountingSort.printArray(array);
            
            CountingSort.countSort(array,array.length);
            
            System.out.println("\n\nAfter sorting: ");
            CountingSort.printArray(array);
        }//end of method

    }//end of class
class CountingSort
{
                public static void countSort(int array[],int n)
                {
                  int output[]=new int[n];  
                  int count[]=new int[1000+5];//sort the elements based on given range
                  for(int i=0;i<n;i++)
                  count[array[i]]++;
                  for(int i=1;i<=1000;i++)
                  count[i]=count[i-1]+count[i];

                    for (int i = n-1; i>=0; --i){  
                        output[count[array[i]]-1] = array[i];  
                         --count[array[i]];  
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