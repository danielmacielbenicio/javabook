package javabook;

import java.util.Scanner;

public class anoBissexto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;

		System.out.println("Digite o ano: ");
		ano = sc.nextInt();

		while (ano % 4 != 0) {
			System.out.println("O ano não é bissexto.");
			ano = sc.nextInt();
		}

		System.out.println("O ano é bissexto");
		sc.close();
	}
}
