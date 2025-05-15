package com;
import java.util.Arrays;
import java.util.Scanner;

public class DiagonalWiseBig {
	int[][] read(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the order of elements");
		int row=sc.nextInt();
		int col=sc.nextInt();
		
		int[][] mat=new int[row][col];
		System.out.println("Enter "+row*col+" elements" );
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}

	void display(int[][] mat)
	{
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			
		System.out.println();
		}	
	}
	
	int[] diagonalBig(int[][] mat) {
		int fbig=mat[0][0],sbig=mat[0][mat.length-1];
		
		for(int i=1;i<mat.length;i++) {
			if(mat[i][i]>fbig)
				fbig=mat[i][i];
			if(mat[i][mat.length-1-i]>sbig)
		sbig=mat[i][mat.length-1-i];
	}
		int[] big= {fbig,sbig};
		return big;
}
	
	public static void main(String[] args) {
		DiagonalWiseBig d=new DiagonalWiseBig();
		int[][] r = d.read();
		d.display(r);
		
		System.out.println();
		
		int[] big=d.diagonalBig(r);
		System.out.println("Diagonalwise Biggest Elements "+Arrays.toString(big));
	}
}
