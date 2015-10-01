package praktikum2;

import praktikum1.TextIO;

public class Stringipikkus {
	
	public static void main(String[] args) {
		System.out.print("Sisesta oma nimi ...asda ");		
		String nimi = TextIO.getlnString();	
		int nimePikkus = nimi.length();
		System.out.println("Nimi "+nimi+" sisaldab "+nimePikkus +" tähemärki" );
	}

}

