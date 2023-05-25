package winsem;

public class chatgptperfectnum 
{
	    public static boolean isPerfectNumber(int number)
	    {
	        int sum = 0;
	        for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == number;
	    }
	    
	    public static void main(String[] args) {
	        int number = 6;
	        if (isPerfectNumber(number)) {
	            System.out.println(number + " is a perfect number.");
	        } else {
	            System.out.println(number + " is not a perfect number.");
	        }
	    }
	}

