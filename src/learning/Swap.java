package learning;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st no ");
		Scanner read=new Scanner(System.in);
		float a=read.nextFloat();
		System.out.println("Enter 2nd no");
		float b=read.nextFloat();
		read.close();
		a=a-b; // -1
		b=a+b; // 2
		a=b-a; // 3
		System.out.println("Swap no " +a+ " and "+b);

	}

}
