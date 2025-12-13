

//Q8.Write a java Program to Calculate Total Cakes Made


 //total cakes=cakes perday*number of days         

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         int perday=sc.nextInt();
         int days=sc.nextInt();      
       
        int cakes=perday* days;
        System.out.println(cakes);
    }
}