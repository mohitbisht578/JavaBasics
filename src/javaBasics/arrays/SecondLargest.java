package javaBasics.arrays;

public class SecondLargest {

    public static void main(String[] args) {

        int arr[] = {5, 2, 4, 7};
        int n = findSecondLargest(arr);
        System.out.println(arr[n]);

    }
    public static int findSecondLargest(int arr[]) {

        if (arr.length < 2)
            return -1;

        int largest = 0;
        int secondLargest = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (secondLargest == -1 || arr[i] > arr[secondLargest]) {
                    secondLargest = i;
                }
            }
        }
        return secondLargest;
    }

}

