package exercises_Loops;

import java.util.Scanner;

public class PrintFibonacci {
	
	private void Fibonacci() {
		
		Scanner numUsr = new Scanner(System.in);
		System.out.println("Cuantas veces deseas repetir la secuencia? ");
		int numScanner = numUsr.nextInt();
		
		
		int a = 0;
		int b = 1;
		int result;
		
		for (int i=0 ; i < numScanner ; i++) {
			
			result = a + b;
			a = b;
			b = result; 
			
			System.out.println(result);
		}
		

	}
	
	public static void main(String[] args) {
		
		PrintFibonacci obj = new PrintFibonacci();
		obj.Fibonacci();
		
	}

}