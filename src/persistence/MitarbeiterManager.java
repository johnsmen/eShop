package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

import valueobjekt.Artikel;
import valueobjekt.Mitarbeiter;

public class MitarbeiterManager implements DatenManager{
	private BufferedReader reader = null;
	private PrintWriter writter = null;
	
	@Override
	
	public void openReading(String file) throws IOException {
		// TODO Auto-generated method stub
		reader = new BufferedReader(new FileReader(file));
	}
	@Override
	public void openWritting(String file) throws IOException {
		// TODO Auto-generated method stub
		writter = new PrintWriter(new BufferedWriter(new FileWriter(file)));
	}

	
	@Override
	public Object lodeData() throws IOException {
		// TODO Auto-generated method stub
		String name = reader.readLine();
		if(name == null){
			return null;
		}
		String number = reader.readLine();
		
		return new Mitarbeiter(name, number);
		
	}

	@Override
	public void saveData(Vector obj) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean close() throws IOException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}
