package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PrintWriterExample {
    public static void main(String[] args) {
        // Passe den Dateipfad entsprechend an
        String dateipfad = "text.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(dateipfad))) {
            String zeile;
            StringBuilder musiknoten = new StringBuilder();

            while ((zeile = reader.readLine()) != null) {
                // Extrahiere Musiknoten (C, D, E, F, G, A, B, c, d, e, f, g, a, b, c', d', e', f', g', a', b')
                String noten = zeile.replaceAll("[^CDEFGABcdefgab']", "");
                musiknoten.append(noten);
            }

            System.out.println("Extrahierte Musiknoten: " + musiknoten.toString());
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }
}


//C:\Users\Maxima\git\test_github