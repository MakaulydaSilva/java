package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char iC = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();

			if (iC == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpends = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpends));

			} else if (iC == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployee));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID: ");

		for (TaxPayer taxPayer : list) {
			System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
		}

		double sum = 0.0;

		for (TaxPayer taxPayer : list) {
			sum += taxPayer.tax();
		}

		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);

		sc.close();

	}

}
