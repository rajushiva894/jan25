
public class Laptop {
	private String Lapname;
	private String Lapmodel;
	private int storage;
	private int processor;
	private int Ram;
	public Laptop(String lapname, String lapmodel, int storage, int processor, int ram) {
		super();
		Lapname = lapname;
		Lapmodel = lapmodel;
		this.storage = storage;
		this.processor = processor;
		Ram = ram;
	}
	public String getLapname() {
		return Lapname;
	}
	public void setLapname(String lapname) {
		Lapname = lapname;
	}
	public String getLapmodel() {
		return Lapmodel;
	}
	public void setLapmodel(String lapmodel) {
		Lapmodel = lapmodel;
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public int getProcessor() {
		return processor;
	}
	public void setProcessor(int processor) {
		this.processor = processor;
	}
	public int getRam() {
		return Ram;
	}
	@Override
	public String toString() {
		return "Laptop [Lapname=" + Lapname + ", Lapmodel=" + Lapmodel + ", storage=" + storage + ", processor="
				+ processor + ", Ram=" + Ram + "]";
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	
	


		    



}
