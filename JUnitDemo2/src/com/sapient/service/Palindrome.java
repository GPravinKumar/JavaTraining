package com.sapient.service;

public class Palindrome {
	
	Palindrome() {
		
	}
	
	public boolean checkPalindrome(String str) {

		if (str == null)
			return false;
		StringBuffer sb = new StringBuffer(str);

		if (str.length() > 0 && str.equals(sb.reverse().toString()))
			return true;
		else
			return false;
	}
	public String[] reverseName(String[] str){
		
		if(str==null)
			return null;
		
		String[] res = new String[str.length];
		StringBuffer sb = null;
		int i=0;
		for(String a: str){
			sb= new StringBuffer(a);
			res[i]=sb.reverse().toString();
			i++;
		}
		return res;
		
	}

}
