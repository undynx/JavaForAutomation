package exercises_ConditionHandling;

public class Ex4LargestAndLowest {
	
	private void LargestAndLowest(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println("Entre " + a +  ", " + b +  " y " + c + " => " + a + " es el mayor");
		} else if (b>c && b>a) {
			System.out.println("Entre " + a +  ", " + b +  " y " + c + " => " + b + " es el mayor");
		} else {
			System.out.println("Entre " + a +  ", " + b +  " y " + c + " => " + c + " es el mayor");
		}
		
		if(a<b && a<c) {
			System.out.println("Entre " + a +  ", " + b +  " y " + c + " => " + a + " es el menor");
		} else if (b<c && b<a) {
			System.out.println("Entre " + a +  ", " + b +  " y " + c + " => " + b + " es el menor");
		} else {
			System.out.println("Entre " + a +  ", " + b +  " y " + c + " => " + c + " es el menor");
		}

	}
	
	public static void main(String[] args) {
		
		Ex4LargestAndLowest obj = new Ex4LargestAndLowest();
		obj.LargestAndLowest(2, 5, 2);
	}

}
