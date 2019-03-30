public class ShapeTest
{
	public static void main(String s[])
	{
		//programming for interfaces not implementing
		Shape shape = new Circle(10);
		
		shape.draw();
		System.out.println("Area = "+shape.getArea());
		
		//switching from one implementation to another easily
		shape = new Rectangle(10,10);
		shape.draw();
		System.out.println("Area="+shape.getArea());
	}
} 