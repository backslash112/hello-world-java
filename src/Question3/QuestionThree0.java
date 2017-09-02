/*
3. [Tests knowledge of data structures] 

Create your own linked list (do not use any of the classes provided in the Collections API). 
Implement the following two operations:

If you are using jdk1.4 or before:
     void add(Object ob); 
     boolean find(Object ob);
     String toString();

If you are using j2se5.0 and you know generic programming:
     void add(T ob);
     boolean find(T ob);
     String toString()

The toString method should arrange the elements of the list in a comma-separated sequence, in the following format:
[elem0, elem1, elem2, …, elemN]

Test your linked list in a main method which does the following:

a. Creates an instance of your list and adds the following Strings to it:
   “Straight”, “Bent”, “Equals”, “Well”, “Storm”
b. Uses your find function to search for the keys “Well” and “Strength”
c. Outputs both the input list and the search results to the consoleand output the results to 
   the consoleby repeatedly using your add function to populate a new instance of your linked list with Strings, 
   and then outputting to console the boolean result of searching for some String in this list.
*/


class QuestionThree0
{
	public static void main(String[] args) {
		System.out.println("Question Three");
    CustomLinkedList<String> cll = new CustomLinkedList<String>();
    for (int i = 0; i < 10; i++) {
      cll.add(String.valueOf(i));
      System.out.println(i);
    }
    System.out.println("Result is: ");
    System.out.println(cll.toString());
    System.out.println(cll.find("111"));
    System.out.println(cll.find("11"));
    System.out.println(cll.find("13"));
    System.out.println(cll.find("1"));
    System.out.println(cll.find("3"));
    System.out.println(cll.find("2"));
  }
	


}

class CustomItem<T> {

  public T data;
  public CustomItem<T> nextItem;

  public CustomItem(T d) {
    data = d;
  }
}

class CustomLinkedList<T> {
  private CustomItem<T> first;
  public CustomLinkedList() {
    first = null;
  }
  public void add(T ob) {
    CustomItem<T> newItem = new CustomItem<T>(ob);
    if (first == null) {
      first = newItem;
    } else {
      newItem.nextItem = first;
      first = newItem;  
    }
    
  }

  public boolean find(T ob) {
    System.out.println("Looking for " + ob);
    if (first == null) {
      return false;
    }
    CustomItem<T> item = first;
    while (item != null) {
      if (ob.equals(item.data)) {
        return true;
      }
      item = item.nextItem;
    }
    return false;
  }

  public String toString() {
    if (first == null) {
      return "null";
    }
    String str = "[" + String.valueOf(first.data);
    System.out.println("1");
    CustomItem<T> item = first.nextItem;
    while(item != null) {
      str += ", ";
      str += String.valueOf(item.data);
      item = item.nextItem;
    }
    return str + "]";
  }
}