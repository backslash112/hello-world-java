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


class QuestionOne1
{
	public static void main(String[] args) {
		System.out.println("Question One1");
		List<String> duplicatesList = new ArrayList<String>(Arrays.asList("good", "better", "best", "best", "first", "last", "last", "last","good"));
		removeDuplicates(duplicatesList);
		// removeDuplicates(null);
	}

	public static void removeDuplicates(List<String> strings) {
		// null and empty check
		if (strings == null || strings.isEmpty()) {
			System.out.println("The input list is null or has no items!");
			return;
		}

		List<String> uniqueStrings = new ArrayList<String>();
		for (String item : strings) {
			if (!isContains(uniqueStrings, item))
			{
				uniqueStrings.add(item);
			}
		}
		
		// Print the result
		for (String item : uniqueStrings) {
			System.out.println(item);
		} 
	} // end removeDupliates

	// Return True if the list already contians the item
	public static boolean isContains(List<String> strings, String str) {
		for (String item : strings) {
			if (item.equals(str)) {
					return true;
				}	
		}
		return false;

	}
}