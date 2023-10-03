package com.paymoney.service;
import java.util.Scanner;

public class PaymoneyService {
	public void paymoneyTransaction(int arr[], int noOfTarget) {
		Scanner s = new Scanner(System.in);
		
		while(noOfTarget-- != 0) {
			int idx = 0;
			int flag = 0;
			System.out.println("enter the value of target");
			int target = s.nextInt();
			
			int sum = 0;
			while(idx < arr.length) {
				
				sum += arr[idx];
				
				if(target <= sum) {
					System.out.println("target achieved after " + (idx+1) + " transactions");
					flag = 1;
					break;
				}
				
				idx++;
			}
			
			if(flag == 0) {
				System.out.println("given target is not achieved");
			}
		}
		s.close();
	}
}
