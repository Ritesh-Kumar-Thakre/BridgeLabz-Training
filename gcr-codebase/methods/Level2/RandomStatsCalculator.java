import java.util.*;
public class RandomStatsCalculator {
    public static void main(String[] args) {
        RandomStatsCalculator obj =new RandomStatsCalculator();
        int[] numbers =obj.generate4DigitRandomArray(5);

        // Applying the required logic Printing results
        System.out.println("Generated 4-digit random numbers:");
        for (int num : numbers){
            System.out.print(num +" ");
        }
        System.out.println();
        double[] result =obj.findAverageMinMax(numbers);
        System.out.println("Average value = " +result[0]);
        System.out.println("Minimum value = " +result[1]);
        System.out.println("Maximum value = " +result[2]);
    }

    // Method to generate array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size){
        int[] arr=new int[size];
        for (int i=0; i<size;i++) {
            arr[i]=(int)(Math.random()*9000) +1000;
        }
        return arr;
    }

    // Method to find average, minimum and maximum
    public double[] findAverageMinMax(int[] numbers) {
        double sum =0;
        int min =numbers[0];
        int max =numbers[0];
        for (int num : numbers) {
            sum +=num;
            min=Math.min(min,num);
            max=Math.max(max,num);
        }
        double average =sum/numbers.length;
        return new double[]{average,min,max};
    }
}
