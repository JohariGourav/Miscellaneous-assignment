//country class calculating density
package miscellaneous;

public class Country {

	String countryName;
	int population;
	double density;
	double area;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getPopulation() {
		return population;
	}

	public double getDensity() {
		return density;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double density(int population, double area) {

		density = population / area;
		return density;
	}

}
