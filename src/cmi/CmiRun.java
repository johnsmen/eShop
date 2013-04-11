package cmi;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;

import persistence.ArtikelManager;
import valueobjekt.Artikel;

public class CmiRun {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String artName, artPreis, artNummer;
		Vector<Artikel> vecArtikel = new Vector<Artikel>();

		ArtikelManager artReader = new ArtikelManager();
		//Oeffne die Datei
		try {
			artReader.openReading("Artikel.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//Lese die Datei, Zeilen weise ein.
		try {
			Artikel artikel;
			do{
				artikel = artReader.lodeData();
				if (artikel != null)
					vecArtikel.add(artikel);
			}while(artikel != null);
			artReader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vecArtikel.add(new Artikel("Hallo", 123345, 7, 1.1f));

/*		try {
			artReader.openWriting("Artikel.txt");
			if(!vecArtikel.isEmpty()){
				Iterator iter = vecArtikel.iterator();
				while(iter.hasNext()){
					Artikel a = (Artikel) iter.next();
					artReader.saveData(a);
				}
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
*/
		//Gebe den Vector aus.
		System.out.println(vecArtikel.size());
		Iterator iter = vecArtikel.iterator();
		while(iter.hasNext()){
				Artikel a = (Artikel) iter.next();

				System.out.println(a.getBezeichner());
				System.out.println(a.getArtikelNr());
				System.out.println(a.getBestand());			
				System.out.println(a.getPreis());

			
		}
	}
}