

//Q15. Java Program to check whether a number is divisible by either 3 or 7





import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    if(num%3==0 || num%7==0){
        System.out.println("number is divisible by either 3 or 7");
    }
    else{
        System.out.println("number is not divisible by either 3 or 7");
    }
    }
}