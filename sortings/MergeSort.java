import java.util.*;
    public class Main {

        public static void main(String[] args) {
            int array[] = {10, 3, 2, 7, 7, 5, 8, 4, 1, 2, 9, 7, 8, 11};
            
            System.out.println("User entered Array: ");
            MergeSort.printArray(array);
            
            MergeSort.mergeSort(array, 0, array.length-1);
            
            System.out.println("\n\nAfter sorting: ");
            MergeSort.printArray(array);
        }//end of method

    }//end of class
     class  MergeSort {
          public static void mergeSort(int array[],int low,int high)
          {
              if(low< high)
              {
                  int mid=low+(high-low)/2;
                  mergeSort(array,low,mid);
                  mergeSort(array,mid+1,high);
                  merge(array,low,mid,high);
              }
          }
          public static void merge(int array[],int low,int mid,int high)
          {
               int n1=mid-low+1;
               int n2=high-mid;
               int left[]=new int[n1];
               int right[]=new int[n2];
               for(int i=0;i<n1;i++)
               left[i]=array[low+i];
               for(int i=0;i<n2;i++)
               right[i]=array[mid+1+i];
               int k=low,i=0,j=0;
               while(i<n1 && j<n2)
               {
                   if(left[i]<=right[j])
                   array[k++]=left[i++];
                   else
                   array[k++]=right[j++];
               }
               while(i<n1)
               array[k++]=left[i++];
               while(j<n2)
               array[k++]=right[j++];
          }

        //end of method
         
         


        //end of method
        
        
        public static void printArray(int []array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]+"  ");
            }
        }//end of method
        
    }//end of class
