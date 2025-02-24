package javabook;

import java.util.Scanner;

public class calcVolume {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double volume, comprimento, largura, altura;
		System.out.print("Digite o valor do comprimento: ");
		comprimento = sc.nextDouble();
		System.out.print("Digite o valor da largura: ");
		largura = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextDouble();
		volume = (comprimento*altura*largura);
		System.out.printf("O volume da caixa é igual à: %.2f %n", volume);
		sc.close();
	}

}
