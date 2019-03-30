import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.*;
public class BufferedReaderExample 
{

	public static void main(String s[]) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("D:\\JAVA TRAINING\\core java3\\core java 4\\names.txt")));
			String line = " ";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}catch(FileNotFoundException e) {
			System.out.println("File not exists or insufficient rights");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("An exception occured while reading the file");
			e.printStackTrace();
		}
	}
}
