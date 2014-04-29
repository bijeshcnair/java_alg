package com.bc.im;

public class ReverseString {

	public static void main(String[] args) {


		String a = "abcdefghijklmnopqrst";
		System.out.println(reverseString(a));

	}

	public static String reverseString(String str){

		if(str.length() == 1){
			return str;
		}

		return reverseString(str.substring(1))+str.charAt(0);
	}
	public static String checkSub(String str1,String str2,String str3){


		String [] split = str1.split(str3);
		String []collect = new String[split.length];
		for(String spl:split){
			System.out.println(spl);
			if (spl.length()<str2.length()) {
				continue;
			}
			for(int i=0;i<str2.length();i++){
				char c = str2.charAt(i);
				if(spl.indexOf(c) != -1){
					
				}
				
			}
		
		}

	}
}


