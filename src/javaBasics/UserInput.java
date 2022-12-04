package javaBasics;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your age");
        int age = sc.nextInt();
        System.out.println("your age is : " +age);

        sc.nextLine();
        System.out.println("please enter your name");
        String name = sc.nextLine();
        System.out.println("your name is : " + name);
    }
}
