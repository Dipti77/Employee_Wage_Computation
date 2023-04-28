package com.bridgelabz;

public class EmpWageComputation {

	public static void main(String[] args) {
		
		final int IS_PART_TIME = 1;
		final int IS_Full_TIME = 2;
		final int EMP_WAGE_PER_HR = 20;
		final int WORKING_DAYS = 20;
		
		int empHrs = 0;
		int totalWage = 0;
		int empWage = 0;
		
		for (int day=1; day<=WORKING_DAYS; day++)
		{
			int empCheck = (int) ((Math.random()*10) % 3);
			switch (empCheck)
			{
				case IS_Full_TIME:
					empHrs = 8;
					break;
				case IS_PART_TIME:
					empHrs = 4;
					break;
				default:
					empHrs = 0;
			}
		
			empWage = EMP_WAGE_PER_HR * empHrs;
			System.out.println("Day: " + day + " Emp wage is: " + empWage);
			totalWage = totalWage + empWage;
		}
	
		System.out.println("Employee wage for a month : " + totalWage);
		
	}
}

