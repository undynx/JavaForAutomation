package exercises_ConditionHandling;

public class Ex3 {
	
	//perform the following calculation (2+8)*(2+5+7)
	
	public int sum(int a, int b) {
		int x = a+b;
		return x;
	}
	
	public void mult(int a, int b) {
		int x = a*b;
		System.out.println("El valor es " + x);
	}
	
	public static void main(String[] args) {
		Ex3 obj = new Ex3();
		
		int num1 = obj.sum(2, 8);
		int num2 = obj.sum(2, 5);
		int num3 = obj.sum(num2, 7);
		obj.mult(num1, num3);
		
	}

}
