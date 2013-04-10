package persistence;

import java.io.IOException;


import valueobjekt.Artikel;
/*
 *TODO imports KONTROLIEREN 
 */

/**
 * @author Luziv
 * @since  20130326
 * @version 1.0
 */
public interface DatenManager {
	/**
	 * 
	 * @param file
	 * @throws IOException
	 */
	public void openReading(String file) throws IOException;
	/**
	 * 
	 * @param file
	 * @throws IOException
	 */
	public void openWriting(String file) throws IOException;
	/**
	 * 
	 * @return
	 * @throws IOException
	 */
	public Object lodeData() throws IOException;
	/**
	 * 
	 * @param obj
	 * @return
	 * @throws IOException
	 */
	public boolean saveData(Artikel art) throws IOException;

	public boolean close() throws IOException;
	
}
