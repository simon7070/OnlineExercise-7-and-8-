package com.company;
import java.util.Scanner;
public class Group4_problemOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int pro = 0;
        int input = 0;
        
        System.out.print("Enter number of times: " );
        int numbers = in.nextInt();

        for(int num = 0; num < numbers; num++)
        {
            System.out.print("Number: ");
             input = in.nextInt();
             sum = sum + input;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / input);
    }
}
