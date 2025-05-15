package com;
import java.util.Arrays;
import java.util.Scanner;

public class Rotate90left {
	
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
	
int[][] rotate90left(int[][] mat){
	mat=transpose(mat);
	rowwiseReverse(mat);
	return mat;
}

void rowwiseReverse(int[][] mat) {
	for(int i=0;i<mat.length;i++) {
		int f=0,l=mat[0].length-1;
		while(f<l) {
			int temp=mat[i][f];
			mat[i][f]=mat[i][l];
			mat[i][l]=temp;
			f++;
			l--;
		}
	}
	
}

int[][] transpose(int[][] mat) {
	int[][] tm=new int[mat[0].length][mat.length];
	for(int i=0;i<mat.length;i++) {
		for(int j=0;j<mat[i].length;j++) {
			tm[j][i]=mat[i][j];
		}
	}
	return tm;
}
public static void main(String[] args) {
	Rotate90left r=new Rotate90left();
	int[][] m=r.read();
	r.display(m);
	int[][] rotate90left = r.rotate90left(m);
	
	System.out.println(Arrays.deepToString(rotate90left));
		
}
}
