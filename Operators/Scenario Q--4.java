

//Q4.Write a java Program to Calculate the Distance Travelled

//distance=speed*time

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         double speed=sc.nextDouble();
         double time=sc.nextDouble();
         double distance=speed*time;      
        
        
        System.out.println(distance);
    }
}