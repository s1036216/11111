package com.hanbit.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		String sCount=(JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요")) ;
		int count=Integer.parseInt(sCount);
		AdminService service=new AdminServiceImpl(count);
		MemberBean bean=new MemberBean();
		
		int i=0;
		while (i < Integer.parseInt(sCount)+1 ) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원추가2.회원수 3.회원목록")) {
			case "0":
				return;
			case "1":
				
				bean.setName(JOptionPane.showInputDialog("이름"));
				bean.setId(JOptionPane.showInputDialog("아이디"));
				bean.setpass(JOptionPane.showInputDialog("비번"));
				bean.setSsn(JOptionPane.showInputDialog("주민번호"));
				service.addMember(bean);
				JOptionPane.showMessageDialog(null, "회원 가입 성공");
							
				break;
			case "2":
				JOptionPane.showMessageDialog(null,service.countMembers());
				
				
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.getMembers());
				break;
				
			default:
				break;
			}
		}
	}
}
