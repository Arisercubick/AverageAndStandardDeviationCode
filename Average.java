import java.util.Scanner;
public class Average {
	private static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter a number you want to input: ");
		int inputNum = reader.nextInt();
		int[] num = new int[inputNum];
		
		double sum = 0;
		for (int i = 0; i != num.length; i++) {
			System.out.print("\nEnter an interger #" + (i+1) + ": ");
			num[i] = reader.nextInt();
			sum += num[i];
		}
		double avg = sum/inputNum;
		System.out.println("Average is: " + avg);
		
		double sigma = 0;
		for (int i = 0; i != num.length; i++) {
			sigma += Math.pow((num[i] - avg), 2.0);
		}
		
		double deviation = Math.sqrt(sigma/(inputNum - 1));
		
		System.out.println("Standard deviation is: " + deviation);
	}
}