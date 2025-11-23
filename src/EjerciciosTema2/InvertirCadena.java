package EjerciciosTema2;

public class InvertirCadena {
	
	public static String invertir (String cadena) {
		
		if (cadena.length() == 0 || cadena.length() ==1) {
			return cadena;
		}
		
		String posicion1 = cadena.substring(0,1);
		String posicionResto = cadena.substring(1);
		return invertir(posicionResto) + posicion1;
		
		
	}

	public static void main(String[] args) {
		String string = "Tengo hambre";
		System.out.println("Original: " + string + " -> Invertido: " + invertir(string));

	}

}
