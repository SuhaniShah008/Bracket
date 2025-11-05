import java.util.*;
import java.util.stream.*; 
import java.util.Arrays;



public class bracket{


	private static ArrayList<String> openBrackets = new ArrayList<String>(Arrays.asList("(", "{", "[", "<"));
	private static ArrayList<String> closedBracket = new ArrayList<String>(Arrays.asList(")", "}", "]", ">"));


	public static void main(String[] args){
		 ArrayList<String> brackets = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter text: ");
		String userInput= scanner.nextLine();
		String[] text= userInput.split("");
		for(int i =0; i< text.length; i++){
			if(openBrackets.contains(text[i]) || closedBracket.contains(text[i])){
				brackets.add(text[i]);

			}
		}
		boolean validBrackets = seeValid(brackets);
		if(validBrackets){
		    System.out.println("Valid");
		}else{
		    System.out.println("Invalid");
		}

	}


    
	public static boolean seeValid(ArrayList<String> brackets){
		Stack<String> stack = new Stack<>();
		for(int i=0; i < brackets.size(); i++){
		    String now= brackets.get(i);
		    if(openBrackets.contains(now)){
		        stack.push(now);
		    }else{
		        if(stack.isEmpty()){
		            return false;
		        }
		        if(openBrackets.indexOf(stack.pop()) != closedBracket.indexOf(now)){
		            return false;
		        }
		    }
		  }
		  
		 return stack.isEmpty();

	 
	}
}