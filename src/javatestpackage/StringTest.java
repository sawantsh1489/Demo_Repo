package javatestpackage;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		caseTest();
		trimTest();
		startsTest();
		charAtTest();
		lengthTest();
		replaceTest();
	}
	
	public static void caseTest(){
		System.out.println("Case change Test");
		System.out.println("**********************************");
		 String s="Sachin";
		 char[] a=s.toCharArray();
		 for (int i=0; i<s.length();i++)
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println(s.toUpperCase());//SACHIN  
		 System.out.println(s.toLowerCase());//sachin  
		 System.out.println(s);//Sachin(no change in original) 
		 System.out.println("**********************************");
	}
	
	public static void trimTest(){
		System.out.println("Trim Test");
		System.out.println("**********************************");
		String a="  Mumbai  ";  
	    System.out.println(a);//  Mumbai  
	    System.out.println(a.trim());//Mumbai  
	    System.out.println("**********************************");
	}
	
	public static void startsTest(){
		System.out.println("starts Test");
		System.out.println("**********************************");
	    String s="Sachin";  
	     System.out.println(s.startsWith("Sa"));//true  
	     System.out.println(s.endsWith("n"));//true 
	     System.out.println("**********************************");
	}
	
	public static void charAtTest(){
		System.out.println("Char at Test");
		System.out.println("**********************************");
		String s="Sachin";  
		System.out.println(s.charAt(0));//S  
		System.out.println(s.charAt(3));//h   
		System.out.println("**********************************");
	}
	
	public static void lengthTest(){
		System.out.println("length Test");
		System.out.println("**********************************");
	    String s="Sachin";  
	    System.out.println(s.length());//6  
	    System.out.println("**********************************");
	}
	
	public static void replaceTest(){
		System.out.println("replace  Test");
		System.out.println("**********************************");
	    String s1="Java is a programming language. Java is a platform. Java is an Island.";    
	    String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"    
	    System.out.println(replaceString); 
	    System.out.println("**********************************");
	}


}
