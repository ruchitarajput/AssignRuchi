package com.ruchita;

import java.util.Scanner;

public class CompressString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Reading the  values of n and k from users
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		//iterating till the no of queries
		for(int i=0;i<t;i++)            
		{
			System.out.println("Enter the value of n");
             int n=sc.nextInt();
			System.out.println("Enter the value of k");
			int k=sc.nextInt();
			/*Logic for compression*/
			System.out.println(2*(1+(k-1)/(double)k*(n-1)));
		}

	}

}
