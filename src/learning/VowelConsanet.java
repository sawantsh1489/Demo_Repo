package learning;

import java.util.Scanner;

public class VowelConsanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter name");
		Scanner read=new Scanner(System.in);
		String a=read.nextLine();
		char c=a.charAt(0);
		
		switch(c){
			case 'a':
			case 'e':
			case 'i':	
			case 'o':
			case 'u':
			System.out.println("Char is vowel");
			break;
			default:
				System.out.println("Char is consonet");
		}
		
		
		read.close();

	}

}
