//Write a Java Program to find the area of a rectangle.

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        int area=length*breadth;
        System.out.println(area);
    }
}