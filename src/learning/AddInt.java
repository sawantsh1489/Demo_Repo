package learning;

import java.util.Scanner;

public class AddInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1st no to add");
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
		System.out.println("Enter 2nd no to add");
		int b=read.nextInt();
		int sum=a+b;
		read.close();
		System.out.println("your sum: "+sum);
		
		
	}

}
