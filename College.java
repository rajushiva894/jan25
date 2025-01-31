
public class College {
	private String Collegename;
	private String Address;
	private int PhNo;
	private String course;
	public College(String collegename, String address, int phNo, String course) {
		super();
		Collegename = collegename;
		Address = address;
		PhNo = phNo;
		this.course = course;
	}
	@Override
	public String toString() {
		return "College [Collegename=" + Collegename + ", Address=" + Address + ", PhNo=" + PhNo + ", course=" + course
				+ "]";
	}
	public String getCollegename() {
		return Collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getPhNo() {
		return PhNo;
	}
	public void setPhNo(int phNo) {
		PhNo = phNo;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

}
