package com.hanbit.oop.inheritance;

public class CellPhone extends Phone{
	protected boolean portable;
	protected String move;
	public final static String KIND="휴대폰";
	
	public void setMove(String move){
		this.move=move;
	}
	
	public String getMove(){
		return move;
	}
	
	
	public void setPortable(boolean portable){
		if(portable){
		this.setMove("이동가능");
		}else{
			this.setMove("이동불가능");
			}
		this.portable=portable;
	}
	public boolean getPortable(){
		return portable;
	}
	@Override
	public String toString(){
		return String.format("%s이기때문에 %s 상태로 %s에게 %s번호로 /%s /%s 를 사용해서 /%s 이라고 "
				+ "통화했다",KIND,move,super.name,super.phoneNo,super.brand,KIND,super.call);
		
		 
	}
}


