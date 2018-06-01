package com.company;

 import java.util.Scanner;

public class Main {
    private static String name;
    private static String lastname;
    private static String age;
    private static int weight;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter  your name: ");
        name =  keyboard.nextLine();

        System.out.println("Enter  your lastname: ");
        lastname =  keyboard.nextLine();

        System.out.println("Enter  your age: ");
        age =  keyboard.nextLine();

        System.out.println("Enter  your weight: ");
        weight =  keyboard.nextInt();

     System.out.println(" My firstname is " + name  + " and my lastname is " + lastname +
     ", ..by the way  my age is " + age + " and my weight is " + weight);
	// write your code here
    }
}
