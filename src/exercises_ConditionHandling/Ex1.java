package exercises_ConditionHandling;

public class Ex1 {
	
	//perform the following calculation (2+3)*(5-2)
	
	public int suma(int a, int b) {
		
		int x = a + b;
		return x;

	}
	
	public int resta(int a, int b) {
		
		int x = a - b;
		return x;

	}
	
	private void mult(int a, int b) {
		
		int x = a * b;
		System.out.println("El resultado es " + x);

	}
	
	public static void main(String[] args) {
		
		Ex1 obj = new Ex1();
		int num1 = obj.suma(2, 3);
		int num2 = obj.resta(5, 2);
		obj.mult(num1, num2);
		
	}

}
