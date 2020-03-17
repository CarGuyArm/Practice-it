import java.util.*;

public class oddsandevens {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Let’s play a game called 'Odds and Evens' ");
		System.out.print("What is your name? ");
		String name = input.nextLine();
		//odd or even input
		System.out.print("Hi "+name+", which do you choose? (O)dds or (E)vens?");
		String user = input.nextLine();
		String computer = "";
		if(user.equalsIgnoreCase("O")) { 
			computer = "even";
		}
		else if(user.equalsIgnoreCase("E")) {
			computer = "odd";
		}
		else {
			System.out.println("Input Again!");
		}
		
		System.out.println(name+" has picked "+user+"-> Computer will pick "+computer);
		// Start
		System.out.print("How many “fingers” do you put out?");
		int usernumber = input.nextInt();
		//Random
		Random rand = new Random();
		int computernumber = rand.nextInt(6);
		System.out.print("The computer plays number "+computernumber+".");
		// Finger calculating(sum is odd or even)
		int sum =  usernumber + computernumber;
		System.out.println(usernumber+" + "+computernumber+" = "+sum);
		
		if(sum%2 == 0) {
			System.out.println(sum+"is even");
		}
		else System.out.println(sum+"is odd");
	
		// winner
		if(sum%2 == 0) {
			if(user.equals("even")) {
				System.out.println(name+" wins");
			}
			else System.out.println("Computer wins");
		}
		else { 
			if(user.equals("odd")) {
		
			System.out.println(name+"wins!");
			}
		
		else {
			System.out.println("Computer wins!");
			}
		}
	}

}

