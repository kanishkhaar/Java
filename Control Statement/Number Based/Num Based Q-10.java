


//Q10.Java Program to check whether the sum of two numbers is even or odd



import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        if (sum % 2 == 0) {
            System.out.println("Sum = "+ sum + " is Even");
        } else {
            System.out.println("Sum = "+ sum + " is Odd");
        }
    }
}
