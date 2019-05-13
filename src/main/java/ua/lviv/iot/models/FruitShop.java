package ua.lviv.iot.models;

public abstract class FruitShop {
	private String name;
	private Color color;
	private double price;
	private boolean availability;
	private Vitamin vitamin;
	private double weight;
	
	public FruitShop() {
	}
	
	public FruitShop(String name, Color color, double price, boolean availability, Vitamin vitamin, double weight) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.availability = availability;
		this.vitamin = vitamin;
		this.weight = weight;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public Vitamin getVitamin() {
		return vitamin;
	}

	public void setVitamin(Vitamin vitamin) {
		this.vitamin = vitamin;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getHeaders() {
		return  "name" + ", " +
				"color" + ", " +
				"price" + ", " +
				"availability" + ", " +
				"vitamin" + ", " +
				"weight";
	}
	
	public String toCSV() {
		return  this.name +","+
		this.color+","+
		this.price+","+
		this.availability+","+
		this.vitamin+","+
		this.weight;
	}
}
