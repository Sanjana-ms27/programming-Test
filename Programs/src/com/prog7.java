package com;

import java.util.Scanner;

public class prog7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		double sum=0;
		int count=0;
		do {
			int d=n%10;
		sum=sum+d;
		n=n/10;
		count++;
		}while(n!=0);
		double avg=sum/count;
		System.out.println("average:"+avg);
		
	}
}
