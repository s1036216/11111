package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface AdminService {

	public void addMember(MemberBean bean);//set
	public MemberBean[] getMembers();        //get
	public int countMembers();               //get

}
