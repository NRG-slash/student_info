import java.util.Scanner;

/**
 *
 * Name: Laturski, Garrett William
 * Teacher: Mr.Hardman
 * Assignment #3
 * Date Last Modified: 
 *
 */

public class StudentInfo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("What's your fist name? ");
		String firstName = userInput.nextLine();
		
		System.out.println("What's your last name? ");
		String lastName = userInput.nextLine();
		
		System.out.println("What grade are you in? ");
		int grade = userInput.nextInt();
		
		System.out.println("What's your student ID? ");
		String id = userInput.next();
		
		System.out.println("What's your login? ");
		String login = userInput.next();
		
		System.out.println("What's your school average? ");
		double average = userInput.nextDouble();
		
		System.out.println( String.format("%-15s" + login, "Login: "));
		System.out.println( String.format("%-15s" + firstName + " " + lastName, "Name: "));
		System.out.println( String.format("%-15s" + grade, "Grade: "));
		System.out.println( String.format("%-15s" + average, "Average: "));
		System.out.println( String.format("%-15s" + id, "ID: "));
		
		userInput.close();
	}
	

}
