package Ejemplos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class DeSerializaDate {
	DeSerializaDate(){
		Date d= null;
		try{
			FileInputStream f = new FileInputStream("data.ser");
			ObjectInputStream s = new ObjectInputStream(f);
			d = (Date)s.readObject();
			s.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Deserializae date object from data.ser");
		System.out.println("Date: " + d);
	}
	public static void main(String[] args) {
		new DeSerializaDate();
	}

}
