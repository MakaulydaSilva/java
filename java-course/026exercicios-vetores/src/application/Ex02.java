package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}

		double soma = 0.0;

		for (int i = 0; i < vect.length; i++) {
			soma = soma + vect[i];
		}

		double media = soma / n;

		System.out.print("Valores = ");

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}

		System.out.println();
		System.out.printf("Soma = %.2f", soma);
		System.out.println();
		System.out.printf("Media = %.2f", media);

		sc.close();

	}

}
