

//Q11.Write a java Program to calculate selling price given cost price and profit.



//cost price+profit

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int costprice=sc.nextInt();
       int profit=sc.nextInt();
        // double =salery*0.08;
       //  double insurence=salery*0.05;
          double sell=costprice+profit;      
        System.out.println(sell);
    }
}