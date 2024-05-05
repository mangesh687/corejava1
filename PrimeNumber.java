package com.basicjava;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m,count=0;
		m=n/2;
		if(n==0 || n==1) {
			System.out.println(n+"this no is not a prime number");
		}else  {
			for(int i=2;i<=m;i++) {
				if(n%i==0) {
					System.out.println(n+"this no is not a prime number");
					count=1;
					break;
				}}
				 if (count==0) {
					System.out.println(n+"this  is  a prime number");
				}
			}
		
		
		
	}
}
