package io;

import java.nio.ByteBuffer;
import static net.mindview.util.Print.*;


public class GetData {

	private static final int BSIZE = 1024;
	public static void main(String[] args) {
		ByteBuffer byteBuffer = ByteBuffer.allocate(BSIZE);
		int i = 0;
		
		while(i++ < byteBuffer.limit()) {
			if (byteBuffer.get() != 0) {
				print("nonzero");
			}	
		}
		print("i = " + i);
		byteBuffer.rewind();
		
		byteBuffer.asCharBuffer().put("Howdy");
		
		char c;
		while((c = byteBuffer.getChar()) != 0)
			printnb(c + " ");
		
		print();
		byteBuffer.rewind();
		byteBuffer.asShortBuffer().put((short)471142);
		print(byteBuffer.getShort());
		byteBuffer.rewind();
		byteBuffer.asIntBuffer().put(99471142);
		print(byteBuffer.getInt());
		byteBuffer.rewind();
		byteBuffer.asLongBuffer().put(99471142);
		print(byteBuffer.getLong());
		byteBuffer.rewind();
		byteBuffer.asFloatBuffer().put(99471142);
		print(byteBuffer.getFloat());
		byteBuffer.rewind();
		byteBuffer.asDoubleBuffer().put(99471142);
		print(byteBuffer.getDouble());
		byteBuffer.rewind();
	}
}
