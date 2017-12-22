package com.sapient.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
		
		String str = null;
		
		try(BufferedReader br = new BufferedReader(new FileReader("sap.txt"))){//if we create stream in try block no
			while((str= br.readLine()) != null)//need to close connection in finally block
				System.out.println(str);
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}catch(IOException e){
			System.out.println(e.getMessage());
		}

	}

}
