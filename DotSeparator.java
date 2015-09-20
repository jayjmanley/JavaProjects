import java.util.*;

public class DotSeparator {
	static Scanner words = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your first word.");
		String first = words.next();
		
		System.out.println("Please enter your second word.");
		String second = words.next();
		
		int number = (30 - ((first.length()) + (second.length())));
		System.out.print(first);
		
		while(number > 0) {
			System.out.print(".");
			number--;
		}
		
		System.out.print(second);
	}

}
