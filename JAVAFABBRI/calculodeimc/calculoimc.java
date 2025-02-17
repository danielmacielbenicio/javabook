package calculodeimc;

import java.util.Scanner;

public class calculoimc {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		double peso, altura, total;
		System.out.print("Bom dia, vamos calcular o seu IMC? Comece digitando o seu nome(opcional):");
		nome = sc.nextLine();
		System.out.println("Digite a altura de " + nome);
		altura = sc.nextDouble();
		System.out.println("Digite o peso de " + nome);
		peso = sc.nextDouble();
		total = (peso/(altura*altura));
		
		System.out.printf("O resultado do IMC é igual á: %.2f %n", total);
		
		System.out.print("Abaixo do peso");
		if (total>=18.5 && total<= 24.9 );
		System.out.print("Peso normal");
		if (total>=25 && total<=29.9);
		System.out.print("Sobrepeso");
		if (total>=30 && total<=34.9);
		System.out.print("Obesidade Grau I");
		if (total>=35 && total<=39.9);
		System.out.print("Obesidade Grau II");
		if (total>=40 && total<=49.9);
		System.out.print("Obesidade Grau III");
		if (total>=50 && total<=59.9);
		System.out.print("Obesidade Grau IV");
		if (total>=60)
		System.out.print("Obesidade Grau V");
	}
}
