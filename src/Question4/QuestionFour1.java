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


class QuestionFour1
{
	public static void main(String[] args) {
		System.out.println("Question Four");
		StringBuilder str = new StringBuilder("ABCD");
		permutation(str);
	}

	static void permutation(StringBuilder str) {
		permutation(str, 0);
	}

	static void permutation(StringBuilder str, int position) {
		System.out.println();
		System.out.println(String.format("permutation:(%s %d)", str, position));
		int n = str.length();
		if (position == n - 1) {
			System.out.println(String.format("---------- position is %d, ----> %s", position, str));
		} else {
			System.out.println("go:");
			for (int i = position; i < 3; i++) {
				
				swap(str, position, i, true);
				System.out.println(String.format("position=%d, position+1=%d, i=%d", position, 1+position, i));
				permutation(str, position+1);
				swap(str, position, i, false);  // swap back!!!
			}
		}
	}

	static void swap(StringBuilder str, int position1, int position2, boolean is_log) {

		if (position1 == position2) {
			return;
		}
		if (is_log) {
			System.out.print(String.format("swap:(%s %d %d) => ", str, position1, position2));
		}
		String origin_str = str.toString();
		char temp = str.charAt(position1);
		str.setCharAt(position1, str.charAt(position2));
		str.setCharAt(position2, temp);
		if (is_log) {
			// System.out.println(String.format("%s: position(%d)<->%d ==> %s", origin_str, position1, position2, str));	
			System.out.println(str);
			System.out.println();
		}
		
	}
}