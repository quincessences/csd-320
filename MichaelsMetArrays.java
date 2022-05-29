// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 05/08/2022
// Assignment: Module 2 Assignment (Submission for Module 12 Redo Assignment)
// Purpose: Create a program with methods that return location of largest/smallest element in array.
// References: https://stackoverflow.com/questions/8408316/return-position-of-value-in-a-2d-array-java, https://www.csinfo360.com/2021/01/find-position-of-element-in-2d-array.html

public class MichaelsMetArrays {
        public static void main(String args[]) {
                int[][] arrayInt = {{2,4,6},
                {6,8,10},
                {12,14,16},
                {18,20,22}};
                
                double[][] arrayDouble = {{4.4,8.8,12.1},
                {16.1,20.2,24.2},
                {28.2,32.3,36.3},
                {40.4,44.4,48.4}};
                
                int[] result = new int[2];
                result=locateSmallest(arrayInt);
                System.out.println("The integer array smallest element is on row "+(result[0]+1) + " of column "+(result[1]+1)+" with the value of "+ arrayInt[result[0]][result[1]]+".");
                result=locateLargest(arrayInt);
                System.out.println("The integer array largest element is on row "+(result[0]+1) + " of column "+(result[1]+1)+" with the value of "+ arrayInt[result[0]][result[1]]+".");
                result=locateSmallest(arrayDouble);//store the result of locateSmallest in result array
                System.out.println("The double array smallest element is on row "+(result[0]+1) + " of column "+(result[1]+1)+" with the value of "+ arrayDouble[result[0]][result[1]]+".");
                result=locateLargest(arrayDouble);//store the result of locateLargest in result array
                System.out.println("The double array largest element is on row "+(result[0]+1) + " of column "+(result[1]+1)+" with value of "+ arrayDouble[result[0]][result[1]]+".");
        }
        
        public static int[] locateSmallest(double[][] arrayParam) {
                int res[] = { 0, 0 };
                for (int i = 0; i < arrayParam.length; i++) {
                        for (int j = 0; j < arrayParam[i].length; j++) {
                                if (arrayParam[i][j] < arrayParam[res[0]][res[1]]) {
                                        res[0] = i;
                                        res[1] = j;
                                }
                        }
                }
                return res;
        }

        public static int[] locateLargest(double[][] arrayParam) {
                int res[] = { 0, 0 };
                for (int i = 0; i < arrayParam.length; i++) {
                        for (int j = 0; j < arrayParam[i].length; j++) {
                                if (arrayParam[i][j] > arrayParam[res[0]][res[1]]) {
                                        res[0] = i;
                                        res[1] = j;
                                }
                        }
                }
                return res;
        }

        public static int[] locateSmallest(int[][] arrayParam) {
                int res[] = { 0, 0 };
                for (int i = 0; i < arrayParam.length; i++) {
                        for (int j = 0; j < arrayParam[i].length; j++) {
                                if (arrayParam[i][j] < arrayParam[res[0]][res[1]]) {
                                        res[0] = i;
                                        res[1] = j;
                                }
                        }
                }
                return res;
        }

        public static int[] locateLargest(int[][] arrayParam) {
                int res[] = { 0, 0 };
                for (int i = 0; i < arrayParam.length; i++) {
                        for (int j = 0; j < arrayParam[i].length; j++) {
                                if (arrayParam[i][j] > arrayParam[res[0]][res[1]]) {
                                        res[0] = i;
                                        res[1] = j;
                                }
                        }
                }
                return res;
        }

}