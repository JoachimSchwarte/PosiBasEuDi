package com.schwarte.eulerdiagramme;
import java.util.LinkedList;
public class EulerDiagramme {	
	private static LinkedList<String> Z = new LinkedList<String>();
	private static String L=" ";
	private static char leer = L.charAt(0);	
	public static void mixStrings(String X, String Y) {
		char[] S = new char[X.length()+Y.length()];
		for (int i=0; i<X.length()+Y.length(); i++) S[i]=leer;
		addOneLetter(X, Y, S, 0, 0); return;}		
	public static void addOneLetter(String X, String Y, char[] S, int ib, int kb) {
		if (ib<X.length()) {
			for (int k=kb; k<X.length()+Y.length(); k++) {
				S[k]=X.charAt(ib);
				addOneLetter(X, Y, S, ib+1, k+1);
				for (int i=k; i<X.length()+Y.length(); i++) S[i]=leer;}		
		} else {
			char[] T = new char[X.length()+Y.length()];
			for (int i=0; i<X.length()+Y.length(); i++) T[i]=S[i];
			for (int j=0; j<Y.length(); j++) {
				int k=0;
				while (k<X.length()+Y.length() && T[k] != leer) k++;				
				T[k]=Y.charAt(j);}
			String U="";
			for (int k=0; k<X.length()+Y.length(); k++) U=U+T[k];
			Z.add(U); } return;}
	public static String mirrorString(String P) {
		String O="";
		for (int i=P.length()-1; i>=0; i--) {
			O=O+P.charAt(i);
		}
		return O;
	}
	public static void eraseSymmetry(){
		for (int i=Z.size()-1; i!=0; i--) {
			for (int j=0; j!=i-1; j++) {
				if (Z.get(j).equals(mirrorString(Z.get(i)))) {
					Z.remove(i);
					break;
				}
			}		
		}
	}
	public static void eraseBigDouble() {
		String A1="A";
		char A2=A1.charAt(0);
		String C1="C";
		char C2=C1.charAt(0);
		for (int i=Z.size()-1; i!=0; i--) {
			for (int j=0; j<Z.get(i).length()-1; j++) {
				if (Z.get(i).charAt(j)>=A2 && Z.get(i).charAt(j+1)>=A2 && Z.get(i).charAt(j)<=C2 && Z.get(i).charAt(j+1)<=C2) {
					Z.remove(i);
					break;
				}
			}				
		}
	}
	public static void main(String[] args) {
		mixStrings("aAa", "bBb");
		eraseSymmetry();
		eraseBigDouble();
		for (String U: Z) System.out.println(U);
		System.out.println(Z.size()); 		
	} }