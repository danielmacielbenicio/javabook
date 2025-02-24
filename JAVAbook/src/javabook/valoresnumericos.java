package javabook;

import java.util.Scanner;

public class valoresnumericos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, d;
		System.out.println("Digite os valores a serem combinados: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		//COMBINAÇÃO DO A
		System.out.println("A adição entre A e B é igual à: " + (a+b));
		System.out.println("A multiplicação entre A e B é igual à: " + a*b);
		System.out.println("A adição entre A e C é igual à: " + (a+c));
		System.out.println("A multiplicação entre A e C é igual à: " + a*c);
		System.out.println("A adição entre A e D é igual à: " + (a+d));
		System.out.println("A multiplicação entre A e D é igual à: " + a*d);
		//COMBINAÇÃO DO B
		System.out.println("A adição entre B e C é igual à: " + (b+c));
		System.out.println("A multiplicação entre B e C é igual à: " + b*c);
		System.out.println("A adição entre B e D é igual à: " + (b+d));
		System.out.println("A multiplicação entre B e D é igual à: " + b*d);
		//COMBINAÇÃO DO C
		System.out.println("A adição entre C e D é igual à: " + (c+d));
		System.out.println("A multiplicação entre C e D é igual à: " + c*d);
		sc.close();
	}

}
