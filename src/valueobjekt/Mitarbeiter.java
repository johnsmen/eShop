package valueobjekt;

/**
 * @author Johann Luziv
 * @since  20130320
 * @version 1.0
 */

public class Mitarbeiter {
	
	protected String name;
	protected int number;

	public Mitarbeiter(){}
	/** 
	 * @param name. Name des Mitarbeiters
	 * @param number. Mitabeiternummer 
	 */
	public Mitarbeiter(String name, String number){
		this.name   = name;
		this.number = Integer.parseInt(number);
	}
	/**
	 * 
	 * @param name. Name des Mitarbeiters
	 */
	public void setName(String name){
		this.name = name;
	}
	/**
	 * 
	 * @return liefert den Name des Mitarbeiters
	 */
	public String getName(){
		return this.name;
	}
	/**
	 * 
	 * @param liefert die Number des Mitarbeiters
	 */
	public void setNumber(int number){
		this.number = number;
	}
	/**
	 * 
	 * @return
	 */
	public int getNumber(){
		return this.number;
	}
	
	public boolean equels(Mitarbeiter mitarbeiter){
		
		if (this.number == mitarbeiter.getNumber()){
			return true;
		}
		return false;
	}
}
