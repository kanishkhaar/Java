
//Write a Java Program to print the absolute value of a number.



import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            if(a<0){
            System.out.println(-a);
            }
            else{
                 System.out.println(a);
            }
        
    }
    
}