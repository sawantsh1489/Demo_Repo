package learning;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st no ");
		Scanner read=new Scanner(System.in);
		float a=read.nextFloat();
		System.out.println("Enter 2nd no");
		float b=read.nextFloat();
		System.out.println("Enter 3rd no");
		float c=read.nextFloat();
		read.close();
		
		if (a>b) {
			if (a>c) {
				System.out.println("large no "+a);
			}
			else
			{System.out.println("large no "+c);}
				}
		else if(b>c) {System.out.println("large no "+b);}
		else {System.out.println("large No "+c);}
	
	}

}
