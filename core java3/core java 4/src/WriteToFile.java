import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile 
{

	public static void main(String s[])
	{
		//writing to a file using BufferedWriter in java
		
		try {
			FileWriter writer = new FileWriter("names.txt",true);
			BufferedWriter bwr = new BufferedWriter(writer);
			
			bwr.write("James");
			bwr.newLine();
			//bwr.write("\n");
			bwr.write("HObert");
			bwr.close();
			
			System.out.println("successfully written to a file");
		}catch(IOException ioe) {
				ioe.printStackTrace();
			}

}
}
 