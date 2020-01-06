package abstractioncase2;


public abstract class Planet {
	protected String planetName;
	public Planet(String planetName2) {
		// TODO Auto-generated constructor stub
		super();
		this.planetName = planetName;
	}
	public String getPlanetName() {
		return planetName;
	}
	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}
	
}

