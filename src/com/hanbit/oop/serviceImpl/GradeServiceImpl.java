package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.Gradebean;
import com.hanbit.oop.service.GradeService;

public class GradeServiceImpl implements GradeService{

	@Override
	public int getTotal(Gradebean gbean) {
		return gbean.getKor() + gbean.getEng() + gbean.getMath();	
	}

	@Override
	public int setAvg(int total) {
		return total / 3;
	}

	@Override
	public String Grade(int avg) {
		String grade="";
		switch (avg / 10) {
		case 10:
		case 9:
			grade = "A";
		
			break;
		case 8:
			grade = "B";
		
			break;
		case 7:
			grade = "C";
		
			break;
		case 6:
			grade = "D";
		
			break;
		case 5:
			grade = "e";
		
			break;
		default:
			grade = "f";
		
			break;
		}

	return grade;
	}

	
}
