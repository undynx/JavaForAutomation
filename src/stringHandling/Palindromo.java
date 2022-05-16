package stringHandling;

import java.util.Scanner;

public class Palindromo {
	
	Scanner teclado = new Scanner(System.in);
	
	private void esPalindromo() {
	
		System.out.println("Ingresa una frase para saber si es un palindromo");
		String palindromoConEspacios = teclado.nextLine();
		String palindromo = palindromoConEspacios.replace(" ", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u").toLowerCase();
		int palindromoFin = palindromo.length()-1;
		int palindromoInicio = 0;
		boolean esPalindromo = true;
		
		while(palindromoFin > palindromoInicio) {
			
			if (palindromo.charAt(palindromoInicio) != palindromo.charAt(palindromoFin)) {
				esPalindromo = false;
				break;
			}
			
			palindromoFin --;
			palindromoInicio ++;
		}
		
		if (esPalindromo == true) {
			System.out.println("Es palindromo");
		} else {
			System.out.println("No es palindromo");
		}
		
	}
	
	public static void main(String[] args) {
		Palindromo obj = new Palindromo();
		obj.esPalindromo();
	}
	
	
}
