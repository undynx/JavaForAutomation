package conditionHandling;

public class NestedCondition {
	
	//anidación de condiciones
	//primero verificar si el numero es mas grande que 10 y luego si es par o impar
	
	public void getData(int a) {
		
		if (a>10) {
			if(a%2==0) {
				System.out.println(a + " es par y mayor que 10");
			} else {
				System.out.println(a + " es impar y mayor que 10");
			}
		} else {
			System.out.println(a + " es menor que 10");
		}
	}
	
	public static void main(String[] args) {
		NestedCondition o = new NestedCondition();
		o.getData(8);
		o.getData(11);
		o.getData(10);


	}

}
