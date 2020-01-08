package createtype.l5prototypepattern;

import java.io.Serializable;

public class Address implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String address;

	public Address(String address){
		this.address = address;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}
