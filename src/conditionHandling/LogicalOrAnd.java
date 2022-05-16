package conditionHandling;

public class LogicalOrAnd {
	
	//numero divisible entre 5 y 7
	
	public void esDivisible5o7(int a) {
		
		if(a%7 == 0 && a%5 == 0) {
			System.out.println(a + " es divisible entre 5 y 7");
		} else if(a%7 == 0) {
			System.out.println(a + " es divisible entre 7");
		} else if(a%5 == 0) {
			System.out.println(a + " es divisible entre 5");
		} else {
			System.out.println(a + " no es divisible entre 7 ni entre 5");
		}
		
	}
	
	public void esDivisible2o3(int a) {
		
		if (a%2==0 || a%3==0) {
			System.out.println(a+ " es divisible entre 2 o entre 3! Yay :)");
		} else {
			System.out.println(a + " no es divisible entre 2 ni entre 3 :(");
		}

	}
	
	public static void main(String[] args) {
		LogicalOrAnd obj = new LogicalOrAnd();
		obj.esDivisible5o7(41);
		obj.esDivisible5o7(35);
		obj.esDivisible2o3(22);
		obj.esDivisible2o3(5);
	}

}
