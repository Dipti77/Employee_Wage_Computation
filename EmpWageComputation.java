package com.bridgelabz;

public class EmpWageComputation {

	public static void main(String[] args) {
		
		int IS_PART_TIME = 1;
		int IS_Full_TIME = 2;
		int EMP_WAGE_PER_HR = 20;
		
		int empHrs = 0;
		int empWage = 0;
		
		int empCheck = (int) ((Math.random()*10) % 3);
		
		if (empCheck == IS_Full_TIME) {
			System.out.println("Employee is Present Full time");
			empHrs = 8;
		}
		else if(empCheck == IS_PART_TIME) {
			System.out.println("Employee is Present Part time");
			empHrs = 4;
		}
		else {
			System.out.println("Employee is Absent");
			empHrs = 0;
		}
		
		empWage = EMP_WAGE_PER_HR * empHrs;
		System.out.println("Daily employee wage: " + empWage);
		
	}
}

