package createtype.l5prototypepattern;

import java.io.Serializable;

public class Customer implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Customer clone(){
		try {
			return (Customer) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("不支持复制");
		}
		return null;
	}
}
