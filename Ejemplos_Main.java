package Ejemplos;

public class Ejemplos_Main {

	public static void main(String[] args) {
		try{
			System.out.println("/Try/ instruci�n1");
			System.out.println("/Try/ instruci�n2");
			System.out.println("/Try/ instruci�n3, etc");
		}
		catch(Exception e){
			System.out.println("/catch/ instruciones a ejecutar"
					+ " cuando se produce un error");
		}
		finally{
			System.out.println("/finally/ instruciones a generar "
					+ "(haya o no haya errores)");
		}

	}

}
