package javabook;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.println("Digite o número: ");
		num = sc.nextDouble();
		if (num>=1) {
			System.out.println("Seu número é positivo");
		}
		else if (num<=-1) {
			System.out.println("Seu número é negativo");
		}
		
		else {
			System.out.println("Seu número é igual a zero");
		}
		sc.close();
	}

}
