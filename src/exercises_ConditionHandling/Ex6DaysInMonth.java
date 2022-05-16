package exercises_ConditionHandling;

public class Ex6DaysInMonth {
	
	private void checkNumberOfDays(int monthNumber) {
		
		if (monthNumber > 12 || monthNumber <= 0) {
			System.out.println("Ingresaste " + monthNumber + ", eso no es un mes válido.");
		} else if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12) {
			System.out.println("El mes " + monthNumber + " tiene 31 días :D");
		} else if (monthNumber == 2) {
			System.out.println("El mes " + monthNumber + " tiene 28 o 29 días :o");
		} else {
			System.out.println("El mes " + monthNumber + " tiene 30 días ;)");
		}

	}
	 
	public static void main(String[] args) {
		
		Ex6DaysInMonth obj = new Ex6DaysInMonth();
		obj.checkNumberOfDays(1);
		obj.checkNumberOfDays(2);
		obj.checkNumberOfDays(3);
		obj.checkNumberOfDays(4);
		obj.checkNumberOfDays(5);
		obj.checkNumberOfDays(6);
		obj.checkNumberOfDays(7);
		obj.checkNumberOfDays(8);
		obj.checkNumberOfDays(9);
		obj.checkNumberOfDays(10);
		obj.checkNumberOfDays(11);
		obj.checkNumberOfDays(12);
		obj.checkNumberOfDays(0);
	}

}
