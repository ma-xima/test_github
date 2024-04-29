package string;

public class PasswordTester {
	
    public static boolean istSonderzeichen(char zeichen) {
        return Character.isLetterOrDigit(zeichen);
    }

    public static boolean isGoodPassword(String input) {
        if (input.length() < 8 ) {
            System.err.println("Passwort neu wählen(Mehr als 8 zeichen)");
            return false;
        }
        for(char zeichen : input.toCharArray()) {
            if(istSonderzeichen(zeichen)) {
                System.err.println("Passwort neu wählen(Braucht ein Sonderzeichen)");
                return false;
            }
        }
        System.out.println("Passwort ist Gut");
        return true;
    }

    public static void main(String[] args) {

        String password = "abcdabcd";
        System.out.println(isGoodPassword(password));

    }

}
		
	
