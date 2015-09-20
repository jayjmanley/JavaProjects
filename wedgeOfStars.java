package Package2;

import java.util.*;

public class wedgeOfStars {
	static Scanner stars = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inital number of stars: ");
		int number = stars.nextInt();
		
		for(; number > 0; number--) {
			int i = number;
			while(i > 0) {
				System.out.print("*");
				i--;
			}
			System.out.println();
		}
	}

}
