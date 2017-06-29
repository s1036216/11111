package com.hanbit.controller;
import java.util.Scanner;

import com.hanbit.oop.sevice.calcService;
import com.hanbit.oop.sevice.BMIsevisce;
import com.hanbit.oop.sevice.ClockService;
import com.hanbit.oop.sevice.GradeS;
import com.hanbit.oop.sevice.GradeService;
import com.hanbit.oop.sevice.LeapService;
import com.hanbit.oop.sevice.TaxService;
public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		BMIsevisce s2 = new BMIsevisce();
		TaxService s3 = new TaxService();
		LeapService s4 = new LeapService();
		ClockService s5 = new ClockService();
		GradeS s6 =new GradeS();
		GradeService g= new GradeService();
		
		while (true) {
			System.out.println("0.STOP 1.BMI 2.TAX 3.Leap 4.Clock 5.Grade 6.CalcPlus 7.CalcMinus ");
			switch (s.next()) {
			case "0":
				System.out.println("종료");
				return; //메서드 밖으로빠진다 //값이없이 끝 
 			case "1": 
				   System.out.print("input your height: \n");
			       double he = s.nextDouble() /100;
			       s2.setHeight(he);
			       System.out.print("input your weight: \n");
			       double we = s.nextDouble();
			       s2.setHeight(we);
			       s2.setB();
			       s2.setBmi();
			        System.out.println(s2.getBmi());
			      		      
			       
				break; //스위치 밖으로 빠지고
 			case "2":
 					System.out.print("세금출력프로그램\n");
 					System.out.print("연봉을 적어주세요?");
 					int salary=s.nextInt();
 					System.out.print("이름을 적어주세요?");
 					String name=s.next();
 					double taxRate=s3.execute2(salary);
 					System.out.print("**************************\n");
 					System.out.print("이름|연봉|세율|납부할 세금\n");
 					System.out.print("-----------------------------\n");
 					System.out.print(String.format("%s %d %f %f \n" ,name,salary,taxRate,(salary*taxRate)));
 					//System.out.print(b+" | "+a+"만원 |"+tax+" | "+c+"만원\n");
 					System.out.print("**************************\n");
 				break;
			case "3":
					System.out.print("년도를 입력하세요.\n");
					int year=s.nextInt();
					String lepresult=s4.execute3(year);
							
					
			case "4":
					System.out.print("초를 입력하시오?.\n");
					int time=s.nextInt();
					String clock=s5.execute4(time);
					System.out.print(clock+"\n");
			
			case "5":
				System.out.print("이름?\n");
				String name1=s.next();
				System.out.print("국어점수는?\n");
			    int kor=s.nextInt();
			    System.out.print("영어점수는?\n");
			    int eng=s.nextInt();
			    System.out.print("수학점수는?\n");
			    int math=s.nextInt();
			    String[] arr5=s6.exe(name1,kor,eng,math);
			    System.out.print("***************************\n");
				System.out.print("이름     총점   평균   등급\n");
				System.out.print("---------------------------\n");
				//System.out.print(name+" |  "+total+"  |  "+avg+"  |  "+re+"\n");
				System.out.print(String.format("%s  %s  %s  %s \n",arr5[0],arr5[1],arr5[2],arr5[3]));
				System.out.print("***************************\n");
			/*case "6":	
				System.out.print("Enter Interger\n");
				String num1=s.next();
				System.out.print("Enter Interger\n");
				String num2=s.next();
				String resultpuls=s2.calcPlus(num1,num2);
				System.out.println(resultpuls); 
				*/
			case "7":	 
				System.out.print("국어점수는?\n");
			    int kor1=s.nextInt();
			    g.setKor(kor1);
			    
			    System.out.print("영어점수는?\n");
			    int eng1=s.nextInt();
			    g.setEng(eng1);
			    
			    System.out.print("수학점수는?\n");
			    int math1=s.nextInt();
			    g.setMath(math1);
			    
			/*    g.setTotal(); 
			    g.setAvg();
			    */
			    g.setGrade();
			    
				 	
			    System.out.println(g.getGrade());
			}
			
		}
	}	
	}