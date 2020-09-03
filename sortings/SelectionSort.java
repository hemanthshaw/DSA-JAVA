import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
            
            System.out.println("User entered Array: ");
            SelectionSort.printArray(array);
            
            SelectionSort.selectionSort(array,array.length-1);
            
            System.out.println("\n\nAfter sorting: ");
            SelectionSort.printArray(array);
        }//end of method

    }//end of class
class SelectionSort
{
            public static void selectionSort(int array[],int n)
            {
            for(int i=0;i<n-1;i++)
            {
                int min_right=i;
                int min_ele=array[i];
                for(int j=i+1;j<n;j++)
                {
                    if(min_ele>array[j])
                    {
                        min_ele=array[j];
                        min_right=j;
                    }
                }
                //swap with smallest element
                int temp=array[i];
                array[i]=min_ele;
                array[min_right]=temp;
            }
            }//end of method
            public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
}