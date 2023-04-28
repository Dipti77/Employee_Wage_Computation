package com.bridgelabz;

public class EmpWageComputation {

	public static void main(String[] args) {
		
		int IS_Full_TIME = 1;
		int empCheck = (int) ((Math.random()*10) % 2);
		
		if (empCheck == IS_Full_TIME) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");
		}
	}
}


