package com;

import java.util.Scanner;

public class Prog6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no");
		int p=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		int b=sc.nextInt();
		
		if(p<35||c<35||m<35||b<35)
			System.out.println("fail");
		else 
		{
			double res=p+c+m+b/4.0;	
			if(res>=85)
			System.out.println("distinction");
		else if(res>60)
			System.out.println("1st class");
		else if(res>50)
			System.out.println("2nd class");
		else
			System.out.println("3rd class");
		}
	}
}
