/*
2. [Tests Java language and prob solving] 
Write a Java method testForSum which determines whether a given array of integers 
contains three entries whose sum is equal to a given integer. Assume the following:

a. The method accepts an array intArr of int’s and an int testInt as its two arguments
b. The return type of the method is boolean
c. The method returns true if and only if there are distinct integers i, j, k such that 
    intArr[i] + intArr[j] + intArr[k] equals testInt.

Test your method in a main method, which passes the following input values
{5, 1, 23, 21, 17, 2, 3, 9, 12}, 22 into the method testForSum, 
and which outputs the return value to the console.
*/


class QuestionTwo0
{
	public static void main(String[] args) {
		System.out.println("Question One");
		int[] intArr = new int[] {5, 1, 23, 21, 17, 2, 3, 9, 12};
		boolean ret = testForSum(intArr, 22);
		System.out.println(ret);
	}

	static boolean testForSum(int[] intArr, int testInt) {
		int sum = 0;
		for (int item: intArr) {
			sum += item;
		}
		System.out.println(sum);
		return (sum == testInt);
    }

}