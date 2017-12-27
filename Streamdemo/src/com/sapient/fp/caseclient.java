package com.sapient.fp;

public class caseclient {
	
	//  functional programming

	public static void main(String[] args) {
		
		Icase lower=s->s.toLowerCase();
		Icase upper=(String s)->{return s.toUpperCase();};
		
		display(s->s.toLowerCase(),"RAMA");
		display((String s)->{return s.toUpperCase();},"afsal");
		
		

	}

	
	public static void display(Icase obj,String  str){
		String res=obj.changecase(str);
		System.out.println(res);
	}
}
