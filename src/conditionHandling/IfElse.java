package conditionHandling;

public class IfElse {
	
	public void evenOrOdd(int a) {
		
		//si la condicion se cumple, se toma el if 
		//si no se cumple, se toma el else, por eso no es necesario poner otra condicion
		if(a%2==0) {
			if(a<100) {
				System.out.println(a + " es par y menor que 100");
			} else if(a>100) {
				System.out.println(a + " es par y mayor que 100");
			} else {
				System.out.println(a + " es 100");
			}
		} else {
			System.out.println(a + " no es par :(");
		}

	}
	
	public static void main(String[] args) {
		
		IfElse obj = new IfElse();
		obj.evenOrOdd(7);
		obj.evenOrOdd(0);
		obj.evenOrOdd(999);
		obj.evenOrOdd(100);
	}

}
