


//Q17. Java Program to check whether two numbers have the same last digit






import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int last1=num1%10;
    int last2=num2%10;
    if(last1==last2){
        System.out.println("both The numbers have the same last digit");
    }
    else{
        System.out.println("The numbers do NOT have the same last digit");
    }
    }
}