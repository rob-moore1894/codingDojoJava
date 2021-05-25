package lecture_arrays_loops;
import java.util.ArrayList;

public class Loops {
    public static void main(String[] args) {
        // While loops 
        int i = 0; 
        while (i < 7)
        {
            System.out.println("foo");
            i++;
        }

        // For loops
        // for (initialization; termination; increment){
            // body statements
        // }

        for (int j = 0; j < 7; j++){
            System.out.println("bar");
        }

        // Iterate over an array
        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");

        for (int k = 0; k < dynamicArray.size(); k++){
            System.out.println(dynamicArray.get(k));
        }

        // Enhanced For Loop - many times where you will find you need to assign the array element to a variable and manipulate it but not worry about the current index at all

        // Take this for loop: 
        // for(int l = 0; l < dynamicArray.size(); l++){
        //     String name = dynamicArray.get(l); 
        //     System.out.println("hello "+ name);
        // }

        // Rather than forcing an awkward declaration, the enhanced for-loop translates the above code to: 
        for(String name : dynamicArray){
            System.out.println("hello " + name); 
        }

        // for(element container : collection){
            // body statements
        // }
    }
}
