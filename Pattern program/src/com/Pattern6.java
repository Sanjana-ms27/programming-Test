package com;
import java.util.Scanner;

public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=i+1;j<=n;j++) {
			System.out.print(j);
		}
			System.out.println();
		}
		
	}
}
