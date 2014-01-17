public class Aplicacion_5
{
	public static void main(String[] args) {
		/**
			Metodos de Character
			isWhitespace()
		*/

		//Falso
		System.out.println(Character.isWhitespace('1'));

		//Verdadero
		System.out.println(Character.isWhitespace(' '));

		//Verdadero
		System.out.println(Character.isWhitespace('\n'));

		//Falso
		System.out.println(Character.isWhitespace('a'));	
	}
}