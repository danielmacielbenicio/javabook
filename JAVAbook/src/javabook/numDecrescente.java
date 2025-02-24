package javabook;

import java.util.Scanner;

public class numDecrescente {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double num1, num2, num3;
		System.out.println("Escreva o primeiro número: ");
		num1 = sc.nextDouble();
		System.out.println("Escreva o segundo número: ");
		num2 = sc.nextDouble();
		System.out.println("Escreva o terceiro número: ");
		num3 = sc.nextDouble();
		
		if (num1>num2 && num2>num3) {
			System.out.println(num1 + ", " + num2 + ", " + num3);
		}
		else if (num1 > num3 && num3>num2 ) {
			
			System.out.println(num1+", "+num3+", " + num2);
		}
		else if (num2 > num1 && num1>num3 ) {
			
			System.out.println(num2+", "+num1+", " + num3);
		}
		else if (num2 > num3 && num3>num1 ) {
			
			System.out.println(num2+", "+num3+", " + num1);
		}
		else if (num3 > num1 && num1>num2 ) {
			
			System.out.println(num3+", "+num1+", " + num2);
		}
		else {
			
			System.out.println(num3+", "+num2+", " + num1);
		}
		sc.close();
	}
}
