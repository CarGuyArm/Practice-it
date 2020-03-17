import java.util.Scanner;


public class helloworld {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String longest = "";
	    boolean tie = false;
	    for (int i = 1;i <= 0;i++){
	        System.out.print("name #"+i+"?");
	        String name = input.next();
	        if(name.length() == longest.length()){
	            tie = true;
	        }
	        else if(name.length() >= longest.length()){
	            tie = false;
	            longest = name;
	        }
	}
	    String caps = longest.substring(0).toUpperCase() + longest.substring(1).toLowerCase();
	    System.out.println(caps + "'s name is longest");
	    if(tie)
	        System.out.println("(There was a tie!)");
	}

}
