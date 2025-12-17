

//Q12. Java Program to check whether the last digit of a number is odd or even




import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
     int ld=num%100;
     if(ld%2==0){
         System.out.println("Even");
     }
        else{
             System.out.println("Odd");
        }
    }
}