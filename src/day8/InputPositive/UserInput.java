package day8.InputPositive;

import day8.InputPositive.NegativeZeronum;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        while (true) {
            try {
                enterNum();
            } catch (NegativeZeronum e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Exception: InputMismatchException\nsystem Exeception: " + e.getMessage());
            }
        }
    }

    private static void enterNum() throws NegativeZeronum {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a positive integer: ");
            int num = read.nextInt();
            if (num <= 0) {
                throw new NegativeZeronum("Exception: " + num + " it's not a positive number");
            } else if (num > 0) {
                System.out.println("you entered a correct number");
                break;
            }
            else {
                System.out.println(num+" is not int");
            }
        }
    }
}


