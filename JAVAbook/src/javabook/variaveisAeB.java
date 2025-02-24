package javabook;

import java.util.Scanner;

public class variaveisAeB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, aux;
		System.out.print("Escreva o valor de A: ");
		a = sc.nextDouble();
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		aux = a;
		a = b;
		b = aux;
		System.out.println("O valor de A: " + a);
		System.out.println("O valor de B: " + b);
		sc.close();
	}
}
