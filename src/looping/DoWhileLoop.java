package looping;

public class DoWhileLoop {
	
	//do while se ejecuta al menos una vez
	//no importa si se cumple la condicion o no
	
	private void printMessage() {
		
		int i = 0;
		
		do {
			System.out.println("Este c�digo se ejecutar� aunque la condici�n no se cumpla");
			i--;
		} while (i > 0);

	}
	
	public static void main(String[] args) {
		
		DoWhileLoop obj = new DoWhileLoop();
		obj.printMessage();
	}

}
