package Ejemplos;

import java.io.File;
import java.io.IOException;

public class Escribe {

	public static void main(String[] args) {
		try{
			File archivo = new File("Archivo.txt");
			System.out.println(archivo.exists());
			boolean seCreo = archivo.createNewFile();
			System.out.println(seCreo);
			System.out.println(archivo.exists());
		}
		catch(IOException e){
			
		}

	}

}
