// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/10/2022
// Assignment: Module 5 Assignment
// Purpose: Create while loops

public class Michaelsloops {
    public static void main(String[]args) {

        double loop1 = 0;
        int i = 3;
        while(i<=99){
            loop1 += (1.0/i);
            i+=3;
        }
        
        System.out.printf("%.6f\n", loop1);
        
        double loop2 = 0;
        int j = 99;
        while(j>=3){
            loop2 += (1.0/j);
            j-=3;
        }
        System.out.printf("%6f\n", loop2);
    }
}