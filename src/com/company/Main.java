package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner input = new Scanner(System.in);
        String username = input.next();
        System.out.println("Enter your number");
        String guessnumber = input.next();

        Random random = new Random();
        int a = random.nextInt(100);

        int c = 100;


    }
}
