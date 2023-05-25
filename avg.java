package winsem;

public class avg
{
	    public static double average(int[] arr) {
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return (double) sum / arr.length;
	    }

	    public static double average(double[] arr) {
	        double sum = 0.0;
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }
	        return sum / arr.length;
	    }
	}
