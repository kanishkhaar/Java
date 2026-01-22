

//Q11. Java Program to check whether the first digit of a 3 digit number is odd or even



import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
     int firstdigit=num/100;
     if(firstdigit %2 ==0){
         System.out.println("Even");
     }
        else{
             System.out.println("Odd");
        }
    }
}