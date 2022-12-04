package javaBasics.arrays;

public class RemoveDuplicateSortedArray {

    public static void main(String[] args) {

        int arr[] = {2, 2, 3, 4, 4, 7};
        int j = 0;
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
           if(arr[i] != arr[i+1]) {
               arr[j++] = arr[i];
           }
       }
        arr[j++] = arr[n-1];

        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}

