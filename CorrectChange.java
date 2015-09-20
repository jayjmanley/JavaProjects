import java.util.*;

public class CorrectChange {
	
	static Scanner money = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your money in cents.");
		int cents = money.nextInt();
		int dollars = (cents / 100);
		int remainder = (cents % 100);
		int quarters = (remainder / 25);
		int remainder2 = (remainder - (quarters * 25));
		int dimes = (remainder2 / 10);
		int remainder3 = (remainder2 - (dimes * 10));
		int nickels = (remainder3 / 5);
		int lastly = (remainder3 - (nickels * 5));
		
		if (dollars != 0) {
			check(dollars);
		}
		if (quarters != 0) {
			check2(quarters);
		}
		if (dimes != 0) {
			check3(dimes);
		}
		if (nickels != 0){
			check4(nickels);
		}
		if (lastly != 0){
			check5(lastly);}
		}

	private static void check5(int lastly) {
		// TODO Auto-generated method stub
		if (lastly != 1) {
			System.out.print( "and "  + lastly + " pennies. ");
		}
		else {
			System.out.print( "and " + lastly + " penny. ");
		}
	}

	private static void check4(int nickels) {
		// TODO Auto-generated method stub
		if (nickels != 1) {
			System.out.print(nickels + " nickels, ");
		}
		else {
			System.out.print(nickels + " nickel, ");
		}
	}

	private static void check3(int dimes) {
		// TODO Auto-generated method stub
		if (dimes != 1) {
			System.out.print(dimes + " dimes, ");
		}
		else {
			System.out.print(dimes + " dime, ");
			}
	}

	private static void check(int dollars) {
		// TODO Auto-generated method stub
		if (dollars != 1) {
			System.out.print("Your change is: " + dollars + " dollars, ");
		}
		else {
			System.out.print("Your change is: " + dollars + " dollar, ");
		}
	}
	
	private static void check2(int quarters) {
		// TODO Auto-generated method stub
		if (quarters != 1) {
			System.out.print(quarters + " quarters, ");
		}
		else {
			System.out.print(quarters + " quarter, ");
			}
	}

		
	}


