package oopIntro;

public class Product {

	public Product(int id, String name, double unitprice, double discountrate) {
		super();
		this.id = id;
		this.name = name;
		this.unitprice = unitprice;
		this.discountrate = discountrate;
	}
	public Product() {}
	

	private int id;
	private String name;
	private double unitprice;
//	private double unitpriceafterdiscount;
	private double discountrate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name+"***";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public double getDiscountrate() {
		return discountrate;
	}

	public void setDiscountrate(double discountrate) {
		this.discountrate = discountrate;
	}

	public double getUnitpriceafterdiscount() {
		return this.unitprice*(1-this.discountrate);
	}

}
