import java.util.ArrayList;

public class MinMaxCalculation {
        
        public static double getMin(ArrayList<Double> numbers) {
            double min = numbers.get(0);
            
            for (double num: numbers) {
                if (num < min) {
                    min = num;
                }
            }
            
            return min;
        }
        
        public static double getMax(ArrayList<Double> numbers) {
            double max = numbers.get(0);
            
            for (double num: numbers) {
                if (num > max) {
                    max = num;
                }
            }
            
            return max;
        }
}
