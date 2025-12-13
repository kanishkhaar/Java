

//Q5.Write a java Program to Convert Kilometers to Meters


//meter=kilometer*1000                       1kilometer=1meter

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         double km=sc.nextDouble();
         
         double meters=km*1000;      
        
        
        System.out.println(meters);
    }
}