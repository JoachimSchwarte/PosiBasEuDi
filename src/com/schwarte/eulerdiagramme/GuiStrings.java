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
			case "e1": r = "Eine der Postitionsangaben ist keine "
					+ "Ziffer (0 - 9)."; break;
			case "e2": r = "Einer der Kreise kann nicht gezeichnet "
					+ "werden."; break;
			case "e3": r = "Eine der Markierungen A, B, C oder * wird "
					+ "von einem anderen Element verdeckt."; break;
			case "e4": r = "Der Stern befindet sich nicht innerhalb "
					+ "mindestens eines Kreises."; break;
			case "e5": r = "Benutzungshinweise:"; break;
			case "e6": r = "Jedes Eingabefeld muss eine Ziffer "
					+ "enthalten."; break;
			case "e7": r = "Doppelt auftretende Ziffern sollten in "
					+ "der Regel vermieden werden."; break;
			case "e8": r = "Eine öffnende Klammer muss "
					+ "vor dem zugehörigen Buchstaben liegen."; break;
			case "e9": r = "Eine schließende Klammer muss "
					+ "hinter dem zugehörigen Buchstaben liegen."; break;
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
			case "e1": r = "One of the position specifications is not "
					+ "a number (0 to 9)."; break;
			case "e2": r = "One of the circles cannot be drawn."; break;
			case "e3": r = "One of the letters (A, B, C) or the "
					+ "star (*) is masked by annother element."; break;
			case "e4": r = "The star is not located within at least "
					+ "one of the circles."; break;
			case "e5": r = "Usage tips:"; break;
			case "e6": r = "Each entry field must contain a "
					+ "number."; break;
			case "e7": r = "Dublicate occurrence of a number should "
					+ "be generally avoided."; break;
			case "e8": r = "An opening bracket must "
					+ "be placed previous to the "
					+ "corresponding letter."; break;
			case "e9": r = "A closing bracket must "
					+ "be placed behind the "
					+ "corresponding letter."; break;
			}		
		}
		return r;
	}
}
