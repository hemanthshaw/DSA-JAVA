import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
            
            System.out.println("User entered Array: ");
            BubbleSort.printArray(array);
            
            BubbleSort.bubbleSort(array,array.length-1);
            
            System.out.println("\n\nAfter sorting: ");
            BubbleSort.printArray(array);
        }//end of method

    }//end of class
class BubbleSort
{
        public static void bubbleSort(int array[],int n)
        {
            for(int i=0;i<n-1;i++)
            {
                for(int j=0;j<n-i-1;j++)
                {
                    if(array[j]>array[j+1])
                    {
                        int temp=array[j];
                        array[j]=array[j+1];
                        array[j+1]=temp;
                    }
                }//end of innner loop
            }//end of outer loop
        }//end of method
            public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
}