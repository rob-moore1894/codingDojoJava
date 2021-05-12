package assignment_basics;
import java.util.ArrayList;
import java.util.Arrays;

public class BasicJava {
    public static ArrayList<Integer> printTo255(){
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        for(int i = 1; i <= 255; i++){
            result.add(i); 
        }
        return result; 
    }

    public static ArrayList<Integer> printOdd(){
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for(int i = 1; i <= 255; i+=2){
            odds.add(i);
        }
        return odds;
    }

    public static void printSum(){
        int sum = 0;
        int i; 
        for(i = 0; i <= 255; i++){
            sum += i; 
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public static void iterate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max; 
    }

    public static double getAverage(double[] arr){
        double ave = 0;
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; 
        }
        ave = sum/arr.length;
        return ave; 
    }

    public static int greaterThanY(int[] arr, int y){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > y){
                count++;
            }
        }
        return count;
    }

    public static int[] squareValues(int[] arr){
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        System.out.println(Arrays.toString(arr)); 
        return arr; 
    }

    public static double[] eliminateNegatives(double[] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] minMaxAve(int[] arr){
        int[] newArray; 
        newArray = new int[3]; 
        int sum = 0;
        int ave = 0;
        int min = arr[0];
        int max = arr[0]; 

        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i]; 
            if(arr[i] > max){
                max = arr[i]; 
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        ave = sum/arr.length;

        newArray[0] = max;
        newArray[1] = min;
        newArray[2] = ave; 

        System.out.println(Arrays.toString(newArray));
        return newArray; 
    }

    public static int[] shiftValues(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length - 1] = 0;
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static void main(String[] args) {
        int[] sampleArr = {1,3,5,7,9,13};
        double[] sampleArr2 = {-1, 5, 18, 200, -200};

        System.out.println(printTo255()); 

        System.out.println(printOdd()); 

        printSum(); 

        iterate(sampleArr);

        System.out.println(findMax(sampleArr));

        System.out.println(getAverage(sampleArr2));

        System.out.println(greaterThanY(sampleArr, 4));

        squareValues(sampleArr);

        eliminateNegatives(sampleArr2);

        minMaxAve(sampleArr); 
        
        shiftValues(sampleArr);
    }
}
