import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 30, 20, 790, 70, 58, 98, 94, 91, 22, 93, 73, 18, 11};
            int buckets = 4;
            System.out.println("User entered Array: ");
            CycleSort.printArray(array);
        
            CycleSort.cycleSort(array,array.length);
    
            System.out.println("\n\nAfter sorting: ");
            CycleSort.printArray(array);
        }//end of method

    }//end of class
class CycleSort
{
                public static void cycleSort(int array[],int n)
                {
                   for(int cs=0;cs<n;cs++)
                   {
                        int item=array[cs];
                        int pos=cs;
                        for(int i=cs+1;i<n;i++)
                           if(array[i]<item)
                             pos++;

                        int temp=item;
                        item=array[pos];
                        array[pos]=temp;

                        while(pos!=cs)
                        {
                            pos=cs;
                            for(int i=cs+1;i<n;i++)
                              if(array[i]<item)
                                pos++;

                           temp=item;
                           item=array[pos];
                           array[pos]=temp;    
                        }

                   }
                }//end of method
            public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
}