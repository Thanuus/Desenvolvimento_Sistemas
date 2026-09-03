package exercicio;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.println("Informe um numero inteiro: ");
		int numero = scanner.nextInt();
		
		if (numero > 20) {
			System.out.println(numero + " é maior que 20");
		} else {
			System.out.println(numero + " é igual ou menor que 20");
		}
	}

}
