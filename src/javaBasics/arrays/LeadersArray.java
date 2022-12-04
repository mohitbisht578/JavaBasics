package javaBasics.arrays;

public class LeadersArray {

    public static void leadersInArray(int arr[]) {

        int largest = Integer.MIN_VALUE;
        for(int i=arr.length-1; i>=0; i--) {
            if(arr[i] > largest) {
                largest = arr[i];
                System.out.print(arr[i] + " ");
            }
        }


    }

    public static void main(String[] args) {

        int arr[] = {2, 10, 7, 6, 4, 1, 3};
        leadersInArray(arr);

    }
}
