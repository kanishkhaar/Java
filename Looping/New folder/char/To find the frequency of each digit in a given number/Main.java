import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    long a = sc.nextLong();
	    long a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a0=0;
	    do{
	        long last = a%10;
	        a/=10;
	        if(last==0)a0++;
	        if(last==1)a1++;
	        if(last==2)a2++;
	        if(last==3)a3++;
	        if(last==4)a4++;
	        if(last==5)a5++;
	        if(last==6)a6++;
	        if(last==7)a7++;
	        if(last==8)a8++;
	        if(last==9)a9++;
	    }while(a!=0);
	    if(a0!=0)System.out.println("Count '0' : "+a0);
	    if(a1!=0)System.out.println("Count '1' : "+a1);
	    if(a2!=0)System.out.println("Count '2' : "+a2);
	    if(a3!=0)System.out.println("Count '3' : "+a3);
	    if(a4!=0)System.out.println("Count '4' : "+a4);
	    if(a5!=0)System.out.println("Count '5' : "+a5);
	    if(a6!=0)System.out.println("Count '6' : "+a6);
	    if(a7!=0)System.out.println("Count '7' : "+a7);
	    if(a8!=0)System.out.println("Count '8' : "+a8);
	    if(a9!=0)System.out.println("Count '9' : "+a9);
	    
	}
}
