package com.hanbit.oop.inheritance;

public class AndroidPhone extends Iphone{
		//브랜드는 겔럭시노트  
		//DATE를 오버라이딩 해서 카톡메세지라고 출력
	public final static String BRAND="겔러시노트";
	private String size,app1;
	
	public void setSize(String size){
		this.size=size;
	setPortable(true);
	}
	public String getSize(){
		return size;
	}
	public void setApp(String app1){
		this.app1=app1;
		
	}
	public String getApp(){
		return app1;
	}
	
	
	
	@Override
	public String toString(){
		//스마트폰이기때문에 이동가능한 상태로 홍길동에게 010번호로 
	//겔리시토느 6인치를 사용해서 안녕이라고 카톡을 전송햇다
		return String.format(" %s이기때문에 %s해서 %s에게 %s 번호로 %s 을 사용해서 %s 인치를 사용해서 %s 이라고 %s 으로전송했다 "
				,KIND,move,name,phoneNo,BRAND,size,date,app1);
		
		 
	}
	
}
