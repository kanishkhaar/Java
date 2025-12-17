
//Q13. Java Program to check whether a number is positive, negative, or zero







import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    if(num>0){
        System.out.println("positive");
    }
    else if(num<0){
        System.out.println("Negative");
    }
    else{
        System.out.println("Zero");
    }
    }
}