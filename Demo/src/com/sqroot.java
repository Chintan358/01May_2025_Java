package com;
import java.util.Scanner;
public class sqroot {
	
	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int sqrt = findSquareRoot(num);

	        if (sqrt == -1)
	            System.out.println("Square root of " + num + " is not a perfect square.");
	        else
	            System.out.println("Square root of " + num + " is: " + sqrt);

	        sc.close();
	    }

	    public static int findSquareRoot(int num) {
	        if (num < 0) {
	            System.out.println("Cannot find square root of a negative number!");
	            return -1;
	        }

	        int result = 1;
	        int n = num;
	        for (int i = 2; i * i <= n; i++) {
	            int count = 0;

	            // Count how many times i divides n
	            while (n % i == 0) {
	                count++;
	                n /= i;
	            }

	            // For every pair of factors, include one i in the result
	            if (count % 2 != 0) {
	                // if there's an unpaired factor, it's not a perfect square
	                return -1;
	            }

	            // multiply half the count of factors
	            for (int j = 0; j < count / 2; j++) {
	                result *= i;
	            }
	        }

	        // If remaining n > 1, it's also a prime factor
	        if (n > 1)
	            return -1; // not a perfect square

	        return result;
	    }
	


}
