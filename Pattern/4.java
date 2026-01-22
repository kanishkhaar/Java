
//Q4.Write a Java program to print a right angle triangle pattern.


import java.util.Scanner;
class Main{
    public static void main (String args[]){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==n||j==1||i==j||i>j){
                System.out.print("* ");
            }
            else{
             System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}