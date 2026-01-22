

//Q9.Write a java Program to Calculate Simple Interest


//simpleInterest = ( principal * rate * time) / 100       

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
         int principal=sc.nextInt();
         int rate=sc.nextInt();  
          int time=sc.nextInt();
          int SI=principal*rate*time/100;
        System.out.println(SI);
    }
}