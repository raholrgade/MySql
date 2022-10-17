package com.sql.util;

public class Demo {
public static boolean prime(int a) {
	boolean isdivisible=false;
	for(int i=2;i<a;i++) {
		if(a%2==0) {
			isdivisible=true;
		}
		
	}
	return a>1 && !isdivisible;
	 
	
}
public static void main(String[] args) {
	System.out.println(prime(10));
	
}

}
