package com.pack3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class TransferDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("sap1.txt");
		FileChannel      fromChannel = fis.getChannel();

		FileOutputStream fos = new FileOutputStream("sap2.txt");
		FileChannel      toChannel = fos.getChannel();

		long position = 0;
		long count    = fromChannel.size();

		//toChannel.transferFrom(fromChannel, position, count);
		fromChannel.transferTo(position, count, toChannel);
		System.out.println("file transfered");
		fis.close();
		fos.close();

	}

}
