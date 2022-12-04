package javaBasics.arrays;

public class DeleteElement {

    public static void main(String[] args) {

        int arr[] = {2, 1, 4, 6, 5};
        int key = 6;

        delete(arr, key);
        for (int e : arr) {
            System.out.println(e);
        }
    }

        public static int delete ( int arr[], int key){
            int len = arr.length;
            int i = 0;
            for (; i < len; i++) {
                if (arr[i] == key) {
                    break;
                }
            }
            if (i == len)
                return len;
            for (int j = i; j < len-1; j++) {
                arr[j] = arr[j + 1];
            }
            return len - 1;
    }
}
