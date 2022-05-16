package basics;

import java.util.Scanner;

public class ScannerExample {
	
	public static void main(String[] args) {
		
		System.out.println("Escribí tu nombre");

		//Scanner se utiliza para tomar informacion de la consola
		//se crea el objeto scanner
		//por default System.in se le llama a la consola
		Scanner nombre = new Scanner(System.in); 
		
		//nextLine refiere a que en la proxima linea se espera un input
		String espacio = nombre.nextLine();
		
		//ahora se imprime lo que se obtuvo de la consola
		System.out.println("Hola " + espacio);
		
		/* IMPORTANTE: SCANNER PUEDE RECIBIR UNICAMENTE STRINGS */
		
	}

}
