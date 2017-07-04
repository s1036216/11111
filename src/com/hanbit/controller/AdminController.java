package com.hanbit.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;


public class AdminController {
	public static void main(String[] args) {
		String sCount = (JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요"));
		int count = Integer.parseInt(sCount);
		AdminService service = new AdminServiceImpl(count);
		MemberBean bean = null;
		String sList = "";
		int i = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료 1.회원추가2.회원수 3.회원목록4.findBYId 5.findByName 6.체인지패스워드")) {
			case "0":
				return;
			case "1":
				bean = new MemberBean();
				String[] arr = JOptionPane.showInputDialog("NAME/ID/PASS/SSN").split("/");
				bean.setName(arr[0]);
				bean.setId(arr[1]);
				bean.setpass(arr[2]);
				bean.setSsn(arr[3]);

				service.addMember(bean);
				JOptionPane.showMessageDialog(null, "회원 가입 성공");
				break;

			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;

			case "3":
				MemberBean[] list = service.getMembers();
				JOptionPane.showMessageDialog(null, "1번쨰" + list[0]);
				JOptionPane.showMessageDialog(null, "2번쨰" + list[1]);
				JOptionPane.showMessageDialog(null, "3번쨰" + list[2]);
				for (i = 0; i < list.length; i++) {
					sList += list[i].toString() + "\n";
				}
				JOptionPane.showMessageDialog(null, "리스트" + sList);
				break;

			case "4":
				// bean=new MemberBean();
				JOptionPane.showMessageDialog(null,
						service.findById(JOptionPane.showInputDialog(null, "조회하려는 아이디값을 입력")).toString());
				break;
			case "5":
				// bean=new MemberBean();
				String searchName = JOptionPane.showInputDialog("찾으실 이름으로 검색하여 주세요");
				MemberBean[] members = service.findByName(searchName);
				String result = "";
				if (members.length == 0) {
					result = "조회된 검색 결과가 없습니다.";
				} else {
					for (i = 0; i < members.length; i++) {
						result += members[i].toString() + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, result);
				/*
				 * JOptionPane.showMessageDialog(null,
				 * service.findByName(JOptionPane.showInputDialog("찾으실 이름으로 검색하여
				 * 주세요")));
				 */
				break;
			case "6":

				String updateId = JOptionPane.showInputDialog(null, "변경할 아이디를 입력");
				bean.setId(updateId);
				String newpass = JOptionPane.showInputDialog(null, "변경할 패스워드입력");
				JOptionPane.showMessageDialog(null, "변경되었습니다");
				bean.setpass(newpass);
				service.updatePass(bean);
				
				
				result = bean.toString();
				System.out.println(result);
				break;

			}
		}
	}
}
