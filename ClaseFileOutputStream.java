package Ejemplos;

import java.io.FileOutputStream;
import java.io.IOException;

public class ClaseFileOutputStream {

	public static void main(String[] args) {
		FileOutputStream fos= null;
		byte[] buffer = new byte [81];
		int nBytes;
		try{
			System.out.println("Escribir Texto a guardar en el archivo");
			nBytes = System.in.read(buffer);
			fos= new FileOutputStream("fos.txt");
			fos.write(buffer,0,nBytes);
		}
		catch (IOException ioe){
			System.out.println("Error: " + ioe.toString());
		}
		finally{
			try{
				if(fos!=null) fos.close();
			}
			catch (IOException ioe){
				System.out.println("Error al cargar el archivo");
			}
		}

	}

}
