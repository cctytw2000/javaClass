package tw.johnyeh.javaproject.oop.bussinesslogical;

import java.io.Serializable;

public class TestJavaBeanEX01 implements Serializable{

	private static final long serialVersionUID = 1L;
	private String orderNumber = "201907190001";
	private String customer = "john";
	private String address = "Home";
	private String phone = "0987654321";
	

	public String getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public TestJavaBeanEX01() {
		// TODO Auto-generated constructor stub
	}

}
