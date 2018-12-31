package learning;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st no ");
		Scanner read=new Scanner(System.in);
		float a=read.nextFloat();
		float ans=a%2;
		read.close();
		
		if (ans==0)
		{
			System.out.println("No is Even "+a);
		}
		
		else
		{
			System.out.println("No is odd");
		}

	}

}
