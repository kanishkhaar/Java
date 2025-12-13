//	Q1.Write a java Program to print Price After Discount






import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       double price=sc.nextDouble();
   double discount=sc.nextDouble();
        
        double cost=price-(price*discount/100);      
        
        
        System.out.println(cost);
    }
}