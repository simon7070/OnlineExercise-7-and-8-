package com.company;
import java.util.Scanner;

public class Group4_problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        System.out.println("\t\t\t\t\tPRESIDENTIAL ELECTIONS");
        System.out.println("\t\t\t\t\tcandidates:");
        System.out.println("");
        System.out.println("A. ROBREDO \t\t\t\t\t B. MARCOS \t\t\t\t\t C.VILLAR" );
        System.out.println("");
        System.out.println("[ Type 'V'- vote \t\t 'R'-result \t\t 'Q'-quit ]");

        System.out.println("Enter your Choice: ");
       choice = input.nextLine();
        switch (choice)
        {
            case "V":
                System.out.println("Enter your Vote: ");
                input.nextLine();

        }
           // while(choice != 'V');
       // System.out.println("Invalid Please.... Try Again!!!");
    }
}
