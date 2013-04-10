package cmi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import kern.Artikel;
import kern.Mitarbeiter;
import persistence.ArtikelManager;
import persistence.MitarbeiterManager;

public class Mitarbeitertest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String mitName, mitNumber;
		Vector<Mitarbeiter> vecMitarbeiter = new Vector<Mitarbeiter>();

		MitarbeiterManager artReader = new MitarbeiterManager();
		//Oeffne die Datei
		try {
			artReader.openReading("Mitarbeiter.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Lese die Datei, Zeilen weise ein.
		try {
			while(artReader.lodeData() != null){
				Mitarbeiter mitarbeiter = (Mitarbeiter) artReader.lodeData();
				vecMitarbeiter.add(mitarbeiter);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Gebe den Vector aus.
		//System.out.println(vecArtikel.size());
		Iterator iter = vecMitarbeiter.iterator();
		while(iter.hasNext()){
			Mitarbeiter m = (Mitarbeiter) iter.next();
			System.out.println(m.getName());
			System.out.println(m.getNumber());
			
		}


}
}
