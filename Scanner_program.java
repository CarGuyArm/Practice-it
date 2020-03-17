import java.util.*;

public class Scanner_program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Vacation Plan!");
		System.out.print("What is your name? ");
			String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", where are you travelling to?");
			String city = input.nextLine();
		System.out.println("Tuyn! Your trip will be great in"+city+".");
		budget(); 
	}
	 public static String budget() {
		 Scanner input = new Scanner(System.in);
	        System.out.print("How much money (AMD) will you spend there?");
				int money = input.nextInt();
				int pox = dramtousd(money);
			System.out.println("Great! In USD it'll be around" + pox);
			System.out.println("How long(days) will you stay there?");
				int days = input.nextInt();
			System.out.print("So,if you are going to stay there for "+days+" days you'll spend about " +daymoney(pox,days)+" per day");
			return null;
	    }
	 public static int dramtousd(int a){
		 Scanner input = new Scanner(System.in);
		 int dollar = 0;
		 	if(a>0)
		 		dollar = a/350;
		 	return dollar;
	 }
	 public static int daymoney(int a,int b) {
		 int budget=0;
		 if(a>0 && b>0)
			budget = a*b;
		 return budget;
	 }
	 
}


/*
  public void budget(double) {
        System.out.print("How much money (AMD) will you spend there?");
			Double money = input.nextDouble();
		System.out.print("Great! In USD it'll be around" + (int)(money*474));	
    }
 
*/