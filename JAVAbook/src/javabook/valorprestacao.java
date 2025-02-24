package javabook;

import java.util.Scanner;

public class valorprestacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double prestacao, valor, taxa, tempo;
		System.out.print("Digite o valor da pendência / prestação: ");
		valor = sc.nextDouble();
		System.out.print("Digite o valor da taxa: ");
		taxa = sc.nextDouble();
		System.out.print("Digite o tempo: ");
		tempo = sc.nextDouble();
		prestacao = (valor+(valor *(taxa /100)* tempo));
		System.out.println("O valor da prestação com juros é de: " + prestacao);
		prestacao = sc.nextDouble();
		sc.close();
	}
}