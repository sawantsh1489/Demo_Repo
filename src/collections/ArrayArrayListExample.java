package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayArrayListExample {

	public static void main(String[] args) {

		// ArrayList Example

		ArrayList<String> arrlistobj = new ArrayList<String>();
		arrlistobj.add("Alive is awesome");
		arrlistobj.add("Love yourself");
		Iterator it = arrlistobj.iterator();
		System.out.print("ArrayList object output :\n");
		while (it.hasNext())
			System.out.print(it.next() + "\n");

		// Array Example

		String[] arrayobj = new String[3];
		arrayobj[0] = "Love yourself";
		arrayobj[1] = "Alive is awesome";
		arrayobj[2] = "Be in Present";
		System.out.print("\nArray object output :\n");
		for (int i = 0; i < arrayobj.length; i++)
			System.out.print(arrayobj[i] + "\n");

	}
}
