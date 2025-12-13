

//Q12.Write a java Program to calculate cost price given selling price and loss.




//Cost Price = Selling Price + Loss

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        int sellingprice=sc.nextInt();
       int lose=sc.nextInt();
          int CostPrice=sellingprice+lose;     // 1000+500//1500
        System.out.println(CostPrice);
    }
}