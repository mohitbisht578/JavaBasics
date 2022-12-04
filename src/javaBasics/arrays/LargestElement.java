package javaBasics.arrays;

public class LargestElement {

    public static void main(String[] args) {

        int arr[] = {1, 2, 4, 7};
        int largest = 0;

        if(arr.length == 0)
            return;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > arr[largest]) {
                arr[largest] = arr[i];
            }
        }

        System.out.println("largest element in an array is : " + arr[largest]);
    }
}
