
//Write a Java Program to find surface area, volume, and perimeter of a cube.





import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       double  side=sc.nextDouble();
      
        double  area=6*side*side;
         double  volume=side*side*side;
          double  perimeter=12*side;
        System.out.println(area);
        System.out.println(volume);
        System.out.println(perimeter);
    }
}