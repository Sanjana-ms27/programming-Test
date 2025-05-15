package com;
import java.util.Scanner;

public class Pattern7 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int n=sc.nextInt();
	
	int star=n,space=0;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}
		
			if(i<=n/2) { 
				space++;
				star=star-2;
			}
			
			else {
				space--;
				star=star+2;
			
		}
			System.out.println();
			
		}
		
		
	
	}
}

	
	
	
	


