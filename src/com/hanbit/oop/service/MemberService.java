package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface MemberService {
	public  String getGender(MemberBean member);  //abstract 메서드 추상메서드 머머할지 기능만
	public  String getAge(MemberBean member);
	public  String join(MemberBean member);
	public  String Login(MemberBean member);
}
