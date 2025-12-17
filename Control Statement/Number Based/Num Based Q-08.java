


//Q8-Write a Java Program to print the last digit of a given number N.




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int lastDigit = n % 10;  // Directly get last digit

        System.out.println("Last digit = " + lastDigit);
    }
}