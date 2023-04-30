package com.bridgelabz;

public class EmpWageComputation {

	public static final int IS_PART_TIME = 1;
	public static final int IS_Full_TIME = 2;
	public static final int EMP_WAGE_PER_HR = 20;
	public static final int WORKING_DAYS = 20;
	public static final int MAX_WORKING_HRS = 100;

	public void computeEmpWage(){
		
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		
		while (totalEmpHrs <= MAX_WORKING_HRS && totalWorkingDays < WORKING_DAYS)
		{
			totalWorkingDays++;
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
			
			totalEmpHrs = totalEmpHrs + empHrs;
			empWage = EMP_WAGE_PER_HR * empHrs;
			totalEmpWage = totalEmpWage + empWage;
			
			System.out.println("Day: " + totalWorkingDays + " Emp Hr: " + empHrs + " Emp wage: " + empWage);
			
		}
		
		System.out.println("Total Employee wage : " + totalEmpWage);
	}
	
	public static void main(String[] args) {
		
		EmpWageComputation ewc = new EmpWageComputation();
		ewc.computeEmpWage();
		
	}
}

