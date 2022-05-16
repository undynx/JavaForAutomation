package looping;

public class LoopNesting {
	
	private void Nesting() {
		
		/* al anidar loops, primero se ingresa al loop externo
		 * se ingresa al loop interno y se completa y 
		 * se vuelve al loop externo, se commpleta
		 * se vuelve a ingresar al loop externo (mientras se siga cumpliendo la condicion)
		 * se vuelve a ingresar al loop interno, se completa
		 * y así hasta que se complete la condición */
		
		for(int i=1 ; i <= 3 ; i++) {
			
			System.out.println("Comienza for externo");
			
			for (int j=1 ; j <= 2 ; j++) {
				System.out.println(i);
			}
			
			System.out.println("For externo completado");
		}

	}
	
	public static void main(String[] args) {
		
		LoopNesting obj = new LoopNesting();
		obj.Nesting();
	}

}
