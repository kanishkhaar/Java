


//Q16. Java Program to check whether a number is divisible by both 2 and 5 but not by 8.





import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    if(num%2==0 && num%5==0  && num%8!=0){
        System.out.println("number is divisible by both 2 and 5 but not by 8");
    }
    else{
        System.out.println("number is divisible by both 2 and 5 but not by 8");
    }
    }
}