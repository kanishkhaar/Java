
//Write a Java Program to find the perimeter of a rectangle.



import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double length =sc.nextDouble();
double width =sc.nextDouble();
double perimeter =2*(length+width);     //2*(l+w)
System.out.println(perimeter);
	}
}
