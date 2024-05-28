package exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReadMusicNotes {

    private static final Pattern noten = Pattern.compile("C,|D,|E,|F,|G,|A,|B,|C|D|E|F|G|A|B|c|d|e|f|g|a|b|c'|d'|e'|f'|g'|a'|b'");

    public static void main(String[] args) {

        try {
            File eingabeDatei = new File("MusikEingabe.txt");
            Scanner scanner = new Scanner(new FileInputStream(eingabeDatei), "UTF-8");

            File ausgabeDatei = new File("MusikAusgabe.txt");
            FileWriter fw = new FileWriter(ausgabeDatei);
            BufferedWriter bw = new BufferedWriter(fw);

            while (scanner.hasNextLine()) {
                String zeile = scanner.nextLine();
                System.out.println(zeile);
                if(noten.matcher(zeile).matches()) {
                    bw.write(zeile + " ");
                }
           }

            scanner.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
