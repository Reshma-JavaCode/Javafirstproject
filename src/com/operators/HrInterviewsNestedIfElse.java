package com.operators;

import java.util.Scanner;

public class HrInterviewsNestedIfElse {

	public static void main(String[] args) {

		int yop;
		boolean hasBacklogs, hasSkills, written, hr;
		double experience;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Year Passing: ");
		yop = sc.nextInt();

		if (yop >= 2020 && yop <= 2026) {
			System.out.println("yop Criteria reached");
			System.out.println("Is there any Active Backlogs?(true/false)");
			hasBacklogs = sc.nextBoolean();
			if (!hasBacklogs) {
				System.out.println("Do You have Advance Java Skills?? (true/false)");
				hasSkills = sc.nextBoolean();
				if (hasSkills) {
					System.out.println("Enter your experience in numbers");
					experience = sc.nextDouble();
					if (experience >= 0 && experience < 3) {
						System.out.println("Interview scheduled");
						System.out.print("Written Test Cleared? (true/false): ");
						written = sc.nextBoolean();

						if (written) {

							System.out.print("HR Round Cleared? (true/false): ");
							hr = sc.nextBoolean();

							if (hr) {
								System.out.println("Congratulations! Candidate Selected");
							} else {
								System.out.println("Rejected in HR Round");
							}
						} else {
							System.out.println("Rejected in Written Test");
						}

					}

					else {
						System.out.println("we need below 3 years experience persons only");
					}

				} else {
					System.out.println("Java skills Required!!");
				}
			} else {
				System.out.println("Candidate have Active backlogs");
			}
		} else {
			System.out.println("Yop Criteria not reached!!");
		}

	}

}
