

//Write a Java Program to find surface area and volume of a cuboid.






import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       double length=sc.nextDouble();
        double  width=sc.nextDouble();
         double height=sc.nextDouble();
      
        double  area=2*(length*width+length*height+width*height);       //no need ()
         double  volume=length*width*height;
        
        System.out.println(area);
        System.out.println(volume);
       
    }
}