package com.sql.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AllInOne {
	public static void main(String[] args) {
		
		// factorial program
		Scanner s= new Scanner(System.in);
		System.out.println("enter the number");
		int a=s.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++) {
			fact =fact*i;
		}
		System.out.println(fact); 
		
		// fibonnassi series
		int n1=0,n2=1, n3,count=10;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=count;i++) {
		n3=n1+n2;
		System.out.print(" "+n3);
		n1=n2;
		n2=n3;
		}
		
		// largest element
		System.out.println();
		int[] b= {12,25,15,14,12,16,28,14,65};
		int max=b[0];
		for(int i=0;i<b.length;i++) {
			if(b[i]>max) {
				max=b[i];				
			}					
		}
	
		System.out.println(max);
		System.out.println("--------------------------");
		
		// duplicate element
		int[] d= {14,36,25,78,96,45,14,26,36,95,25};
		for(int i=0;i<d.length;i++) {
			for(int j=i+1;j<d.length;j++) {
		
				
				if(d[i]==d[j]) {
					System.out.println(d[j]);
				}
			}
		}
		
		// reverse String
		String m="rajsaheb";
		for(int i=m.length()-1;i>=0;i--) {
			System.out.print(m.charAt(i));
		}
		
		// String counting without space
		System.out.println();
		String n="welcome google";
		int count1 =0;
		for(int i=0;i<n.length();i++) {
			if(n.charAt(i)!=' ') 
		 count1++;
				
			}
		System.out.println(count1);
		
		
		// reverse number
		int number=12345;
		int reverse=0;
		while(number!=0) {
		int	reminder=number%10;
		reverse=reverse*10+reminder;
		number=number/10;
		}	
		System.out.println(reverse);
		
		
		// to print zero one side
		int[] arr = {3,0,4,0,8,0,9,0,5};
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}while(count<arr.length) {
			arr[count++]=0;
		}
		System.out.println(Arrays.toString(arr));
		
		
		// pallindrome String
		String z= "Radar";
	String revers="";
	for(int i=z.length()-1;i>=0;i--) {
		revers=revers+z.charAt(i);	
	}
	if(z.toLowerCase().equals(revers.toLowerCase())) {
		System.out.println(z+" is pallindrome");
	}
	else {
		System.out.println(z+" not pallindrome");
	}
	
		
	
	   // pallindrome number
	int num=4554;
	int rev=0;
	int k=num;                           // original value pass to the k
	while(num!=0) {
		int reminder=num%10;
		rev=rev*10+reminder;
		num=num/10;
	}
	if(k==rev) {
		System.out.println(k+" no. is pallindrome");
	}
	else {
		System.out.println(k+" no.is not pallindrome");
	}
	
	
	// check both the string are anagram or not
	
	String x="Listen";
	String y="Silent";
	
	x=x.toLowerCase();                   // converted into lowercase
	y=y.toLowerCase();                   // converted into lowercase
	
	if(x.length()!=y.length()) {
		System.out.println("String is not anagram");
	}else {
		// converting both the arrays in char array
		char[] x1=x.toCharArray();
		char[] y1=y.toCharArray();
		
		// sorting array
		Arrays.sort(x1);
		Arrays.sort(y1);
		
		if(Arrays.equals(x1,y1)==true) {
			System.out.println("both the String are anagram");
		}
		else {
			System.out.println("both the String are not anagram");
		}
		
		
	}
	 
	// alternate character of string
	String r="i am rahul";
	for(int i=0;i<r.length();i=i+2) {
		System.out.println(r.charAt(i));
	}
	
	
	   // calculate sum  of given no.
	 int p=12345, q,sum=0;
	 while(p>0) {
		 q=p%10;                                    // reminder
		 sum=sum+q;
		 p=p/10;                                    // quationt
		 
		 
	 }
	 System.out.println(sum);
	 
	
	 // given string is vowell and consonant
	  String l="welcome to code decode and code decode welcomes you";
	  int vowel=0;
	  int consonant=0;
	  for(int i=0;i<l.length();i++) {
		  char ch=l.charAt(i);
	  if(ch=='a'||ch=='e' || ch=='i'||ch=='o'||ch=='u') {
		  vowel++;
	  }
	  else if(ch>='a'&&ch<='z') {
		  consonant++;  
		  
	  }
	  }
	  System.out.println("vowels :"+vowel);
	  System.out.println("consonant :"+consonant);
	  
	  
	  // to print the pattern 1,0
		for(int i=5;i>=0;i--) {
			for(int j=0;j<=i;j++){
				if(j%2==0) {
				
				System.out.print(1);
			}else {
			System.out.print(0);
			}
		}
			System.out.println();
	}
	  }
		
			
		}
		
	


