 class Test1
{

public void m1(int i , float f)
{
	System.out.println("int and float");
}
public void m1(float f , int i)
{
	System.out.println("float and int");
}
public static void main(String [] str)
{
	Test1 t = new Test1();
	t.m1(10,10f);
	t.m1(10f,10);
	t.m1(10,10);
	t.m1(10f,10f);
	

}
}