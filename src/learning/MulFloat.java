package learning;

import java.util.Scanner;

public class MulFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st no to add");
		Scanner read=new Scanner(System.in);
		float a=read.nextFloat();
		System.out.println("Enter 2nd no to add");
		float b=read.nextFloat();
		float mul=a*b;
		read.close();
		System.out.println("your multiplication: "+mul);

	}

}

