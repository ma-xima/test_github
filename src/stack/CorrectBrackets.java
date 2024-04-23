package stack;
import java.util.Stack;
//Selbst versucht- BracketTester (Richtige Datei)
public class CorrectBrackets {
	public static boolean checkBrackets(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
        	//Füget das Zeichen 'ch' dem Stack hinzu,wenn es eine öffnende Klammer ist
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
                
             /* Überprüfe, ob das aktuelle Zeichen 'ch' eine schließende Klammer ist, 
                der Stack nicht leer ist und das oberste Element des Stacks die
                entsprechende öffnende Klammer ist. 
                Falls ja,wird die öffnende Klammer aus dem Stack entfernt.
                */
            } else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ')' || ch == ']' || ch == '}') {
                return false; // Falsche Schließklammer
            }
        }

        return stack.isEmpty(); // Alle geöffneten Klammern wurden geschlossen
    }

	//Testen der Funktion
    public static void main(String[] args) {
        String expression1 = "{[()]}";
        String expression2 = "{[()]";
        String expression3 = "([)]";

        System.out.println(expression1 + ": " + (checkBrackets(expression1) ? "Korrekte Klammerung" : "Fehlerhafte Klammerung"));
        System.out.println(expression2 + ": " + (checkBrackets(expression2) ? "Korrekte Klammerung" : "Fehlerhafte Klammerung"));
        System.out.println(expression3 + ": " + (checkBrackets(expression3) ? "Korrekte Klammerung" : "Fehlerhafte Klammerung"));
    }
}


