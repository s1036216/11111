package com.hanbit.controller;
import java.util.Scanner;
import com.hanbit.oop.sevice.MemberService;
public class Membercontrol {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		MemberService memberService=new MemberService();
		while (true) {
				System.out.println("0.end,  1.join  2.login 3.");
			switch (s.next()) {
			case	"0":
					 System.out.println("시스템종료");
				return;
			case	"1":
				System.out.println("이름?");
				String name=s.next();
				System.out.println("ID?");
				String id=s.next();
				System.out.println("비밀번호?");
				String pass=s.next();
				System.out.println("주민번호?");
				String ssn=s.next();
				memberService.setId(id);
				memberService.setName(name);
				memberService.setPass(pass);
				memberService.setSsn(ssn);
				memberService.setAge();
				memberService.setGender();
											
				break;
			case	"2":
				System.out.println("ID");
				String id111=s.next();
				System.out.println("비번");
		        System.out.println("gender: "+memberService.getGender());
		        System.out.println("age: "+memberService.getAge());
				String pass111=s.next();
				memberService.setLogin(id111,pass111);
				
				System.out.println(memberService.getLogin());
				break;
			}
		}
	}
}
