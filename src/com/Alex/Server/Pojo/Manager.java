package com.Alex.Server.Pojo;
/**
 * Manager
 * @author Alexmono
 *
 */
public class Manager {
	private String mId;
	private String managerName;
	private String accountNumber;
	private String passWord;
	private Integer age;
	private Integer sex;
	private String phoneNumber;
	private String email;

	/**
	 * Manager 构造方法
	 * @param mId
	 * @param managerName
	 * @param accountNumber
	 * @param passWord
	 * @param age
	 * @param sex
	 * @param staffId
	 */
	public void Manager(String mId, String managerName, String accountNumber, String passWord, Integer age, Integer sex,
			String phoneNumber) {
		this.mId = mId;
		this.managerName = managerName;
		this.accountNumber = accountNumber;
		this.passWord = passWord;
		this.age = age;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
	}

	/*
	 * ManagerDao's get and set way
	 */
	
	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
