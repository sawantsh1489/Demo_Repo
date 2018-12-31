package learning;

import java.util.Scanner;

public class AsciiChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter name");
		Scanner read=new Scanner(System.in);
		String a=read.nextLine();
		char c=a.charAt(0);
		int b=c;
		System.out.println("ACII value of "+c+" is "+b);
		read.close();

	}

}
