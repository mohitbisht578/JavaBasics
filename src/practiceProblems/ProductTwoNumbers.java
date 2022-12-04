package practiceProblems;

import java.util.Scanner;

public class ProductTwoNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number");
        int a = sc.nextInt();
        System.out.println("enter a second number");
        int b = sc.nextInt();
        int c = a * b;

        System.out.println("product of two numbers is : " + c);
    }
}
