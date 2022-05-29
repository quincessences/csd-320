// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/24/2022
// Assignment: Module 8 Assignment
// Purpose: Write a program with four methods for calculating the cost of a yearly auto service visit.
// References: https://www.w3schools.com/java/java_methods_overloading.asp, https://beginnersbook.com/2013/05/method-overloading/

public class MichaelsServiceMethods {
    public static final double serviceCharges=900;
    
    public static double yearlyService() {
            return serviceCharges;
    }
    
    public static double yearlyService(double oilChange) {
            return serviceCharges+oilChange;
    }
    
    public static double yearlyService(double oilChange,double tireRotation) {
            return serviceCharges+oilChange+tireRotation;
    }
    
    public static double yearlyService(double oilChange,double tireRotation,double coupon) {
            return (serviceCharges+oilChange+tireRotation)-coupon;
    }
    
    public static void main(String[] args) {
            System.out.println(yearlyService());
            System.out.println(yearlyService(45));
            System.out.println(yearlyService(45,35));
            System.out.println(yearlyService(45,35,100));
    }
}