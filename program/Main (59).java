

//Q14. Java Program to check whether a number is divisible by both 3 and 5




import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    if(num%3==0 && num%5==0){
        System.out.println("number is divisible by both 3 and 5");
    }
    else{
        System.out.println("number is not divisible by both 3 and 5");
    }
    }
}