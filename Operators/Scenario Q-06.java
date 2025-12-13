

//Q6.Write a java Program to Convert Bytes to bits



//bits=bytes*8                      

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         double bytes=sc.nextDouble();
         double bit=bytes*8;      
        
        System.out.println(bit);
    }
}