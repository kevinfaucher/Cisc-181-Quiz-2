package Tuition;

import java.util.Scanner;

public class TuitionCalc {

	public static void main(String[] args) {
		double initial_tuition, per_change, tuition_cost = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("What is the tuition cost intially: ");
		initial_tuition = in.nextDouble();
		
		System.out.println("What is the percent increase in tuition annually: ");
		per_change = in.nextDouble();
		
		in.close();
		
		for (int i = 0; i <= 3; i++) {
			tuition_cost += (initial_tuition * Math.pow(1 + per_change, i));}

		System.out.printf("Total Cost of Degree: $%.2f", tuition_cost);

		}
	}


