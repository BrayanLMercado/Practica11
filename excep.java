/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 11: Manejo De Excepciones, Errores, Archivos y Serializaci�n  
*/

public class excep extends Exception {
	public excep(String ms){
		super(ms);
	}
	
	public static void fail() throws excep{
		throw new excep("El Nombre debe contener 4 caracteres minimo");
	}
}
