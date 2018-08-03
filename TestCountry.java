// Test class for country calculating largest area, population and density
package miscellaneous;

import java.util.Scanner;

public class TestCountry {

	public static void main(String[] args) {

		Country[] country = new Country[3];
		for (int i = 0; i < 3; i++) {
			country[i] = new Country();
		}

		String countryName[] = new String[3];
		int population[] = new int[3];
		double density[] = new double[3];
		double area[] = new double[3];

		int largePopulation = 0;
		double largeDensity = 0;
		double largeArea = 0;

		int i = 0, areaCounter = 0, popCounter = 0, denCounter = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter name,population and area(in miles) of 3 countries");
		for (i = 0; i < 3; i++) {
			countryName[i] = scanner.next();
			population[i] = scanner.nextInt();
			area[i] = scanner.nextDouble();

			country[i].setCountryName(countryName[i]);
			country[i].setPopulation(population[i]);
			country[i].setArea(area[i]);
			country[i].density(population[i], area[i]);
		}

		for (i = 0; i < 3; i++) {
			if (largePopulation < country[i].getPopulation()) {
				largePopulation = country[i].getPopulation();
				popCounter++;

			}
			if (largeArea < country[i].getArea()) {
				largeArea = country[i].getArea();
				areaCounter++;

			}
			if (largeDensity < country[i].getDensity()) {
				largeDensity = country[i].getDensity();
				denCounter++;

			}
		}

		System.out.println("The country with largest population is " + country[popCounter - 1].getCountryName()
				+ " with population " + country[popCounter - 1].getPopulation());
		System.out.println("The country with largest area is " + country[areaCounter - 1].getCountryName()
				+ " with area " + country[areaCounter - 1].getArea());
		System.out.println("The country with largest density is " + country[denCounter - 1].getCountryName()
				+ " with density " + country[denCounter - 1].density);

	}

}
