package valueobjekt;
/**
 * 
 * @author  Johann Luziv
 * @since   20130320
 * @version 1.0
 */
public class Kunde {
	
	protected String name;
	protected String adress;
	protected int customerNr;
	/**
	 * Leerer Konstruktor
	 */
	public Kunde(){}
	/**
	 * 
	 * @param name
	 * @param adress
	 * @param customerNr
	 */
	public Kunde(String name, String adress, int customerNr){
		this.name = name;
		this.adress = adress;
		this.customerNr = customerNr;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * 
	 * @return Kunden Name
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * 
	 * @param adress
	 */
	public void setAdress(String adress){
		this.adress = adress;
	}
	/**
	 * 
	 * @return Kunden Adresse
	 */
	public String getAdress(){
		return this.adress;
	}
	/**
	 * 
	 * @param customerNr
	 */
	public void setCustomerNr(int customerNr){
		this.customerNr = customerNr;
	}
	/**
	 * 
	 * @return Kundennumer
	 */
	public int getCustomerNr(){
		return this.customerNr;
	}
}



