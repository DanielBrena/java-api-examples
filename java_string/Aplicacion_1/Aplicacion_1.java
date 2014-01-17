public class Aplicacion_1
{
	public static void main(String[] args) {
		/**
			Un String es una secuencia de caracteres
		*/

		//Crear un String
		String mi_string = "Hola soy un String";
		System.out.println(mi_string);	

		//Crear un String por medio de un arreglo de caracteres
		char[] arreglo_char = {'h','o','l','a'};
		String hola_string = new String(arreglo_char);
		System.out.println(hola_string);

		
	}
}