//	Write a Java Program to convert Fahrenheit to Celsius.


import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double f=sc.nextDouble();           //use double
        double celsius=(5/9.0*(f-32));
        System.out.println(celsius);
    }
}