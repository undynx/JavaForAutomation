package stringHandling;

public class stringHandling1 {
	
	/* los strings en java son una clase predefinida 
	 * y pueden utilizarse de las siguientes maneras: */
	String string1 = new String("Nuevo String");
	String string2 = "Otro string";
	
	////////////////////////////////////////////////////////////
	
	// LENGTH permite saber el largo de un string //
	private void stingLength() {
		int i = string2.length();
		System.out.println("El string es: " + string2);
		System.out.println("Y su largo es: " + i);
	}
	
	////////////////////////////////////////////////////////////
	
	//TRIM es una función que elimina los espacios 
	//antes y despues de un string
	private void stringTrim() {
		String stringConEspacios = "    este es mi string     ";
		int lengthInicial = stringConEspacios.length();
		//notar que se pueden concatenar metodos
		int lengthFinal = stringConEspacios.trim().length();
		System.out.println("El string es: " + stringConEspacios);
		System.out.println("Su largo es: " + lengthInicial);
		System.out.println("Su largo sin espacios es: " + lengthFinal);

	}
	
	////////////////////////////////////////////////////////////
	
	//TOUPPERCASE y TOLOWERCASE cambian todo el string a 
	//mayusculas o minusculas
	private void stringMayusMinus() {
		String stringRaro = "hOlAA cOoOmOO EsTTass";
		String stringUpper = stringRaro.toUpperCase();
		String stringLower = stringRaro.toLowerCase();
		System.out.println("El string es: " + stringRaro);
		System.out.println("En mayusculas: " + stringUpper);
		System.out.println("En minusculas: " + stringLower);
	}
	
	////////////////////////////////////////////////////////////
	
	//CHARAT devuelve el string que está en cierta posición
	private void stringCharAt() {
		String stringCharAt = "Este es un string";
		System.out.println("En la posicion 3 está el char: " + stringCharAt.charAt(3));

	}
	
	////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		stringHandling1 obj = new stringHandling1();
		obj.stingLength();
		obj.stringTrim();
		obj.stringMayusMinus();
		obj.stringCharAt();
	}
	
}
