package celsiusfahrenheit;

import java.util.Scanner;

public class latadeoleo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double volume, altura, raio;
		
		System.out.print("Digite a altura do lata");
		altura = sc.nextDouble();
		System.out.print("Digite o raio da lata");
		raio = sc.nextDouble();
		volume = (3.14159 *(raio*raio)*altura);
		System.out.print("O resultado do volume da lata é: " + volume);
		sc.close();
	}
}
