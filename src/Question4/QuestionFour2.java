/*
4. [Tests basic knowledge of recursion] 

Write a recursive static Java method that accepts an array arr of integers argument 
returns a list of all permutations of these integers.

(A permutation of a sequence of integers is a re-arrangement of the integers. 
For example, one permutation of  1, 3, 4, 8, 2 is 3, 1, 2, 8, 4.) 
For this problem, you may assume that the input array contains no duplicate entries. 
Your method should return an ArrayList of int arrays.

Next, test your method using a main method; 
the main method should pass in the following array: [1, 5, 4, 2]; 
then, it should print to the console the resulting list of permutations.
*/


// Sunday, 3 September 2017:
// http://blog.csdn.net/wuzhekai1985/article/details/6643127

import java.util.ArrayList;
import java.util.List;


class QuestionFour2
{
	static List<StringBuilder> newStringArr = new ArrayList<StringBuilder>(6);

	public static void main(String[] args) {
		System.out.println("Question Four");
		StringBuilder str = new StringBuilder("ABC");
		permutation(str);
	}

	static void permutation(StringBuilder str) {
		// StringBuilder new_str = new StringBuilder("");
		// permutation(str, new_str, 3);
		// for (int i = 0; i < newStringArr.size(); i++) {
		for (int i = 0; i < 2; i++) {
			StringBuilder temp = new StringBuilder();
			temp.append(str.charAt(i));
			// System.out.println(str.charAt(i));
			// System.out.println(temp);
			permutation(str, temp, 2);
		}
	}

	// static void permutation(StringBuilder str, StringBuilder new_str, int position) {

	// 	if (new_str.length() == str.length()) {
	// 		System.out.println(new_str);
	// 		new_str = new StringBuilder("");
	// 		return;
	// 	}
	// 	for (int i = 0; i < position; i++) {
	// 		if (new_str.indexOf(String.valueOf(str.charAt(i))) == -1) {
	// 			new_str.append(str.charAt(i));
	// 			try	{
	// 				Thread.sleep(1000);
	// 			} catch(InterruptedException ex) {

	// 			}
				
	// 			System.out.println(new_str);
	// 			permutation(str, position);
	// 		}
			
	// 	}
	// }

	static void permutation(StringBuilder str, StringBuilder new_str, int flag) {
		try	{
				Thread.sleep(1000);
			} catch(InterruptedException ex) {

			}

		// if (new_str.length() == 3) {
		// 	System.out.println(new_str);
		// 	return;
		// }
		System.out.println(flag);
		if (flag <= 0) {
			return;
		}
		int n = str.length();
		for (int i = 0; i < n; i++) {
			System.out.println(String.format("permutation: new_str=%s, char=%s", new_str, str.charAt(i)));

			// String temp = String.format("%s%s",new_str, str.charAt(i));

			// System.out.println(String.format("%s + %s", new_str, str.charAt(i)));
			if (new_str.indexOf(String.valueOf(str.charAt(i))) == -1) {

				// new_str.append(str.charAt(i));

			// 	if (!newStringArr.contains(new_str)) {
			// 		newStringArr.add(new_str);
			// 	}
				permutation(str, new_str, --flag);
			}
			
			
		// 	// System.out.println(i);
		// 	// System.out.println(t);

		// 	// t--;
		}
	}
}