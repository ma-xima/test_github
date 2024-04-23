package stack;

import java.util.Stack;

//Selbst versucht - StringReversal(richtige Datei)
public class ReverseWords {  
	public static String reverseString(String input) {
		if (input == null)
        return null;

    Stack<Character> stack = new Stack<>();
    // Den String in den Stack umkehren
    	for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

    // Den umgekehrten String zusammensetzen
    StringBuilder reversed = new StringBuilder(); //StringBuilder = Klasse in Java
    	while (!stack.isEmpty()) {
    		reversed.append(stack.pop());//append() = eine Methode der Klasse StringBuilder 
    	/*wird verwendet, um Zeichen oder Zeichenfolgen an das Ende 
    	  des aktuellen Inhalts des StringBuilder-Objekts anzufügen*/
    	 
    	}

    	return reversed.toString();
	}

	public static void main(String[] args) {
		String input = "Hallo Welt!";
		System.out.println("Eingabe: " + input);
		System.out.println("Umgekehrter String: " + reverseString(input));
    
	}
}

	/*private int front;
	private int capacity;
	private int[] stack;
	private String input;
	
	
	public reverseString(String input){
		this.front = -1;
		this.capacity = capacity;
		this.stack = new int[capacity];
		this.input = new String [input];
	}
	*/





