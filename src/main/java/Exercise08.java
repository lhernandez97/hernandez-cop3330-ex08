/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner in = new Scanner(System.in);
        //ask the user how many people will be over
        System.out.print("How many people? ");
        int people = in.nextInt();
        //ask the user how many pizzas they have
        System.out.print("How many pizzas? ");
        int pizzas = in.nextInt();
        //ask the user how many slices of pizzas per pie
        System.out.print("How many slices per pizza? ");
        int slices = in.nextInt();
        //now give the user the amount of people, pizza pies, and total slices
        System.out.printf("%d people with %d pizzas (%d slices)%n", people, pizzas, (pizzas * slices));
        //now calculate how many slices each person can get to be even
        //and also calculate if there are any leftovers
        int slices_each = (pizzas * slices) / people;
        int leftovers = (pizzas * slices) % people;
        System.out.printf("Each person gets %d pieces of pizza.%n", slices_each);
        System.out.printf("There are %d leftover pieces.", leftovers);
    }
}
