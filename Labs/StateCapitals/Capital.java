public class Capital {

	private String name;
	private int population;
	private double squareMileage;

    public Capital(String name, int population, double squareMileage) { 
		this.name = name;
		this.population = population;
		this.squareMileage = squareMileage;
    }

	public void setName(String name) {
    	this.name = name;
	}

	public String getName() {    
		return name;
	}

	public void setPopulation(int population) {
    	this.population = population;
	}

	public int getPopulation() {    
		return population;
	}

	public void setSquareMileage(Double squareMileage) {
    	this.squareMileage = squareMileage;
	}

	public double getSquareMileage() {    
		return squareMileage;
	}


}
