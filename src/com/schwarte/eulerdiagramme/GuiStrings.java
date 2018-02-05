package com.schwarte.eulerdiagramme;

public class GuiStrings {
	
	public static String getGuiString(String s, Language l) {
		String r = "";
		if (l == Language.Deutsch) {
			switch (s) {
			case "ti": r = "Positionsbasierte Euler-Diagramme"; break;
			case "c1": r = "Kreis A J/N"; break;
			case "c2": r = "Kreis B J/N"; break;
			case "c3": r = "Kreis C J/N"; break;
			case "c4": r = "* J/N"; break;
			case "b1": r = "Diagramm neu zeichnen"; break;
			case "l1": r = "Sprache:"; break;
			case "e0": r = "Es sind Fehler aufgetreten:"; break;
			case "e1": r = "Eine der Postitionsnummern liegt ausserhalb "
					+ "des zulässigen Bereichs (0 bis 9)."; break;
			case "e2": r = "Einer der Kreise kann nicht gezeichnet "
					+ "werden."; break;
					
			}
		}
		if (l == Language.English) {
			switch (s) {
			case "ti": r = "Position based Euler Diagrams"; break;
			case "c1": r = "Circle A Y/N"; break;
			case "c2": r = "Circle B Y/N"; break;
			case "c3": r = "Circle C Y/N"; break;
			case "c4": r = "* Y/N"; break;
			case "b1": r = "redraw diagram"; break;
			case "l1": r = "Language:"; break;
			case "e0": r = "Some error occurred:"; break;
			case "e1": r = "One of the position numbers is out of "
					+ "range (0 to 9)."; break;
			case "e2": r = "One of the circles cannot be drawn."; break;
			}		
		}
		return r;
	}
}
