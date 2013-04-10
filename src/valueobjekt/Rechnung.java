package valueobjekt;

import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class Rechnung {
	
	private Date date;
	private float gesPreis = 0.0f;
	private int gesArtikel;
	private Vector<Artikel> alleArtikel;
	private Kunde kunde;
	
	/**
	 * 
	 * @param artikel Uebergen wird ein Vektor mit Artikel.
	 * @param kunde 
	 */
	Rechnung(Vector<Artikel> artikel, Kunde kunde){
		this.alleArtikel = artikel;
		this.kunde = kunde;
	}
	/**
	 * 
	 * @param artikel Ein Vector mit Artikeln.
	 * @return gibt die Anzahl der Artikel wieder.
	 */
	public int getAnzahlArtikel(Vector<Artikel> artikel){
		gesArtikel = artikel.size();
		return gesArtikel; 
	}
	/**
	 * 
	 * @param artikel
	 * @return
	 */
	public float gesamtPreis(Vector<Artikel> artikel){
		Iterator<Artikel> iter = artikel.iterator();
		while(iter.hasNext()){
			Artikel art = iter.next();
			gesPreis = gesPreis + art.getPreis();
 		}
		return gesPreis;
	}
	/**
	 * 
	 * @param artikel
	 * @return
	 */
	public Vector<Artikel> setAlleArtikel(Vector<Artikel> artikel){
		return this.alleArtikel;
	}
	/**
	 * 
	 * @return
	 */
	public Kunde getKunde(){
		return kunde;
	}
}




