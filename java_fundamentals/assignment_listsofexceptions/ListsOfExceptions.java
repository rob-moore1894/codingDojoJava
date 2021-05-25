import java.util.ArrayList;

public class ListsOfExceptions {
    // Familiarize yourself with generics and exceptions and figure out exactly how they work. 
    // First, make an ArrayList with both numbers and strings
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Loop through the list and try assigning each item to an int variable. To do this, you will also need to cast your list item as an Integer

        for (int i = 0; i < myList.size(); i++){
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("Success at index: " + i + "\nAt the value: " + castedValue);
                System.out.println("\n==========================================\n");
            }
            catch (Exception e) {
                System.out.println("Error occurred at index: " + i + "\nAt the value: " + myList.get(i) + "\nException: " + e);
                System.out.println("\n==========================================\n");
            }
        }
    }
    
}
