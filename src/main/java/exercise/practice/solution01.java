package exercise.practice;

    /*
        UCF COP3330 Fall 2021 Assignment 1 Solution
        Copyright 2021 first_name last_name
    */

import java.util.Scanner;

public class solution01 {

    /*
    print: "What is your name? "
    'name': read string from user
    print: "Hello, 'name', nice to meet you!
     */

    public static void main(String[] args) {

        System.out.println("What is your name? ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.print("Hello, " + name + ", nice to meet you!");
    }
}
