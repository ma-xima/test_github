package exceptions;

public class DivisionExample {

    public static void main(String[] args) {
        // Beispielaufrufe der divide-Methode
        divide(10, 2);  
        divide(10, 0);  // Fehlermeldung weil Division durch Null
    }

    public static void divide(int x, int y) {
        try {
            if (y == 0) {
                throw new ArithmeticException("Division durch Null ist nicht erlaubt.");
            }
            double result = x / (double)y;  // Durchführung der Division
            System.out.println("Das Ergebnis ist " + result);
        } catch (ArithmeticException e) {
            // Behandeln der Division durch Null
            System.err.println("Fehler: " + e.getMessage());
        }
    }
}

