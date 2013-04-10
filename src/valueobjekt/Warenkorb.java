package valueobjekt;

import java.util.Vector;

/**
 * 
 * @author  Johann Luziv
 * @since   20130320
 * @version 1.0
 */
public class Warenkorb {

	protected Vector<Artikel> vecArtikel;
	private Kunde kunde;
	
	
	//Konstruktor
	Warenkorb(Kunde kunde){
		this.kunde = kunde;
	}
	
	/**
	 * @param artikel
	 */
	
	public void insertArtikel(Artikel artik){
		this.vecArtikel.add(artik);
	}
	/**
	 * 
	 * @return
	 */
	public Vector<Artikel> getArtikel(){
		return this.vecArtikel;
	}
	/**
	 * 
	 * @return
	 */
	public Kunde getKunde(){
		return this.kunde;
	}
}