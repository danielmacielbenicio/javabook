package javabook;

import java.util.Scanner;

public class notaAluno {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	double nota;
	
	System.out.println("Digite sua nota: ");
	nota = sc.nextDouble();
	
	if  (nota >= 7) {
	System.out.println("Aprovado");
	}
	else {
		System.out.println("Reprovado");
		sc.close();
		}
	}
}
