// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/24/2022
// Assignment: Module 7 Assignment
// Purpose: Write a method to check that a user's input password (string) is valid (more than 8 characters, both letters/digits, uppercase, lowercase )

import java.util.Scanner;
public class MichaelsPasswordCreation
{
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a password: ");
                String password = input.nextLine();
                check(password);
        }
        public static void check(String password){
            int letter=0,digit=0,lower=0,upper=0;
           // check password length
            if(password.length()>=8){
                    for(int i=0;i<password.length();i++){
                //  check for letters
                    if(Character.isLetter(password.charAt(i))){
                        letter++;
                    }
                //  check for digits
                    if(Character.isDigit(password.charAt(i))){
                        digit++;
                    }
                // check lowercase
                    if(Character.isLowerCase(password.charAt(i))){
                        lower++;
                    }
                  // check uppercase
                    if(Character.isUpperCase(password.charAt(i))){
                        upper++;
                    }
                    }
                    if((letter>=1 && digit>=1) && lower>=1 && upper>=1){
                        System.out.print("The password meets requirements and is valid.");
                    }else{
                        System.out.print("The password does not meet requirements.");
                    }
                }
            else{
                System.out.print("Password length has to be more than 8 digits.");
            }
        }
}