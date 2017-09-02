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
import java.util.Arrays;


class QuestionOne
{
	public static void main(String[] args) {
		System.out.println("Question One");
		ArrayList<String> duplicatesList = new ArrayList<String>(Arrays.asList("good", "better", "best", "best", "first", "last", "last", "last","good"));
		removeDuplicates(duplicatesList);
		// removeDuplicates(null);
	}

	public static void removeDuplicates(ArrayList<String> strings) {
		// null and empty check
		if (strings == null || strings.isEmpty()) {
			System.out.println("The input list is null or has no items!");
			return;
		}

		ArrayList<String> uniqueStrings = new ArrayList<String>();
		for (int i=0; i < strings.size(); i++) {
			String item = strings.get(i);
			if (!isContains(uniqueStrings, item))
			{
				uniqueStrings.add(item);
			}
		}
		
		// Print the result
		for (int i = 0; i < uniqueStrings.size(); i++) {
			System.out.println(uniqueStrings.get(i));
		} 
	} // end removeDupliates

	// Return True if the list already contians the item
	public static boolean isContains(ArrayList<String> strings, String item) {
		for (int i = 0; i < strings.size(); i++) {
			if (item.equals(strings.get(i))) {
					return true;
				}	
		}
		return false;

	}
}