/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 11: Manejo De Excepciones, Errores, Archivos y Serialización  
*/

public class excep extends Exception {
	public excep(String ms){
		super(ms);
	}
	
	public static void fail() throws excep{
		throw new excep("El Nombre debe contener 4 caracteres minimo");
	}
}
