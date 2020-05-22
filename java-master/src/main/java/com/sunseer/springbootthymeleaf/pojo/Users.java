package com.sunseer.springbootthymeleaf.pojo;

public class Users {

	private String id;
	private String name;
	private int age;
	private String department;
	private String sex;
	private String address;
	private String mail;
	private String finaleducation;
	private String skill;
//	private String tel;

public Users(String id, String name, int age,String sex,
		String departmnent,String address,String mail,String finaleducation,String skill,String tel) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.department=department;
		this.sex=sex;
		this.address=address;
		this.mail=mail;
		this.finaleducation=finaleducation;
		this.skill=skill;
//		this.tel=tel;
	}


	public Users() {

	}
//id get,set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//name get,set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//age get,set
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//department set/get
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

//sex get,set
	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}

//address get,set
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

//mail get,set
	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}

//final_education get,set
	public String getFinaleducation() {
		return finaleducation;
	}


	public void setFinal_education(String finaleducation) {
		this.finaleducation = finaleducation;
	}

//skill get,set
	public String getSkill() {
		return skill;
	}


	public void setSkill(String skill) {
		this.skill = skill;
	}

//tel get,set
	/*
	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
*/





}
