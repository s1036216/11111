package com.hanbit.oop.inheritance;

public class Kaka extends Iphone {

	private String date1;
	
	public void setDate1(String date1){
		this.date1=date1;
	}
	
	public String getDate1(){
		return date1;
	}
	@Override
	public String toString(){
			
		//아이폰은 스마트폰이기때문에 이동가능한 상태로 홍길동에게 010번호로 
	//아이폰을 사용해서 문자를 전송했다	
		return String.format("%s은 %s이기때문에 %s해서 %s에게 %s 번호로 %s 을 사용해서 %s 전송했다%s "
				,BRAND,KIND,move,name,phoneNo,BRAND,date,date1);
		
		 
	}
	
	
}
