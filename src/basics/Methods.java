package basics;

public class Methods {
	
	//cualquier codigo que se escriba que no sea una variable o constante debe estar dentro de un metodo (funcion)
	//nombre+control+space para crear un metodo
	
	public void hello() {
		System.out.println("Hello from method 'hello'");

	}
	
	public void fromOutside() {
		System.out.println("Hello from 'Methods'");

	}

	public static void main(String[] args) {
		System.out.println("Hello from main");
		
		//para llamar un metodo, es necesario crear un objeto que contenga la class (en este caso se llama methods)
		//y desde alli se pueden llamar los methods que estan dentro de la class
		Methods obj = new Methods();
		
		//para llamar a los methods se usa el nombre del objeto y luego el nombre del method
		obj.hello();
		obj.fromOutside();
	}
}
