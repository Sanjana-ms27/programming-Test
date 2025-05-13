package com;

import java.util.Scanner;

public class Prog5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			boolean res=isPrime(i);
			if(res)
				System.out.println(i+" ");
		}
	}
	static boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++) {
			if(x%i!=0)
				return false;
		}
		return true;

	}
}
