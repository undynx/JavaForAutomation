package basics;

public class MethodsAndArguments {
	
	//al crear un metodo que reciba argumentos, es necesario especificar que tipo de datos recibira
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	//al crear un metodo que devuelva un valor, es necesario especificar que tipo de dato devolvera (ya no sera void)
	public int sum2(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public void mul(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}
	
	
	//MAIN//
	public static void main(String[] args) {
		MethodsAndArguments o = new MethodsAndArguments();
		
		o.sum(50, 50);
		
		int x = o.sum2(1, 1);
		o.mul(x, 2);
	}

}
