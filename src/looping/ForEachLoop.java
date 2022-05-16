package looping;

public class ForEachLoop {
	
	//for each se utiliza para ejecutar una misma instruccion
	//para todos los valores de un array
	
	private void getDataForEach() {
		
		int miArray[] = {100, 200, 300, 400, 500};
		
		/* al crear un for each, se define una variable 
		 * (en este caso z)
		 * que equivalga al array de datos que se utilizará para iterar
		 * y dentro del for each será esta variable
		 * la que se utilice para llevar las instrucciones */
		
		System.out.println("Array impreso desde un for each loop");
		for (int z : miArray) {
			System.out.println(z);
		}

	}
	
	private void getDataFor() {
		
		/* se puede realizar un loop for each
		 * con un for comun, pero es mas complicado */
		
		int myArray2[] = {110, 220, 330, 440, 550};
		
		System.out.println("Array impreso desde un for loop");
		for(int i = 0 ; i < myArray2.length ; i++) {
			
			System.out.println(myArray2[i]);
		}

	}
	
	public static void main(String[] args) {
		
		ForEachLoop obj = new ForEachLoop();
		
		obj.getDataForEach();
		
		obj.getDataFor();
	}

}
