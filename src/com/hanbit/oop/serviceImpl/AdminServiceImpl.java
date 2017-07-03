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
		member[i]=bean;//i번째 방에 값읋넣은후에  
		i++;		// 생성자에서 방을 이미 만들어주고 배열로 가지고 와서 , i번째 가지고 와서  

		
			
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
