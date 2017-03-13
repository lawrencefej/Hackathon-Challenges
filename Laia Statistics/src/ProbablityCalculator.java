import java.util.Scanner;
import java.util.Arrays;
//import java.util.HashMap;

// declare the class
public class ProbablityCalculator {
	
	// declare the main method 
	public static void main(String[] args) {
		
		//create new object of the scanner class and save its input into an array
		Scanner sc = new Scanner(System.in);
		
		//Declare an array of size seven
		double [] numbers = new double[7];
		
		//Request 7 numbers from the user
		System.out.println("Enter seven numbers below");
		
		//create for loop to request each number and store it into array
		for(int i=0; i < numbers.length; i++){
	        System.out.println("Enter number " + (i+1) + ": ");
	        numbers[i] = sc.nextDouble();	
		}
		
		//Sort the numbers in the array in ascending order
		Arrays.sort(numbers);
		
		// call the mean method, pass the arrays as the parameter and print the result
		double average = mean(numbers);
		System.out.println("The Mean of the numbers is: " + average);
		
		// call the median method, pass the arrays as the parameter and print the result
		double middle = median(numbers);
		System.out.println("The Median is: " + middle);
		
		// call the mode method, pass the arrays as the parameter and print the result
		double mostFreq = mode(numbers);
		System.out.println("The Mode is: " + mostFreq);
		
		// call the range method, pass the arrays as the parameter and print the result
		double Range = range(numbers);
		System.out.println("The Range is: " + Range);
		
		//print out the sorted array
		System.out.print(Arrays.toString(numbers));
		
		//close the scanner input
		sc.close();
	}
	
	//create a method to calculate the mean
	public static double mean(double [] num) {
		
		double sum = 0;
		//for every number entered in the array add it to the sum
		for (double n: num){
			sum += n;
		}
		//return the sum divided by the length of the array
		return sum/num.length ;
	}
	
	//create a method to calculate the median
	public static double median(double [] num) {
		
		double median;
		//divide the length of the array by 2
		if (num.length % 2 == 0)
		    median = ((double)num[num.length/2] + (double)num[num.length/2 - 1])/2;
		else
		    median = (double) num[num.length/2];
		return median;
	}
	
	//create a method to calculate the mode
	public static double mode(double [] num) {
		
		
			// create an array to hold the frequency
		    int[] freq = new int[130];
		    
		    //loop through the array to find the frequency of each number
		    for (int i = 0; i < num.length; i++)++freq[(int) num[i]];
		    int max = 0;
		    
		    //loop through the count array 
		    for (int j = 0; j < freq.length; j++) {
		    	
		    	//if the number is larger than max, assign that number to max
		        if (freq[j] > max) max = j;
		    }
		    return max;
	}
	
	//create a method to calculate the range
	public static double range(double [] num) {
		
		//subtract the last number from the first number in the array and assign it to r
		double r = num[6] - num[0];
		return r;	
	} 
}
