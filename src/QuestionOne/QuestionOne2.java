/*
1. [Tests problem solving and a little bit of Java language] 
Write a Java method removeDuplicates that removes all duplicates in a given list. Assume the following:

a. The method accepts an object of type List
b. The return type of the method is void
c. Duplicates are determined using the equals() method (rather than by the == operator)

Your implementation of removeDuplicates should handle, in an appropriate way, 
the case in which a null List is passed in to the method.
Test your method by writing code in a main method, which does the following:

a. It creates an instance of List and loads it with the following String values:
   {"good", "better", "best", "best", "first", "last", "last", "last","good"}
b. It invokes the removeDuplicatesMethod, passing in this instance of List
c. It outputs the modified list to the console
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


class QuestionOne2
{
	public static void main(String[] args) {
		System.out.println("Question One2");
		List<String> duplicatesList = new ArrayList<String>(Arrays.asList("good", "better", "best", "best", "first", "last", "last", "last","good"));
		removeDuplicates(null);
		// removeDuplicates(duplicatesList);
	}

	static void removeDuplicates(List<String> strings) {
		// null check
		if (strings == null) {
			System.out.println("Got null!");
			return;
		}
		for (int i = 0; i < strings.size(); i++) {
			String next = strings.get(i);
			for (int j = 0; j < i; j++) {
				if (next.equals(strings.get(j))) {
					strings.remove(next);
					i--;
					// break;
				}
			}
		}  // for

		// print the result
		for (String item : strings) {
			System.out.println(item);
		}
	}
}