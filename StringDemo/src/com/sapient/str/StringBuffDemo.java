package com.sapient.str;

public class StringBuffDemo {
	public static void main(String[] args){
		String str = "ram";
		StringBuffer sb = new StringBuffer(str);//convert string into string buffer
		System.out.println(sb);
		sb.append(" rahim");
		System.out.println(sb);
		sb.insert(4, "roy ");
		System.out.println(sb);
		sb.replace(4, 7, "jack");
		System.out.println(sb);
		sb.delete(4, 6);
		System.out.println(sb);
		sb.replace(4, 6, "is");
		System.out.println(sb);
		String str2 = sb.toString();//convert string buffer to string
		
		
		StringBuffer name1=new StringBuffer("amar");
		name1.reverse();
		System.out.println(name1);
		name1.append(" kumar");
		System.out.println(name1);
		System.out.println(name1.substring(6, 9));
		System.out.println(name1.charAt(2));
		System.out.println(name1.indexOf("m"));
	}

}
