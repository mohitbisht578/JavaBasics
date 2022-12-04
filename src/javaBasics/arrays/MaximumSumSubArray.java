package javaBasics.arrays;

public class MaximumSumSubArray {

    public static int maxSumSubArray(int arr[]) {

        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            curSum += arr[i];
            if(maxSum < curSum)
                maxSum = curSum;
            if(curSum < 0)
                curSum = 0;
        }

        return maxSum;
    }
    public static void main(String[] args) {

        int arr[] = {6, -7, 4, -2, 1, 5, -4};
        int sum = maxSumSubArray(arr);

        System.out.println(sum);

    }
}
