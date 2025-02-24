package javabook;

import java.util.Scanner;

public class printNum {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2;
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextDouble();
		
		if (num1>num2) {
			System.out.printf("O maior número é: %.2f %n ", num1);
		}
		else {
			System.out.printf("O maior número é: %.2f %n ", num2);
		}
		sc.close();
	}
}
