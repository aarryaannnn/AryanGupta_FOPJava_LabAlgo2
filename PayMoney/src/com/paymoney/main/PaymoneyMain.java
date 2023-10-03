package com.paymoney.main;

import java.util.Scanner;
import com.paymoney.service.PaymoneyService;

public class PaymoneyMain {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the size of transaction array");
		int size = s.nextInt();
		int arr[] = new int[size];
		
		System.out.println("enter all values of array");
		for(int idx = 0; idx < size; idx++) {
			arr[idx] = s.nextInt();
		}
		
		System.out.println("enter the total no of target that needs to be achieved");
		int noOfTarget = s.nextInt();
		
		PaymoneyService paymoneyService = new PaymoneyService();
		paymoneyService.paymoneyTransaction(arr, noOfTarget);
		
		s.close();
	}
}
