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
			}
		}
		if (l == Language.Englisch) {
			switch (s) {
			case "ti": r = "Position based Euler Diagrams"; break;
			case "c1": r = "Circle A Y/N"; break;
			case "c2": r = "Circle B Y/N"; break;
			case "c3": r = "Circle C Y/N"; break;
			case "c4": r = "* Y/N"; break;
			case "b1": r = "redraw diagram"; break;
			case "l1": r = "Language:"; break;
			}		
		}
		return r;
	}
}
