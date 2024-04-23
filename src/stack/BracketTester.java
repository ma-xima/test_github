package stack;

import java.util.LinkedList;

//LÖSUNG
public class BracketTester {
	
	public static boolean checkBrackets(String input) {
		LinkedList<Character> stack = new LinkedList<>();
		for(char c :input.toCharArray()) {
			if(c == '(' || c == '{'|| c == '[') {
				stack.push(c);
			}else if(c == ')' || c == '}'|| c == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				char lastOpen = stack.peek();
				if(( c == ')' && lastOpen != '(') ||
					( c == '}' && lastOpen != '{') ||
					( c == ']' && lastOpen != '[')) {
					return false;
				}
				stack.pop(); //löschen
			}
		}
		return stack.isEmpty();
	}
	

	public static void main(String[] args) {
		String c = "({})";
		System.out.println("Ausdrucck: " + checkBrackets(c));
		// TODO Auto-generated method stub

	}

}
