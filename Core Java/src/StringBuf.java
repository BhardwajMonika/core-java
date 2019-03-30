
public class StringBuf {
//constructor
	protected StringBuf()
	{
		
	}
	
	public static void main(final String []args)
	{
		StringBuffer buf = new StringBuffer("Java");
		buf.append("Guid ver1/"); //append //java Guide Ver1/7
		buf.append(3);
		int index = 5; //Insert // Java Student Guide Ver1/7
		buf.insert(index,"Student");
		index = 21; //set //Java Student Guide Ver1.7
		buf.setCharAt(index, '.');
		int start = 23; // Replace // Java Student Guide Ver1.8
		int end = 24;
		buf.replace(start, end, "8");
		String s = buf.toString(); //convert to string
		System.out.println(s);
	}
}
