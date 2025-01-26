import java.util.Arrays;

public class Assignment_3 {
    public static void main(String[] args) {
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        
        int sumCalc = 0;
        for (int num : data) sumCalc += num;
        double meanCalc = (double) sumCalc / data.length;
        

        double varCalc = 0;
        for (int num : data) {
            varCalc += Math.pow(num - meanCalc, 2);
        }
        double stdDevCalc = Math.sqrt(varCalc / data.length);
        

        Arrays.sort(data);
        int mid = data.length / 2;
        double medianCalc = data.length % 2 != 0 ? data[mid] : (data[mid-1] + data[mid]) / 2.0;
        
        System.out.println("Mean: " + meanCalc);
        System.out.println("Median: " + medianCalc);
        System.out.println("Standard Deviation: " + stdDevCalc);
    }
}