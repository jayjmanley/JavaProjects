
import java.util.*;

public class AgeinSeconds {
	
	static Scanner age = new Scanner(System.in); 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years = 1;
		int months = 1;
		int days = 1;
		while (true){
			System.out.println("What is your age in years? ");
			years = age.nextInt();
			if (years > 110){
				System.out.println("Please enter a valid number.");
			}
			else{
				years = ((((years*365)* 24)* 60)* 60);
				break;
			}
		}
		
		while(true){
			System.out.println("How many months since your birthday? If your birthday was "
					+ "this month, please input 0.");
			months = age.nextInt();
			if (months>12) {
				System.out.println("Please enter a valid number.");
			}
			else {
				months = (((getdays(months) * 24)* 60)* 60);
				break;
			}
		}
		
		while(true){
			System.out.println("What is the day today?");
			days = age.nextInt();
			if (days>31){
				System.out.println("Please enter a valid number.");
			}
			else {
				days = (days * 60)* 60;
				break;
			}
		}
		int last = years + months + days;
		System.out.println("Your age in seconds is roughly " + last);
	}

	private static int getdays(int months) {
		// TODO Auto-generated method stub
		switch(months){
			case 0:
				return 0;
			case 1:
				return 31;
			case 2:
				return 59;
			case 3:
				return 90;
			case 4:
				return 120;
			case 5: 
				return 151;
			case 6:
				return 181;
			case 7: 
				return 212;
			case 8:
				return 243;
			case 9:
				return 273;
			case 10:
				return 304;
			case 11:
				return 334;
			case 12: 
				return 365;
		} 
		return months;
	}

}
