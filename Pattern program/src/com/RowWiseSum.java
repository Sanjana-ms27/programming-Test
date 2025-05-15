package com;
import java.util.Arrays;
import java.util.Scanner;

public class RowWiseSum {
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

int[] rowwiseSum(int[][] mat) {
	int s[]=new int[mat.length];
	for(int i=0;i<mat.length;i++) {
		int sum=0;
		for(int j=0;j<mat[i].length;j++) {
			sum=sum+mat[i][j];
		}
		s[i]=sum;
		
	}
	return s;
}
public static void main(String[] args) {
	RowWiseSum r=new RowWiseSum();
	int[][] row = r.read();
	r.display(row);
	System.out.println();

	int[] rowwiseSum = r.rowwiseSum(row);
	System.out.println("Rowwise sum elements "+Arrays.toString(rowwiseSum));
}
}
