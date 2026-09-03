package exercicio;

import java.util.Scanner;

public class Resolucao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = scanner.nextInt();
		
		if (idade < 5) {
			System.out.println("Nenhuma categoria!");
		} else if (idade <= 7) {
			System.out.println("Categoria infantil!");
		} else if( idade <= 10) {
			System.out.println("Categoria juvenil!");
		} else if (idade <= 15) {
			System.out.println("Categoria adolescente!");
		} else if (idade <= 30) {
			System.out.println("Categoria adulto!");
		} else {
			System.out.println("Categoria sênior!");
		}
	}

}
