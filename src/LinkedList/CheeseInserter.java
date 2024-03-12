package LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	//private - Sichtbarkeitsbereich auf Klasse beschränkt
		//static - von der Klasse abhängig und nicht vom Objekt
		//final - variable nach Initialisierung unveränderbar
	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?");
	
	
	public static void insertCheeseAroundVegetable(List<String>ingredients) {
		//Initialisierung Laufvariable (iterator)
		// Abbruchbedingung (hasNext())
		// keine Inkrementierung -> passiert im Schleifenkörper
		for(ListIterator<String> iterator = ingredients.listIterator(); iterator.hasNext();) {
			String ingredient = iterator.next();
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("Käse");
			}
		}
	}
			

	public static void main(String[] args) {
		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients,"Gnocchi", "Paprika", "Tomate", "Pfeffer");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
		

	}

}
