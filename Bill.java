package lab8;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the units");
		Scanner obj=new Scanner(System.in);
		double u=obj.nextDouble();
       int  c;
		if(u<=100)
		{
			c= (int) (u*1.20);
			System.out.println("Charges is for per unit:"+c);
		}
		else if(u>100 && u>300)
		{
			c=(int) (u*2);
			System.out.println("Charges is for per unit:"+c);
			
		}
		else 
		{
			c=(int)(u*3);
			System.out.println("Charges is for per unit:"+c);
		}
		
		
	
		

	}

}




