package Test;

public class Worker {
	private int id;
	private String name;
	private String depart;
	private String address;
	private String bDate;
	
	private Worker() {} 
	
	public Worker(int id, String name, String depart, String address, String bDate) {
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.address = address;
		this.bDate = bDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getbDate() {
		return bDate;
	}

	public void setbDate(String bDate) {
		this.bDate = bDate;
	}
	
}
