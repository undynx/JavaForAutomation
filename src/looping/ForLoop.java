package looping;

public class ForLoop {
	
	private void printData() {
		
		//declarar una variable que será el "iniciador"
		//declarar HASTA CUANDO se va a ejecutar el loop
		//declarar como incrementa la variable
		
		for(int i=1; i<=10; i++) {
			System.out.println(i + " mensaje escrito desde un loop For :D");
		}
		System.out.println("El código seguirá ejecutándose *después* de que se termine de ejecutar el loop");

	}
	
	public static void main(String[] args) {
		
		ForLoop obj = new ForLoop();
		obj.printData();
	}

}
