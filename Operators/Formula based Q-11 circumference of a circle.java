
//Write a Java Program to find the circumference of a circle.




import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       double  radius=sc.nextDouble();
        double circle = 2*Math.PI*radius;
        System.out.println(circle);
    }
}