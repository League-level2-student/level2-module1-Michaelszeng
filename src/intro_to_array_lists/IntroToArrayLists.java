package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings = new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("hi");
		strings.add("noe");
		strings.add("no u");
		strings.add("out of ideas already");
		strings.add("");
		//3. Print all the Strings using a standard for-loop
		for (int i=0; i<5; i++) {
			System.out.println(strings.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String s : strings) {
			System.out.println(s);
		}
		//5. Print only the even numbered elements in the list.
		for (int j=0; j<5; j++) {
			if (j%2==0) {
				System.out.println(strings.get(j));
			}
		}
		//6. Print all the Strings in reverse order.
		for (int k=(strings.size()-1); k>=0; k--) {
			System.out.println(strings.get(k));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int l=0; l<5; l++) {
			if (strings.get(l).contains("e") == true) {
				System.out.println(strings.get(l));
			}
		}
	}
}
