package com.train;


public class Armstrong {
	
	
	public static void main(String[] args) {
		for (int k = 0; k < 1000; k++) {
			
		int a = k;
		int i=0,j=0;
		
		while (a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
				
		}
		if (j==k) {
			System.out.println(j);	
		}
		
		}
	
}
}
