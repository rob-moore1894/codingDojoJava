package assignment_basics;
import java.util.ArrayList;
import java.util.Arrays;

public class PuzzleJava {
    // Create an array with the following values: 3,5,1,2,7,9,8,13,25,32. Print the sum of all numbers in the array. Also have the function return an array that only includes numbers that are greater than 10 (e.g. when you pass the array above, it should return an array with the values of 13,25,32)

    public static ArrayList<Integer> sumAndAboveThirteen(int[] arr){
        int sum = 0;
        // Convert from int[] to ArrayList<Integer>
        ArrayList<Integer> arrLi = new ArrayList<>(arr.length);
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(arr[i] >= 13){
                arrLi.add(arr[i]); 
            }; 
        };
        System.out.println("Sum of Array: " + sum);
        return arrLi; 
    }

    // Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Shuffle the array and print the name of each person. Have the method also return an array with names that are longer than 5 characters.

    ArrayList<String> shuffleNames(String[] strArr){
        // Convert from String[] to ArrayList<String>
        ArrayList<String> names = new ArrayList<>(strArr.length); 
        return names; 
    }

    public static void main(String[] args) {
        int[] sampleArr = {3,5,1,2,7,9,8,13,25,32};
        int[] array = {-1, 5, 14, 700, 45, 8, 6, 7, 100};
        String[] 

        System.out.println(sumAndAboveThirteen(sampleArr));
        System.out.println(shuffleNames(sampleArr));
        
    }
}
