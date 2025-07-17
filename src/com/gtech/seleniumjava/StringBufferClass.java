package com.gtech.seleniumjava;

public class StringBufferClass {
	//String Buffer is mutable

	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("automation    ");
		System.out.println(s1.delete(0, 4));

		/*
		 * What kind of method invoke in above line >> Constructor. Constrcuctor is
		 * parameterized which is going to accept string
		 */

		// System.out.println(s1.reverse());
		// Reverse is not available in the concept of string but available in
		// StringBuffer & StringBuilder
		/*
		 * s1.insert(4, "testing"); System.out.println(s1);
		 */
		//s1.append("testing");
		System.out.println(s1);
		// append method in stringbuffer & concatination in string

		/*
		 * StringBuffer s2 = new StringBuffer("api testing"); s2.replace(0, 3,
		 * "Manual"); System.out.println(s2);
		 */
		//System.out.println(s1.substring(3));
		System.out.println(s1.substring(1,4));

	}

}
