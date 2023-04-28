package com.bridgelabz;

public class EmpWageComputation {

	public static void main(String[] args) {
		
		int IS_Full_TIME = 1;
		int EMP_WAGE_PER_HR = 20;
		int empHrs = 0;
		
		int empCheck = (int) ((Math.random()*10) % 2);
		
		if (empCheck == IS_Full_TIME) {
			System.out.println("Employee is Present");
			empHrs = 8;
		}
		else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		
		int empWage = EMP_WAGE_PER_HR * empHrs;
		System.out.println("Daily employee wage: " + empWage);
		
	}
}


