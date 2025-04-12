package javaExcercise;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest {
	public static void main(String args[]) throws IOException {
		File f = new File("D:\\file.txt");
		FileWriter fw = new FileWriter(f);
		fw.append("ARUN\n");
		fw.append("SEV");
		fw.close();
//	FileReader fr=new FileReader(f);
		Scanner myReader = new Scanner(f);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	}
}
