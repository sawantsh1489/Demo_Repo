package learning;

import java.util.Scanner;

public class DivNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 1st no ");
		Scanner read=new Scanner(System.in);
		float a=read.nextFloat();
		System.out.println("Enter 2nd no");
		float b=read.nextFloat();
		float quotient=a/b;
		float reminder=a%b;
		read.close();
		System.out.println("your ans: "+quotient+ " Your reminder is "+reminder);

	}

}
