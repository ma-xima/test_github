package stack;
import java.util.Stack;
import java.util.Scanner;
//Selbst versucht - UPN (Richtige)
public class UpnCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ausdruck in umgekehrter polnischenr Notation eingeben:");
        String input = scanner.nextLine();
        
        try {
            double result = evaluateUPN(input);
            System.out.println("Ergebnis: " + result);
        } catch (Exception e) {
            System.out.println("Fehler beim Auswerten des Ausdrucks!");
        }
        
        scanner.close();
    }
    
    public static double evaluateUPN(String input) {
        String[] tokens = input.split("\\s+");
        Stack<Double> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else if (token.equals("+")) {
                if (stack.size() < 2) {
                    System.out.println("Nicht genug Operanden für Addition");
                    return 0; // Rückgabe eines Platzhalters
                }
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a + b);
            } else if (token.equals("*")) {
                if (stack.size() < 2) {
                    System.out.println("Nicht genug Operanden für Multiplikation");
                    return 0; 
                }
                double b = stack.pop();
                double a = stack.pop();
                stack.push(a * b);
            } else {
                System.out.println("Ungültiges Token: " + token);
                return 0; 
            }
        }
        
        if (stack.size() != 1) {
            System.out.println("Ungültiger Ausdruck");
            return 0; 
        }
        
        return stack.peek();
    }
}
