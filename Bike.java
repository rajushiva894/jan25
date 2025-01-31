
public class Bike {
	private String Bname;
	private String company;
	private String Bmodel;
	private int Bprice;
	public Bike(String bname, String company, String bmodel, int bprice) {
		super();
		Bname = bname;
		this.company = company;
		Bmodel = bmodel;
		Bprice = bprice;
	}
	public String getBname() {
		return Bname;
	}
	public void setBname(String bname) {
		Bname = bname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBmodel() {
		return Bmodel;
	}
	public void setBmodel(String bmodel) {
		Bmodel = bmodel;
	}
	public int getBprice() {
		return Bprice;
	}
	public void setBprice(int bprice) {
		Bprice = bprice;
	}
	@Override
	public String toString() {
		return "Bike [Bname=" + Bname + ", company=" + company + ", Bmodel=" + Bmodel + ", Bprice=" + Bprice + "]";
	}
	

}
