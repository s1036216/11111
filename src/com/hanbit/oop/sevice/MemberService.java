package com.hanbit.oop.sevice;

public class MemberService {
	private String id , gender ;
	private int pass ,ssn;
	
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return this.gender;
	}
	public void setPass(int pass){
		this.pass=pass;
	}
	public int getpass(){
		return this.pass;
	}
	public void setSsn(int ssn){
		this.ssn=ssn;
	}
	public int getSsn(){
		return this.ssn;
	}
}
