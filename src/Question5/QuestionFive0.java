/*
5. [Tests knowledge of concept of static] 

Create a Java class that allows at most 5 instances of itself to be created. 
Call your class JustFive. Provide a main method in your class that attempts to create 6 instances of your class.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


class QuestionFive0
{
	public static void main(String[] args) {
		System.out.println("Question Five");
		// JustFive j1 = new JustFive();  // Error: private access
		List<JustFive> instanceArr = new ArrayList<JustFive>();
		for (int i = 1; i <= 6; i++) {
			JustFive temp = JustFive.CreateInstance();
			instanceArr.add(temp);
			System.out.println(String.format("Count of instance: %d", instanceArr.size()));
		}
	}
}

class JustFive
{
	private JustFive() {}
	private static int i = 0;
	
	public static JustFive CreateInstance() {
		if (i < 5) {
			i++;
			return new JustFive();
		} else {
			throw new SecurityException("Can't create more that 5 instance of this class!");
		}
	}

}