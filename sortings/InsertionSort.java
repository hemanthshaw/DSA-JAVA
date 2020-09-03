import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
            
            System.out.println("User entered Array: ");
            InsertionSort.printArray(array);
            
            InsertionSort.insertionSort(array,array.length-1);
            
            System.out.println("\n\nAfter sorting: ");
            InsertionSort.printArray(array);
        }//end of method

    }//end of class
class InsertionSort
{
                public static void insertionSort(int array[],int n)
                {
                    for(int i=1;i<n;i++)
                    {
                        int j=i-1;
                        int key=array[i];
                        while(j>=0 && array[j]>key){
                        array[j+1]=array[j];
                        j--;
                        }
                        array[j+1]=key;
                    }
                }//end of method
            public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
}