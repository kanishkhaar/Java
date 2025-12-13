
//Write a Java Program to find surface area and volume of a sphere.




import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       double r=sc.nextDouble();
   
        
        double  area=4* Math.PI *r*r;      
         double  volume=(4.0/3.0)* Math.PI *r*r*r;
        
        System.out.println(area);
        System.out.println(volume);
       
    }
} 