package com.company;
import java.util.Scanner;

public class Group4_problem1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("\t\t\tName: ");
        String name = in.nextLine();
        System.out.println("\t\t\t<M> Manager <S> Supervisor <E> Employee");
        System.out.print("\t\t\tPosition: ");

        //Switch case Gross and Bonus
        String choice = in.nextLine();
        int rateManager = 500;
        int rateSupervisor = 400;
        int rateEmployee = 300;
        switch (choice) {
            case "M":
                System.out.println("\t\t\tRate: P500");
                System.out.print("\t\t\tNo. of Days Worked: ");
                int daysWorked = in.nextInt();
                System.out.println("");
                int gross = rateManager * daysWorked;
                System.out.print("\t\tGross: " + gross);

                int Bonus = 0;
                if (gross >= 8000) {
                    Bonus = 1000;
                } else if (gross >= 5000) {
                    Bonus = 750;
                } else if (gross >= 3000) {
                    Bonus = 500;
                } else if (gross < 3000) {
                    Bonus = 0;
                }
                System.out.println("\t\t\tBonus: " + Bonus);
                System.out.println("");

                System.out.println("\tDeductions:");

                double Tax = 0;
                if (gross >= 7000) {
                    Tax = gross * 0.15;
                } else if (gross >= 4000) {
                    Tax = gross * 0.10;
                } else if (gross >= 2000) {
                    Tax = gross * 0.05;
                }
                System.out.println("\t\t\tTax: " + Tax);

                double sss = gross * 0.10;
                System.out.println("\t\t\tSSS: " + sss);
                int medicare = 100;
                System.out.println("\t\t\tMedicare: " + medicare);
                System.out.println("");
                double totalDeduction = Tax + sss + medicare;
                double netIncome = gross + Bonus - totalDeduction;

                System.out.print("Total Deduction: " + totalDeduction);
                System.out.print("\t\t\tNet Income: " + netIncome);
                break;

            case "S":
                System.out.println("\t\t\tRate: P400");
                System.out.print("\t\t\tNo. of Days Worked: ");
                int daysWorked2 = in.nextInt();
                System.out.println("");
                int gross2 = rateSupervisor * daysWorked2;
                System.out.print("\t\tGross: " + gross2);

                int Bonus2 = 0;
                if (gross2 >= 8000) {
                    Bonus2 = 1000;
                } else if (gross2 >= 5000) {
                    Bonus2 = 750;
                } else if (gross2 >= 3000) {
                    Bonus2 = 500;
                } else if (gross2 < 3000) {
                    Bonus2 = 0;
                }
                System.out.println("\t\t\tBonus: " + Bonus2);
                System.out.println("");

                System.out.println("\tDeductions:");

                double Tax2 = 0;
                if (gross2 >= 7000) {
                    Tax2 = 2 * 0.15;
                } else if (gross2 >= 4000) {
                    Tax2 = gross2 * 0.10;
                } else if (gross2 >= 2000) {
                    Tax2 = gross2 * 0.05;
                }
                System.out.println("\t\t\tTax: " + Tax2);

                double sss2 = gross2 * 0.10;
                System.out.println("\t\t\tSSS: " + sss2);
                int medicare2 = 100;
                System.out.println("\t\t\tMedicare: " + medicare2);
                System.out.println("");
                double totalDeduction2 = Tax2 + sss2 + medicare2;
                double netIncome2 = gross2 + Bonus2 - totalDeduction2;

                System.out.print("Total Deduction: " + totalDeduction2);
                System.out.print("\t\t\tNet Income: " + netIncome2);
                break;

            case "E":
                System.out.println("\t\t\tRate: P300");
                System.out.print("\t\t\tNo. of Days Worked: ");
                int daysWorked3 = in.nextInt();
                System.out.println("");
                int gross3 = rateSupervisor * daysWorked3;
                System.out.print("\t\tGross: " + gross3);

                int Bonus3 = 0;
                if (gross3 >= 8000) {
                    Bonus3 = 1000;
                } else if (gross3 >= 5000) {
                    Bonus3 = 750;
                } else if (gross3 >= 3000) {
                    Bonus3 = 500;
                } else if (gross3 < 3000) {
                    Bonus3 = 0;
                }
                System.out.println("\t\t\tBonus: " + Bonus3);
                System.out.println("");

                System.out.println("\tDeductions:");
//deductions
                double Tax3 = 0;
                if (gross3 >= 7000) {
                    Tax3 = 2 * 0.15;
                } else if (gross3 >= 4000) {
                    Tax2 = gross3 * 0.10;
                } else if (gross3 >= 2000) {
                    Tax2 = gross3 * 0.05;
                }
                System.out.println("\t\t\tTax: " + Tax3);

                double sss3 = gross3 * 0.10;
                System.out.println("\t\t\tSSS: " + sss3);
                int medicare3 = 100;
                System.out.println("\t\t\tMedicare: " + medicare3);
                System.out.println("");
                double totalDeduction3 = Tax3 + sss3 + medicare3;
                double netIncome3 = gross3 + Bonus3 - totalDeduction3;

                System.out.print("Total Deduction: " + totalDeduction3);
                System.out.print("\t\t\tNet Income: " + netIncome3);
                break;


            default:
                System.out.println("Invalid Input");


        }

    }
}
