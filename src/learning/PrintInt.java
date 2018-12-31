package learning;

import java.util.Scanner;

public class PrintInt {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please Enter No to Print");
		Scanner reader= new Scanner(System.in);
		int no =reader.nextInt();
		reader.close();
		System.out.println("your no is : "+no);
		
	}

}
