package javabook;

import java.util.Scanner;

public class fahrenheittocelsius {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double c, f;
		System.out.print("insira o valor em Fahrenheit: ");
		f = sc.nextDouble();
		c = (((f-32)*5)/9);
		System.out.printf("O valor convertido de graus Fahrenheit para Celsius é: %.2f %n", c);
		sc.close();
	}
}