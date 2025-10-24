import java.util.Scanner;
public class Greeter {
	private static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		String name = reader.nextLine();
		
		String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Staurday", "Sunday"};
		
		for(int i = 0; i != week.length; i++) {
			System.out.println("Have a nice " + week[i] + ", " + name);
		}
	}
}