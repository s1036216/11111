package com.hanbit.oop.domain;

public class MemberBean {
	private String ssn, id, pass, name ;

		
	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setpass(String pass) {
		this.pass = pass;
	}

	public String getpass() {
		return pass;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getSsn() {

		return ssn;
	}
	public String toString() {
		return "";
		//return "환영합니다" + name + "\t" + gender + "\t" + age;
	}
}
