// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 05/06/2022
// Assignment: Module 2 Assignment (Submission for Module 12 Redo Assignment)
// Purpose: Create a program to calculate the initial and final temperature of water.

import java.util.*;

public class MichaelsModuleTwo {
    public static void main(String[] args) {
        Scanner Temperature = new Scanner (System.in);
        System.out.print("Enter water weight (in kilograms): ");
        double waterMass = Temperature.nextDouble();
        System.out.print("Enter the initial temperature (in Celsius): ");
        double initialTemperature = Temperature.nextDouble();
        System.out.print("Enter the final temperature (in Celsius): ");
        double finalTemperature = Temperature.nextDouble();
        System.out.println("The energy required to heat the water is "+(waterMass*(finalTemperature-initialTemperature)*4184+" Joules."));
    }
}