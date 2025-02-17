package celsiusfahrenheit;

import java.util.Scanner;

public class litroscombustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double tempo, velocidade, distancia, litros_usados, velocidade_media;
		System.out.print("Digite a velocidade: ");
		velocidade = sc.nextDouble();
		System.out.print("Digite o tempo: ");
		tempo = sc.nextDouble();
		distancia = (tempo*velocidade);
		litros_usados = (distancia/12);
		velocidade_media = (distancia/tempo);
		System.out.println("A quantidade de litros gasta em uma viagem é de: " + litros_usados);
		System.out.println("A velocidade média foi de: " + velocidade_media);
		System.out.println("A distância percorrida foi de: " + distancia);
	}

}
