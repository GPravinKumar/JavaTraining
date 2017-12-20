package com.sapient.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sap.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Christmas is celebrated in Sapient today\n");
		bw.write("assessment is on 4 days\n");
		
		bw.close();
		fw.close();
		System.out.println("file appended..");


	}

}
