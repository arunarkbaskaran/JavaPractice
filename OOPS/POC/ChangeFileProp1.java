package POC;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ChangeFileProp1 {

	private static final Set<String> IMAGE_EXTENSIONS = new HashSet<>();

	static {
		String[] extensions = { ".jpg", ".jpeg", ".png", ".gif", ".bmp", ".webp", ".heic" };
		for (String ext : extensions) {
			IMAGE_EXTENSIONS.add(ext);
			IMAGE_EXTENSIONS.add(ext.toUpperCase()); // Ensure case-insensitivity
		}
	}

	public static void main(String[] args) throws IOException {
		System.out.println(LocalDateTime.now());
		Path directoryPath = Paths.get("D:\\ARUN_DATA\\Pictures");
		listSubdirectories(directoryPath);
		System.out.println(LocalDateTime.now());

	}

	public static void listSubdirectories(Path startDir) throws IOException {
		Files.walkFileTree(startDir, new SimpleFileVisitor<Path>() {
			@Override
			public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
//				System.out.println("Subdirectory found: " + dir.toAbsolutePath());
				findImageFiles(dir);
				return FileVisitResult.CONTINUE;
			}
		});
	}

	public static void findImageFiles(Path directory) {
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
			for (Path file : stream) {
				if (!Files.isDirectory(file) && isImageFile(file)) {
//					System.out.println("Image file found: " + file.toAbsolutePath());
					String batchFilePath = "D:\\ARUN_DATA\\Pictures\\cpfile.bat";
					appendToFile(batchFilePath, "copy " + file.toAbsolutePath() + " D:\\Pictures\\BKP\\");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isImageFile(Path file) {
		String fileName = file.getFileName().toString().toLowerCase();
		return IMAGE_EXTENSIONS.stream().anyMatch(fileName::endsWith);
	}

	public static void appendToFile(String filePath, String content) {
		try {
			Files.write(Paths.get(filePath), (content + System.lineSeparator()).getBytes(), StandardOpenOption.CREATE,
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}