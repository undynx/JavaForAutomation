package basics;

public class OutsideMethods {
	
	//se puede llamar a un metodo que este en otra clase dentro del mismo package
	//creando un main desde la clase en la que se lo quiere llamar
	//creando un objeto con la clase en la que se encuentra el emthod
	//y ejecutandolo desde alli
	
	public static void main(String[] args) {
		Methods obj = new Methods();
		obj.fromOutside();
	}
	
	//para llamar un metodo que este en otro package
	//se debe importar

}
