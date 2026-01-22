//Q3.Write a java Program to Split the Bill Among 3 Friends








import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
       int bill=sc.nextInt();
        
        int share=bill/3;      
        
        
        System.out.println(share);
    }
}