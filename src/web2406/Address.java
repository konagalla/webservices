package web2406;

public class Address {
	private int aid;
	private String aname;
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", aname=" + aname + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public Address() {
	}
	
	

}
