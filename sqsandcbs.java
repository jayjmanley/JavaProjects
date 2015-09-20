package Package2;

import java.util.*;

public class sqsandcbs {
	static Scanner highestvalue = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Upper Limit: ");
		int limit = highestvalue.nextInt();
		int j = 0; 
		int k = 0;
		
		for (int i = 1; i <= limit; i++) {
			j = (i * i) + j;
			k = (i * i * i) + k;
		}
		
		System.out.println("The sum of the Squares is " + j + ".");
		System.out.println("The sum of the Cubes is " + k + ".");
	}

}
