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


// http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
// https://stackoverflow.com/questions/4240080/generating-all-permutations-of-a-given-string


class QuestionFour0
{
	public static void main(String[] args) {
		System.out.println("Question Four");
		permutation("ABCD");
	}

	public static void permutation(String str) { 
    	permutation("", str); 
	}	

	private static void permutation(String prefix, String str) {
		// System.out.println(prefix + " -> " + str);
    	int n = str.length();
    	if (n == 0) System.out.println(prefix);
    	else {
        	for (int i = 0; i < n; i++)
            	permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
    	}
	}
}