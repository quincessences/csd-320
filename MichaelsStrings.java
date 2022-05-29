// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/02/2022
// Assignment: Module 4 Assignment
// Purpose: Write a program that prompts a user to enter two strings and then checks the strings entered.

import java.util.Scanner;

import org.w3c.dom.Text;

public class MichaelsStrings {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter string Text1: ");
        String Text1 = in.nextLine();

        System.out.println("Enter string Text2: ");
        String Text2 = in.nextLine();

        if (Text1.indexOf(Text2) != -1) {
            System.out.printf("%s is a substring of %s%n", Text2, Text1);
        }
        else {
            System.out.printf("%s is not a substring of %s%n", Text2, Text1);
        }
    }
}