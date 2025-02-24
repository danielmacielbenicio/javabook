package javabook;

import java.util.Scanner;

public class celsiustofahrenheit {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double f, c;
		System.out.print("insira o valor em graus Celsius: ");
		c = sc.nextDouble();
		f = (c*9/5+32);
		System.out.printf("O valor convertido de graus Celsius para Fahrenheit é: %.2f %n", f);
		sc.close();
	}
}