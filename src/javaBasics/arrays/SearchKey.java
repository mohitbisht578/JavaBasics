package javaBasics.arrays;

public class SearchKey {

    public static void main(String[] args) {

        int arr[] = {2, 1, 4, 6, 5};
        int key = 0;
        int res = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == key) {
                res = i;
                break;
            }
        }
        if(res == -1) {
            System.out.println("key not found");
        }
        else {
            System.out.println("key is present : " + key);
        }
    }
}
