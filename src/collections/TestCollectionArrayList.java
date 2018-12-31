package collections;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator.*;

import javax.swing.text.html.HTMLDocument.Iterator;

public class TestCollectionArrayList {
	/*Java ArrayList class uses a dynamic array for storing the elements.It extends AbstractList class and implements List interface.
Java ArrayList class can contain duplicate elements.
Java ArrayList class maintains insertion order.*/
	
	public static void main(String args[]){  
		   
		  ArrayList<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Ravi");//adding object in arraylist  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  
		  for(String obj:al)  
			    System.out.println(obj);  
		  }  
		 }  


