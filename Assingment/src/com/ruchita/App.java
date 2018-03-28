package com.ruchita;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int f = 0; // Variable Declarations//
		List<String> result = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of array:");          //reading the number of testcases
		int num = sc.nextInt();
		for (int j = 1; j <= num; j++) 
		{ 
			int arr[] = new int[30];
			System.out.println("Enter elements of array (either 0 or 1)" + j);
			// for reading array elements
			for (int i = 0; i < 30; i++) 
			{ 
				arr[i] = sc.nextInt();
			}//End of first inner for loop
			// Logic  for determining whether the programmer is codelifematters or allcodersarefun
			for (int i = 0; i < 30; i++) 
			{ 
				if (arr[i] == 1) 
				{ 
					f++;
					if (f > 5)
					{
						break;
					}
				} //End of outer if
				else
					f = 0;
			}//End of second inner for loop
			if (f > 5) {
				result.add("#coderlifematters");
			} else {
				result.add("#allcodersarefun");
			}
		}//End of outer for loop
		for (String s : result)                            // Printing arraylist result
		{ 
			System.out.println(s);
		}
	  }
	    
}
		
	


