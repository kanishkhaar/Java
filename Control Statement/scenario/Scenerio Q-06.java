
//Q6.Write a Java program to check pass/fail based on marks (marks ≥ 35 = pass).


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 35 && marks <= 100) {
            System.out.println("Pass");
        } 
        else if (marks >= 0 && marks < 35) {
            System.out.println("Fail");
        } 
        else {
            System.out.println("Invalid marks");
        }
    }
}
