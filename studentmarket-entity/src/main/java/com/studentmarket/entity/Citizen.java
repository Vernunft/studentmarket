package com.studentmarket.entity;

public class Citizen {
	private String telephoneNumber;
	private String citizenName;
	private int state;
	private String password;
	private int integrate;
	private int flag;
	
	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(String telephoneNumber, String citizenName, int state, String password, int integrate, int flag) {
		super();
		this.telephoneNumber = telephoneNumber;
		this.citizenName = citizenName;
		this.state = state;
		this.password = password;
		this.integrate = integrate;
		this.flag = flag;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIntegrate() {
		return integrate;
	}

	public void setIntegrate(int integrate) {
		this.integrate = integrate;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Citizen [telephoneNumber=" + telephoneNumber + ", citizenName=" + citizenName + ", state=" + state
				+ ", password=" + password + ", integrate=" + integrate + ", flag=" + flag + "]";
	}
	
	
	
}
