package basics;

public class Constructors {
	
	//los constructors son similares a los methods
	//se utilizan para realizar una task al inicio de la class
	//los constructors reciben el MISMO nombre que la clase
	//los constructors pueden recibir argumentos pero nunca retornar valor
	//los constructors son llamados automaticamente cuando se crea el objeto de la clase
	//si un constructor recibe argumentos, estos deben ser insertados cuando se crea el objeto de la clase
	
	public Constructors(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		Constructors call = new Constructors(4, 8);
	}

}
