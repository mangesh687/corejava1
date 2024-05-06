package com.basicjava;

import java.util.Iterator;

public class Fabonicesserise {
	public static void main(String[] args) {
		int n1=0,n2=1,n3,count=10;
		System.out.print(n1+" "+n2+" ");
		for(int i=0;i<count-2;i++) {
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
		//name
		System.out.println("name");
	}

}
