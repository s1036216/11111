package com.hanbit.oop.sevice;

public class GradeService {

	private int kor, eng, math, total, avg;
	private String grade, re,name,major;

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}

	public void setTotal() {
		this.total = kor + eng + math;
	}

	public int getTotal() {
		return total;
	}

	public void setAvg() {
		this.avg = total / 3;
	}

	public void setGrade() {
		setTotal();  //setgrade안에들어옴댐
		setAvg();    //
		switch (avg / 10) {
		case 10:
		case 9:
			this.grade = "A";
			this.re = "장학금 대상입니다";
			break;
		case 8:
			this.grade = "B";
			this.re = "3학점 이수";
			break;
		case 7:
			this.grade = "C";
			this.re = "2학점 이수";
			break;
		case 6:
			this.grade = "D";
			this.re = "재수강";
			break;
		case 5:
			this.grade = "e";
			this.re = "학사경고";
			break;
		default:
			this.grade = "f";
			this.re = "학사경고";
			break;
		}

	}

	public String getGrade() {
		return grade + re;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getmajor() {
		return this.major;
	}
	
	public String toString(){ //결과만
	return"===================\n"+
		  "이름 전공   학점 평가   \n"+
		  name+"\t"+
	      
}
	}