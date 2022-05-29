// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/17/2022
// Assignment: Module 6 Assignment
// Purpose: Create program using nested for loops to display a set output
// References: https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/; https://www.programiz.com/java-programming/examples/pyramid-pattern; https://gist.github.com/java2017/504b1a5a4583decdbf2a705e952de96c);

public class MichaelsNestedLoops {
    public static void main(String[] args){
        int row = 7;
        for (int i=1; i<=row; i++){
            for(int j=1; j<=row-i; j++)
                System.out.print("    ");
            for(int j=0; j<i; j++)
                System.out.printf("%4d",(int)Math.pow(2,j));
            for(int j=i-2; j>=0;j--)
                System.out.printf("%4d",(int)Math.pow(2,j));
            System.out.println(""); 
        }
    }
}