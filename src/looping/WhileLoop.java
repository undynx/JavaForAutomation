package looping;

public class WhileLoop {
	
	public void printData(){
		
		//es importante agregar la condicion de stop
		//de lo contrario crearemos un loop infinito
		
		int i = 10;
		
		while(i>0) {
			System.out.println("Mensaje escrito desde un while :D");
			i--;
		}
		
		System.out.println("El código seguirá ejecutándose *después* de que se termine de ejecutar el loop");
		
	}
	
	public static void main(String[] args) {
		
		WhileLoop obj = new WhileLoop();
		obj.printData();
		
		
	}

}
