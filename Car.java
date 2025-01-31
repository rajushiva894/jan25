
public class Car {
	private String Carname;
	private String company;
	private int Carmodel;
	private int price;
	public Car(String carname, String company, int carmodel, int price) {
		super();
		Carname = carname;
		this.company = company;
		Carmodel = carmodel;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [Carname=" + Carname + ", company=" + company + ", Carmodel=" + Carmodel + ", price=" + price + "]";
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getCarmodel() {
		return Carmodel;
	}
	public void setCarmodel(int carmodel) {
		Carmodel = carmodel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
