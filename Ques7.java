import java.util.Scanner;

public class Ques7 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int num=sc.nextInt();
			
			switch(num) {
			case 0:
				System.out.println("number 0 is pressed");
				break;
				
			case 1:
				System.out.println("number 1 is pressed");
				break;
				
			case 2:
				System.out.println("number 2 is pressed");
				break;
				
			case 3:
				System.out.println("number 3 is pressed");
				break;
				
			case 4:
				System.out.println("number 4 is pressed");
				break;
				
			case 5:
				System.out.println("number 5 is pressed");
				break;
				
			default:
				System.out.println("Not Allowed");
				break;

	}
}}
