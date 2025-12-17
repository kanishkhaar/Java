

//Q3. Java Program to check whether a point (x, y) lies in which quadrant

//1 -> +,+
//2 -> 1,+
//3 -> -,-
//4 -> +,-

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>0 && y>0) {
            System.out.println("Point lies in First Quadrant");
        } 
        else if (x<0 && y>0) {
            System.out.println("Point lies in Second Quadrant");
        } 
        else if (x<0 && y<0) {
            System.out.println("Point lies in Third Quadrant");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Point lies in Fourth Quadrant");
        } 
        else if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        } 
        else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        } 
        else {
            System.out.println("Point lies on the X-axis");
        }
    }
}
