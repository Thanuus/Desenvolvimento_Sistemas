package exercicio;

public class Resolucao {

	public static void main(String[] args) {
		
		String numero1 = "10";
		String numero2 = "5";
		String preco = "12.50";
		
		System.out.println("Concatenacao de strings: " + numero1 + numero2);
		System.out.println();
		
		int n1 = Integer.parseInt(numero1);
		int n2 = Integer.parseInt(numero2); 
		
		System.out.println("Depois de converter");
		System.out.println("Soma: " + (n1 + n2));
		System.out.println("Subtracao: " + (n1 - n2));
		System.out.println("Multiplicação: " + (n1 * n2));
		System.out.println();
		
		double precoConvertido = Double.parseDouble(preco);
		
		System.out.println("Preço original: " + precoConvertido);
		System.out.println("Preço após aumento: " + (precoConvertido + 5));
	}

}
