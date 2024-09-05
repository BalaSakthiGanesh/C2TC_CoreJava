package com.tns.Day2;

public class SecondProgram {

	public static void main(String[] args) {
		//  if-else Conditional Operations
        int number = -10;

        System.out.println("if-else Condition:");
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        //  Nested if-else Condition
        int age = 18;
        System.out.println("\nNested if-else Condition:");
        if (age >= 18) {
            if (age >= 65) {
                System.out.println("Senior Citizen.");
            } else {
                System.out.println("Adult.");
            }
        } else {
            System.out.println("Minor.");
        }


        //  switch Conditional Operations
        int dayOfWeek = 5;

        System.out.println("\nswitch Condition:");
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week.");
                break;
        }

        // if condition
        if (number > 0) {
            System.out.println("The number is positive.");
        }
       //Break statement
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;  // Exit the loop when i is 3
            }
            System.out.println("i = " + i);
        }

        //  continue statement
        System.out.println("\nContinue Statement Example:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue;  // Skip the iteration when j is 3
            }
            System.out.println("j = " + j);
        }



	}

}
