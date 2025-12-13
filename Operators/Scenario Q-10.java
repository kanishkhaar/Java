

//Q10.Write a java Program to calculate Salary of Employee




import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        double salery=sc.nextInt();
         double pf=salery*0.08;
         double insurence=salery*0.05;
          double em=(salery-(pf+insurence));       //100000 //87000
        System.out.println(em);
    }
}