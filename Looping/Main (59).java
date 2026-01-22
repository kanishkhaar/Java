

//Q15. Write a Java program to check whether a given number is a Perfect Number or not.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); 
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num && num != 0) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}


