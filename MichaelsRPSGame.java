// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/02/2022
// Assignment: Module 3 Assignment
// Purpose: Create a simple Rock-Paper-Scissors program.

import java.util.Scanner;
import java.util.Random;

public class MichaelsRPSGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while(true) {
            System.out.println("\n1.Rock\n2.Paper\n3.Scissors");
            System.out.print("Enter your selection (1,2, or 3):");
            int useroptions = sc.nextInt();

            String userSelection = "";
            String computerSelection = "";

            if(useroptions == 1) {
                userSelection = "Rock";
            }
            else if(useroptions == 2) {
                userSelection = " Paper";
            }
            else if(useroptions == 3) {
                userSelection = "Scissors";
            }
            else {
                System.out.println("Invalid choice.");
                break;
            }

            int computeroptions = rand.nextInt(3)+1;

            if(computeroptions == 1) {
                computerSelection = "Rock";
            }
            else if(computeroptions == 2) {
                computerSelection = "Paper";
            }
            else if(computeroptions == 3) {
                computerSelection = "Scissors";
            }

            System.out.println("\nUser chose " + userSelection);
            System.out.println("\nComputer chose " + computerSelection);

            if(useroptions == computeroptions) {
                System.out.println("\nIt's a tie.");
                continue;
            }

            else if((useroptions == 1 && computeroptions == 3) || (useroptions ==2 && computeroptions ==1) || (useroptions ==3 && computeroptions ==2)) {
                System.out.println("\nYou win.");
            }
            else {
                System.out.println("\nYou lose.");
            }

        }
    }
}