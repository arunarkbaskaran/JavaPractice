package POC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class ChangeFileProp {
	static ArrayList<File> searchDir = new ArrayList<File>();

	public static void main(String[] args) {
		System.out.println(LocalDateTime.now());
		String directoryPath = "D:\\ARUN_DATA\\Pictures";
		String batchFilePath = directoryPath;
		File directory = new File(directoryPath);
		listSubdirectories(directory);
		searchDir.forEach(file -> {
			findImageFiles(file);
		});
		System.out.println(LocalDateTime.now());

	}

	public static void findImageFiles(File directory) {
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (isImageFile(file)) {
//					System.out.println("Image file found: " + file.getAbsolutePath());
					String directoryPath = "D:\\ARUN_DATA\\Pictures\\cpfile.bat";
					appendToFile(directoryPath, "copy " + file.getAbsolutePath() + " D:\\Pictures\\BKP\\");
				}
			}
		}
	}

	public static void listSubdirectories(File directory) {
		File[] files = directory.listFiles();
		if (files != null) {
			for (File file : files) {
				if (file.isDirectory()) {
//					System.out.println("Subdirectory found: " + file.getAbsolutePath());
					searchDir.add(new File(file.getAbsolutePath()));
					listSubdirectories(file);
				}
			}
		}
	}

	public static void appendToFile(String filePath, String content) {
		try (FileWriter writer = new FileWriter(filePath, true)) {
			writer.write(content);
			writer.write(System.lineSeparator());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isImageFile(File file) {
		String fileName = file.getName().toLowerCase();
		return fileName.endsWith(".jpg") || fileName.endsWith(".jpeg") || fileName.endsWith(".png")
				|| fileName.endsWith(".PNG") || fileName.endsWith(".gif") || fileName.endsWith(".GIF")
				|| fileName.endsWith(".bmp") || fileName.endsWith(".BMP") || fileName.endsWith(".webp")
				|| fileName.endsWith(".WEBP") || fileName.endsWith(".heic") || fileName.endsWith(".JPG")
				|| fileName.endsWith(".JPEG") || fileName.endsWith(".HEIC");
	}
}
