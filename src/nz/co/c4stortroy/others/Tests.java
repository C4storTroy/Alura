package nz.co.c4stortroy.others;

public class Tests {
	public static void main(String[] args) {
		//		inverte("teste inversao");
//		invertePalavrasDaFrase("inverte as palavras da frase");
		String number = "762";
        System.out.println("Imprimindo a string: " + number);

        int res = convertIntoNumber(number);
        System.out.println("Imprimindo o int: " + res);
	}

	public static void imprimeLetraPorLetra(String texto) {
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
	}

	public static void inverte(String texto) {
		for (int i = texto.length() - 1; i >= 0; i--) {
			System.out.print(texto.charAt(i));
		}
		System.out.println("");
	}

	public static void invertePalavrasDaFrase(String texto) {
		String[] palavras = texto.split(" ");
		for (int i = palavras.length - 1; i >= 0; i--) {
			System.out.print(palavras[i] + " ");
		}
		System.out.println("");
	}
	public static void inverteComStringBuilder(String texto) {
		System.out.print("\t");
		StringBuilder invertido = new StringBuilder(texto).reverse();
		System.out.println(invertido);
	}
	private static int convertIntoNumber(String number) {
        int resultado = 0;
        while (number.length() > 0) {
            char algarismo = number.charAt(0);
            resultado = resultado * 10 + (algarismo - '0');
            number = number.substring(1);
        }
        return resultado;
    }
	
}
