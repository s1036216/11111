package com.hanbit.oop.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args){
		String sCount = JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		MemberBean member = null; //선언만
		AdminService service = new AdminServiceImpl(Integer.parseInt(sCount));
		String sList = "";
		
		while(true){
			switch(JOptionPane.showInputDialog("0.Stop, 1.Add  2.Count 3.List 4.FindById 5.findByName 6.Update")){
				case "0":
					JOptionPane.showMessageDialog(null, "Stop");
					return;
				case "1":
					member = new MemberBean(); //초기화
					String[] arr = JOptionPane.showInputDialog("Id/Password/Name/SSN").split("/");
					member.setId(arr[0]);
					member.setPw(arr[1]);
					member.setName(arr[2]);
					member.setSSN(arr[3]);
					
					service.addMember(member);
					JOptionPane.showMessageDialog(null, "회원가입 성공");
					break;
				case "2":
					JOptionPane.showMessageDialog(null, service.countMembers());
					break;
				case "3":
					MemberBean[] list = service.getMembers();
					sList = "";
					
					for(int i=0; i<service.countMembers(); i++){
						 sList += list[i].toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, "리스트\n"+sList);
					break;
				case "4":
					JOptionPane.showMessageDialog(null, "회원정보: "
														+service.findByID(JOptionPane.showInputDialog("Id를 입력하세요")));
					break;
				case "5":
					MemberBean[] res = service.findByName(JOptionPane.showInputDialog("이름 입력하세요"));
					sList = "";
					
					for(int i=0; i<res.length; i++){
						 sList += res[i].toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, "리스트\n"+sList);
					break;
				case "6": 
					MemberBean bean = new MemberBean();
					bean.setId(JOptionPane.showInputDialog("Id를 입력하세요"));
					bean.setPw(JOptionPane.showInputDialog("변경할 비빌번호를 입력하세요"));
					service.upadtePw(bean);
				
					JOptionPane.showMessageDialog(null, "비밀번호 변경 완료");
					break;
			}
		}
	}
}