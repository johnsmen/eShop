package persistence;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.*;

import valueobjekt.Artikel;


/**
 * 
 * @author Johann Luziv
 * @since 20130326
 * @version 1.0
 */
public class ArtikelManager implements DatenManager{
	private BufferedReader reader = null;
	private PrintWriter writer = null;
	
	@Override
	public void openReading(String file) throws FileNotFoundException {
		reader = new BufferedReader(new FileReader(file));
	}

	@Override
	public void openWriting(String file) throws IOException {
		writer = new PrintWriter(new BufferedWriter(new FileWriter(file)));
	}
	/**
	 * Liest aus einer Text Datei zeilenweise ein.
	 * 
	 * @return Artikel Objekt.
	 * 	
	 */
	public Artikel lodeData() throws IOException {
		String bezeichner = reader.readLine();
		/*
		 * Wenn Bezeichner null ist, dann ist die Datei leer! 
		 * return null, bedeutet den abruch der schleife in der aufrufenden Klasse.
		*/
		if(bezeichner == null){
			return null;
		}
		//Holt sich zeilenweise die String aus der Datei.
		String nummer  = reader.readLine();
		String bestand = reader.readLine();
		String preis   = reader.readLine();
		//Erstellt ein neues Artikel Objekt
		return new Artikel(bezeichner, Integer.parseInt(nummer), Integer.parseInt(bestand), Float.parseFloat(preis));
	}
	//@Override
	public boolean saveData(Artikel artikel) throws IOException {
			writer.print(artikel.getBezeichner());
			writer.print(artikel.getArtikelNr() + "");
			writer.print(artikel.getBestand() + "");
			writer.print(artikel.getPreis() + "");
			return true;
		
	}

	@Override
	public boolean close() throws IOException{
		if (writer != null)
			writer.close();
		
		if (reader != null) {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				return false;
			}
		}
		return true;
	}
}