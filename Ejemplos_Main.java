package Ejemplos;

public class Ejemplos_Main {

	public static void main(String[] args) {
		try{
			System.out.println("/Try/ instrución1");
			System.out.println("/Try/ instrución2");
			System.out.println("/Try/ instrución3, etc");
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
