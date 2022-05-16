package exercises_ConditionHandling;

public class Ex5DivisibleNumber {
	
	private void isDivisible(int a) {
		
		//este ejercicio está correcto pero también
		//podría haber hecho el divisible entre 5 y 11 usando
		//if(a % 5 ==0 && a % 11==0)
		
		if (a%5 == 0) {
			
			if(a%11 == 0) {
				System.out.println(a + " es divisible entre 5 y 11");
			} else {
				System.out.println(a + " es divisible entre 5");
			}
			
		} else if (a%11 == 0) {
			System.out.println(a + " es divisible entre 11");
		} else {
			System.out.println(a + " no es divisible ni entre 11 ni entre 5");
		}
	}
	
	public static void main(String[] args) {
		
		Ex5DivisibleNumber obj = new Ex5DivisibleNumber();
		obj.isDivisible(7);
		obj.isDivisible(5);
		obj.isDivisible(11);
		obj.isDivisible(55);
	}

}
