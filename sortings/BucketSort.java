import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 30, 20, 70, 70, 58, 98, 94, 91, 22, 93, 73, 18, 11};
            int buckets = 4;
            System.out.println("User entered Array: ");
            BuckeSort.printArray(array);
        
            BuckeSort.buckeSort(array,array.length,buckets);
            
            System.out.println("\n\nAfter sorting: ");
            BuckeSort.printArray(array);
        }//end of method

    }//end of class
class BuckeSort
{
                public static void buckeSort(int array[],int n,int k)
                {

                  //Find Max_value of array
                  int max_value=array[0];
                  for(int i=1;i<n;i++)
                  max_value=Math.max(max_value,array[i]);
                  max_value++;
                  //create buckets 
                  ArrayList<ArrayList<Integer>> buckets=new ArrayList<>();
                  for(int i=0;i<=k;i++)
                  buckets.add(new ArrayList<Integer>());
                  //store respective elements in each bucket 
                  for(int i=0;i<n;i++)
                  {
                     int bi = (array[i]*k)/max_value;
                     buckets.get(bi).add(array[i]);
                  }
                  //sort all buckets
                  for(int i=0;i<=k;i++)
                  Collections.sort(buckets.get(i));
                  //sort the original array
                  int  index=0;
                  for(int i=0;i<=k;i++)
                    for(int j=0;j<buckets.get(i).size();j++)
                      array[index++]=buckets.get(i).get(j);
                }//end of method
            public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
}