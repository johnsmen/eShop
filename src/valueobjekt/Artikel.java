package valueobjekt;

import java.util.Vector;

/**
 * 
 * @author  Johann Luziv
 * @since   20130320
 * @version 1.0
 */
public class Artikel {
	
	protected String bezeichner; 
	protected int artikelNr;
	protected int bestand;
	protected float preis;
//	protected Vector<Artikel> vecArt;
	
	public Artikel() {
	}
	
	/**
	 * 
	 * @param bezeichner, geschreibt den Artikel.
	 * @param artikelNr, Artikelnummer ueber diese Nummer kann der Artikel, eindeutig identifiziert werden.
 	 * @param bestand, ist der Bestand des auf Lager liegenden Artikel.
	 */
	public Artikel(String bezeichner, int artikelNr, int bestand, float preis){
		this.bezeichner = bezeichner;
		this.artikelNr  = artikelNr;
		this.bestand    = bestand;
		this.preis      = preis;
	}
	
	/**
	 * 
	 * @param bezeichner
	 */
	public void setBezeichner(String bezeichner){
		this.bezeichner = bezeichner;		
	}
	/**
	 * 
	 * @return Liefer die Bezeichnung des Artikel.
	 */
	public String getBezeichner(){
		return this.bezeichner;
	}
	/**
	 * 
	 * @param artikelNr
	 */
	public void setArtikelNr(int artikelNr){
		this.artikelNr = artikelNr;
	}
	
	public void setPreis(float preis){
		this.preis = preis;
	}
	/**
	 * 
	 * @return Liefert die Artikelnummer.
	 */
	public int getArtikelNr(){
		return this.artikelNr;
	}
	/**
	 * 
	 * @param der bestand kann mit dieser Methode Manipuliert werden.
	 */
	public void setBestand(int bestand){
		this.bestand = bestand;
	}
	/**
	 * 
	 * @return Liefert den Bestand des Artikel.
	 */
	public int getBestand(){
		return this.bestand;
	}
	/**
	 * 
	 * @return 
	 */
	public float getPreis(){
		return this.preis;
	}
	/**
	 * 
	 * @param artikel
	 * @return
	 */
	public boolean equals(Artikel artikel){
		if(this.artikelNr == artikel.getArtikelNr()){
			return false;
		}
		return true;
	}
	
}







