import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class InputStreamToFileCopy {

	public static void main(String [] args)
	{
		try {
			InputStream is = new FileInputStream("D:\\JAVA TRAINING\\core java3\\core java 4\\names");
			
			OutputStream os = new FileInputStream("D:\\JAVA TRAINING\\core java3\\core java 4\\Copy_names");
			
			byte[]= buffer = new byte[1024];
			int bytesRead;
			//read from is to buffer
			while((bytesRead = is.read(buffer))!= -1) {
				os.write(buffer,0,bytesRead); 11
			}
			System.out.println("File copied");
			is.close();
			//flush outputstream to write any buffered data to file
			os.flush();
			os.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
