package com.Alex.Server.Pojo;

/**
 * User
 * @author Alexmono
 *
 */
public class User {
	private String uId;
	private String userName;
	private String accountNumber;
	private String passWord;
	private Integer age;
	private Integer sex;
	private String Email;

	/**
	 * User 构造方法
	 * @param uId
	 * @param userName
	 * @param accountNumber
	 * @param passWord
	 * @param age
	 * @param sex
	 */
	public User(String uId, String userName, String accountNumber, String passWord, Integer age, Integer sex, String Email) {
		this.uId = uId;
		this.userName = userName;
		this.accountNumber = accountNumber;
		this.passWord = passWord;
		this.age = age;
		this.sex = sex;
		this.Email = Email;

	}
	
	/*
	 * UserDao's get and set way
	 */
	public String getuId() {
		return uId;
	}

	public void setuId(String uId) {
		this.uId = uId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

}
