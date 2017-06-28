package com.hanbit.oop.sevice;
import java.util.Scanner;
public class BmiService {
	public String execute(double height,double weight){
	     
	      
	         double bmi = weight / (height * height);
	         System.out.print("BMI: "+ bmi);
	         String result =""; 
	            if(30.0 < bmi){
	               result = "비만";
	            }else if(25.0 <= bmi){
	               result = "과체중";
	            }else if(18.5 <= bmi){
	               result = "정상";
	            }else{
	               result = "저체중";
	            }
return result;	            
}
}