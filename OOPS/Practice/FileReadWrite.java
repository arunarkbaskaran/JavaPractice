package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		File newFile = new File("E:\\ARUN.txt");
		if (!newFile.exists()) {
			newFile.createNewFile();
		}
		// Using file ouputstream
		String message = "Hello, this is a test file. 1";
		byte[] msg = message.getBytes();
		FileOutputStream fo = new FileOutputStream(newFile);
		fo.write(msg);
		fo.close();

		// Read Using File Input Stream
		FileInputStream fi = new FileInputStream(newFile);
		String readMsg="";
		int i;
		while((i=fi.read())!=-1)
		{
			readMsg=readMsg+(char)i;
		}
		System.out.println(readMsg);
		//Delete File
		newFile.delete();
		
		// Using File Writer
		if (!newFile.exists()) {
			newFile.createNewFile();
		}
		FileWriter writer = new FileWriter(newFile);
		writer.write("Hello, this is a test file. 1");
		writer.close();
	}

}
