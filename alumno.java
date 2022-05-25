/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 11: Manejo De Excepciones, Errores, Archivos y Serialización  
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class alumno {
	Scanner input = new Scanner(System.in);
	public alumno(int c1, int c2, int c3,int c4, int c5, int c6, int c7){
		int arrayCalif[] = new int [] {c1,c2,c3,c4,c5,c6,c7};
		alumWrite(arrayCalif);
		
	}
	
	private double promedio(int arrayCalif []) {
		double promedio=0;
		for(int i=0 ; i<arrayCalif.length;i++ ){
			promedio+=arrayCalif[i];
		}
		promedio=promedio/arrayCalif.length;
		promedio=Math.round(promedio*100.0)/100.0;
		return promedio;
	}

	public String getName() throws excep{
		String name="";
		try{
			System.out.print("Captura el nombre del alumno: ");
			name=input.nextLine();
			if(name.length()<4){
				excep.fail(); //Excepción Personalizada
			}
			return name;
		}
		catch(excep ex){
			System.out.println("Error: " + ex);
			name=input.nextLine();
		}
		return name;
	}
	
	public int getMatricula(){
		int matricula=1 ;
		try{
			System.out.print("Captura la matrícula del alumno: ");
			matricula=input.nextInt();
			return matricula;
		}
		catch(InputMismatchException e){
			System.out.println("La matrícula solo debe contener números");
			matricula=input.nextInt();
		}
		return matricula;
	}
	
	private void alumWrite(int arrayCalif[]){
        try {
            File file = new File("Datos_Alumnos.ser");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Nombre del Alumno: " + getName() + '\n');
            bw.write("Matricula Del Alumno: " + getMatricula() + '\n');
            bw.write("Promedio Del Alumno: "+promedio(arrayCalif) + '\n');
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
}

}
