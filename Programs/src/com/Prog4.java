package com;

import java.util.Scanner;

public class Prog4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			System.out.println(i+" ");
		}
	    
	}
}
