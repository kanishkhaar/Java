//Write a Java Program to find the area of a circle.





import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
       int r1=sc.nextInt();         //2
         int r2=sc.nextInt();       //6
           int y1=sc.nextInt();     //3
             int y2=sc.nextInt();   //9
             double circle=Math.sqrt((r2-r1)*(r2-r1)+(y2-y1)*(y2-y1));      //Math -> M will be the capital
        System.out.println(circle);         //7.2111
    }
}