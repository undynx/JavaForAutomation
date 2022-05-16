package exercises_Loops;

import java.util.Scanner;

public class NumeroPrimo {
	
	private void esPrimo() {
		
		Scanner numUser = new Scanner(System.in);
		System.out.println("Ingresa un número para saber si es primo");
		
		int numScanner = numUser.nextInt();
		int counter = 1;
		int cantDivisores;
		
		for (cantDivisores = 0; counter <= numScanner; cantDivisores++) {
			if (numScanner % counter == 0) {
				System.out.println(counter);
			}
			counter = counter + 1;
		}
		
		if (cantDivisores == 2) {
			System.out.println(numScanner + " es primo");
		} else {
			System.out.println(numScanner + " no es primo");

		}
	}
	
	public static void main(String[] args) {
		NumeroPrimo obj = new NumeroPrimo();
		obj.esPrimo();
	}

}
