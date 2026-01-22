

//Q19. Java Program to check whether the product of two numbers is positive or negative



import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
  int product=a*b;
        if (product>0) {
            System.out.println("The product is positive.");
        } else if (product<0) {
            System.out.println("The product is negative.");
        } else {
            System.out.println("The product is zero.");
        }
    }
}