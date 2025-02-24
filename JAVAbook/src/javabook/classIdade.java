package javabook;

import java.util.Scanner;

public class classIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;

		// PERGUNTAR A IDADE AO USUÁRIO
		System.out.println("Qual a sua idade? ");
		idade = sc.nextInt();

		// ADICIONAR OS ATRIBUTOS "IF", "ELSE IF", E "ELSE", JUNTO DAS CLASSIFICAÇÕES DE IDADE
		if (idade >= 60) {
			System.out.println("É idoso.");
		} else if (idade >= 18 && idade < 59) {
			System.out.println("É adulto.");
		}

		else {
			System.out.println("É criança.");
		}

		// FECHAR O SCANNER
		sc.close();
	}
}
