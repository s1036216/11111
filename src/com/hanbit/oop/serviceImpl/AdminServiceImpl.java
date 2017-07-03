package com.hanbit.oop.serviceImpl;

import com.hanbit.controller.Membercontrol;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.sun.swing.internal.plaf.metal.resources.metal;

import sun.security.util.Length;

public class AdminServiceImpl implements AdminService{
	 int count;
	 int i=0;
	
	MemberBean[] member;
//생성자처리가 이문제핵심
	
	
	public AdminServiceImpl(int count) {
		
		member=new MemberBean[count]; //회원수 받은만큼 배열수 방만듬
		
		
		
	}
	@Override
	public void addMember(MemberBean bean) {
		member[i]=bean;
		i++;
			
	}

	@Override
	public MemberBean[] getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countMembers() {
		
		member.toString();
		return i;
	}

	
}
