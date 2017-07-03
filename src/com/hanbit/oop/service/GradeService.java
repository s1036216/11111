package com.hanbit.oop.service;

import com.hanbit.oop.domain.Gradebean;

public interface GradeService {

	public int getTotal(Gradebean gbean);
	public int setAvg(int total);
	public String Grade(int avg);
	
}
