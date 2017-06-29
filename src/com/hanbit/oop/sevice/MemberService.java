package com.hanbit.oop.sevice;

public class MemberService {
	private String ssn, id, gender, name, login, result, pass111, pass;
	private int age, year;

	public void setAge() {
		int year = Integer.parseInt(ssn.substring(0, 2));
		age = ((17 - year) >= 0) ? 2017 - (year + 2000) + 1 : 2017 - (year + 1900) + 1;
	}

	public int getAge() {
		return age;
	}

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

	public void setGender() {

		switch (ssn.charAt(6)) {
		case '1': {
			gender = "남자입니다";
		}
			break;
		case '2': {
			gender = "여자입니다";
		}
			break;
		case '3': {
			gender = "남자입니다";
		}
			break;
		case '4': {
			gender = "여자입니다";
		}
			break;
		case '5': {
			gender = "외국인입니다";
		}
			break;
		case '6': {
			gender = "외국인입니다";
		}
			break;
		case '7': {
			gender = "잘못입력했습니다";
		}
			break;
		case '8': {
			gender = "잘못입력했습니다";
		}
			break;
		case '9': {
			gender = "잘못입력했습니다";
		}
			break;
		default:
			gender = "잘못입력했습니다";
		}
	}

	public String getGender() {
		return gender;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String resultr() {
		return result;
	}

	public void setPass(String pass) {
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

	public void setPass1(String pass111) {
		this.pass111 = pass111;
	}

	public String getpass1() {
		return this.pass111;
	}

	public void setLogin(String id111, String pass111) {

		result = "";
		if (!id.equals(id111)) {
			result = "plz check your ID and password";
		} else if (!pass.equals(pass111)) {
			result = "wrong pass word";
		} else {
			result = toString();
		}
		System.out.print(result);

	}

	public String getLogin() {
		return this.result;
	}

	public String toString() {
		return "환영합니다" + name + "\t" + gender + "\t" + age;
	}

}
