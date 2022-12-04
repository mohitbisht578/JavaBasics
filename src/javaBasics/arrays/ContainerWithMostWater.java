package javaBasics.arrays;

public class ContainerWithMostWater {

    public static int containerWithMostWater(int arr[]) {

        int maxArea = 0;
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int height = Math.min(arr[left], arr[right]);
            int distance = right - left;
            int area = height * distance;
            maxArea = Math.max(maxArea, area);

            if(arr[left] < arr[right]) {
                left++;
            }
            else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {

        int arr[] = {1, 8, 6, 2, 4, 5, 8, 3, 7};
        int max = containerWithMostWater(arr);

        System.out.println(max);

    }
}
