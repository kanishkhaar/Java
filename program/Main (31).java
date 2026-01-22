//Convert Minutes to Seconds
//Q2.Write a java Program to Convert Minutes to Seconds







import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       int minutes=sc.nextInt();
        
        int seconds=minutes*60;      
        
        
        System.out.println(seconds);
    }
}