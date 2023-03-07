package Ejercicio2;

public class CodificadorDecodificador {
	public static String codificar(String frase, int desplazamiento) {
		String Codificado= new String();
		
		for ( int i=0; i<frase.length(); i++) {
			Codificado += (char) (frase.charAt(i) + desplazamiento);
		}
		return Codificado;
	}
	public static String decodificar(String frase, int desplazamiento) {
		String Decodificado= new String();
		for (int i=0; i<frase.length();i++) {
			Decodificado += (char) (frase.charAt(i) - desplazamiento);
		}
		return Decodificado;
	}
}
