package com.pack3;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("sap1.txt");
		FileChannel fc = fis.getChannel();

		ByteBuffer buffer = ByteBuffer.allocate(10);
		//byte[] data = null;

		while (fc.read(buffer) != -1) {
			buffer.flip();
			while (buffer.hasRemaining()) {
				System.out.print((char) buffer.get());
			}
			// data = new byte[buffer.limit()];
			// buffer.get(data);
			// System.out.print(new String(data));
			buffer.clear();
			buffer.rewind();

		}
		fis.close();

	}

}
