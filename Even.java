package com;
import java.util.*;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:" );
		int n = sc.nextInt();
		
		if(n%2==0) {
			System.out.println("The number "+n+" is Even");
		}else {
			System.out.println("The number "+n+" is Odd");
		}
		
	}

}
