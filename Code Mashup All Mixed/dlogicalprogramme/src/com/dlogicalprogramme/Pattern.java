package com.dlogicalprogramme;

public class Pattern {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j>=6-i&&j<=4+i)
					System.out.print("*");
				else
					System.out.println();
			}
			System.out.println();
			
		}
		
	}

}
