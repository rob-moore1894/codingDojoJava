package lecture_arrays_loops;
import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
    // To use an array, we first need to declare it, initialize and add elements or values to it. We can either do these separately or all at once.

    // Separate steps:
    int[] myArray;
    myArray = new int[5]; 
    myArray[0] = 4;
    myArray[1] = 8;
    myArray[2] = 8;
    myArray[3] = 5;
    myArray[4] = 9;

    // All at once:
    int[] newArray = {4, 8, 8, 5, 9};

    // In Java an array has a fixed size (after initialization), meaning that you cannot add or remove items from an array.

    // Everything in a Java program not explicitly set to something by the programmer, is initialized to a zero value.

    //ArrayList - Found in the util module. Is still a sequential zero-based index collection of elements but is not fixed in size.  We can add as many items as we need to.
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    
    // Inside the <> is what are called generics.  It tells the ArrayList of the acceptable types it can hold. If it is not included, you could add anything into the ArrayList (not recommended). Generics helps to keep the compiler and us from making runtime errors. 

    // Add elements
    arr.add(10);

    // Get elements
    int num = arr.get(0);

    System.out.println(arr); // [10]
    System.out.println(num); // 10

    // Add elements of different types. All objects are inherited from the Object class; therefore, you can use your generic as an object and add different types of objects:

    ArrayList<Object> list = new ArrayList<Object>();
    list.add(10);
    list.add("Hello");
    list.add(new ArrayList<Integer>());
    list.add(Double.valueOf(12.0));
    
    System.out.println(list); // [10, "Hello", [], 12.0]
    }

    // The most used methods are: add, clear, clone, contains, get, indexOf, isEmpty, remove, size
}
