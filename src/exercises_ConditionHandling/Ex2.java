package exercises_ConditionHandling;

public class Ex2 {
	
	//perfom following calculation (2^2) + (5^2)
	
	public int square(int num) {
		
		int x = num * num;
		return x;

	}
	
	public void sum(int a, int b) {
		int x = a + b;
		System.out.println("El resultado es " + x);

	}
	
	public static void main(String[] args) {
		
		Ex2 obj = new Ex2();
		
		int num1 = obj.square(2);
		int num2 = obj.square(5);
		obj.sum(num1, num2);
	}

}
