package lecture_typecasting;

public class TestSum {
    // Primitive vs Object types - 
    // Object types are an instance of a class. They usually hold data and methods. Therefore, their memory capacity is much bigger than their primitive counterpart

    public static void main(String[] args) {
        // long start = System.currentTimeMillis();
        // Integer sum = 0;
        // for(int i = 0; i < Integer.MAX_VALUE; i++){
        //     sum += i; 
        // }
        // System.out.println("Sum: " + sum); // 1073741825
        // long end = System.currentTimeMillis();
        // double total = (double) (end - start) / 1000;
        // System.out.println("Time of execution: " + total + " seconds"); // 6.289 seconds

        // By setting the sum variable to Integer in our for-loop, each time we add i to sum, we are creating an instance of Integer with the value i.  Which results in completing the sum in over 6 seconds. Instead, declare sum as an int from the start.

        // long start = System.currentTimeMillis();
        // int sum = 0;
        // for (int i = 0; i < Integer.MAX_VALUE; i++) {
        //     sum += i;
        // }
        // System.out.println("Sum: " + sum); // 1073741825
        // long end = System.currentTimeMillis();
        // double total = (double) (end - start) / 1000; // 0.786
        // System.out.println("Time of execution: " + total + " seconds");

        // Primitive data types can only hold data. Object types are pointers to where the data is stored. This means that this pointer can point to nothing (null), while primitive types cannot.

        // Integer a = 10;
        // int b = 10;
        // a = null;
        // b = null; 

        // Running the code above will result in a compiling error - Unresolved compilation problem: Type mismatch: cannot convert from null to int
    }
}
