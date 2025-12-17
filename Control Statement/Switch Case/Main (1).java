
//Q1.Java Program to Arithmetic Calculator using switch case Statements


import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1=sc.nextDouble(); //77
        double num2=sc.nextDouble();    //9
        char operator=sc.next().charAt(0);  //+
        switch(operator){
            case '+':
                System.out.println("Sum= " + (num1+num2));   //86
                break;
            case '-':
                System.out.println("Sum= " + (num1-num2));
                break;
            case '*':
                System.out.println("Sum= " + (num1*num2));
                break;
            case '/':
                if (num2 != 0)
                    System.out.println("Sum= " +(num1/num2));
                else
                    System.out.println("Division by zero is not allowed");
                break;
            case '%':
                if (num2 != 0)
                    System.out.println("Sum= " +(num1%num2));
                else
                    System.out.println("Modulo by zero is not allowed");
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
