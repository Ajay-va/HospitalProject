package com.app.demo;

public class Order {

	
	private int oid;
	private String oname;
	private String pincode;
	private String pname;
	public Order(int oid, String oname, String pincode, String pname) {
		super();
		this.oid = oid;
		this.oname = oname;
		this.pincode = pincode;
		this.pname = pname;
	}
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public String getOname() {
		return oname;
	}
	public void setOname(String oname) {
		this.oname = oname;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", oname=" + oname + ", pincode=" + pincode + ", pname=" + pname + "]";
	}
	
	
	
	
}
