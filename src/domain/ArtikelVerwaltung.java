package domain;

import java.util.Collection;
import java.util.Vector;

import persistence.ArtikelManager;
import persistence.DatenManager;
import valueobjekt.Artikel;;

/**
 * 
 * @author  Luziv
 * @since   20130410
 * @version 1.0
 * 
 */
public class ArtikelVerwaltung {
	//Artikel Verwaltung in einem Vector
	private Collection<Artikel> artikel = new Vector<Artikel>();
	//
	private DatenManager artikelManager = new ArtikelManager();
	
	public void ladeArtikel(){}
	
	public void speicherArtikel(){}
	
	public void sortiereArtikel(){}
	
	public void artikelEinfuegen(){}
	
	
}
