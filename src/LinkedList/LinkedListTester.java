package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>(); //kann hier durch zB Array ausgetauscht werden
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		//"Laufvariable" zum Iterieren einer Datenstruktur
		//läuft immer vom Anfang bis zum Ende
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			if(iterator.next() == 3) {
				//System.out.println("Found 3");
				iterator.remove(); // löschen der Stelle an der wir gerade sind
			}
		}
		// Iterator muss wieder zurückgesetzt werden
		//Iterator muss wieder an den Anfang der Liste gesetzt werden
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
