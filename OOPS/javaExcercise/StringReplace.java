package javaExcercise;

public class StringReplace {
//Sample sring Java Application. Find for character 'a' and replace with '@'. If you 'a' for first time replace it with 1 '@', for second 'a' replace with '@@' like increase the '@' based on occurance increment
	public static void main(String[] args) {
		String src = "Java Application";
		// J@v@@ @@@pplic@@@@tion
		char[] array = src.toCharArray();
		int arrayLength = array.length;
		int counter = 0;
		String output="";
		for (int i = 0; i < arrayLength; i++) {
			String sTemp = String.valueOf(array[i]);
			if (sTemp.equalsIgnoreCase("a")) {
				counter = counter + 1;
				String out = "@";
				for (int j = 0; j < counter; j++) {
					out = out + "@";
				}
				output = output+out;
			} else {
				output = output+String.valueOf(array[i]);
			}

		}
		System.out.println(output);
	}

}
