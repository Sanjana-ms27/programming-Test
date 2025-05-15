package com;
import java.util.Scanner;

public class BinToHex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int res=binToHex(n);
	System.out.println(res);
}

static int binToHex(int bin) {
	int dec=0,p=1;
	do {
		int d=bin%10;
		dec=dec+d*p;
		p=p*8;
		bin=bin/10;
		
	}while(bin!=0);
	return dec;
}
}
