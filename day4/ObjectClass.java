public class ObjectClass
{
	public static void main(String s[])
	{
		ObjectClass oc = new ObjectClass();
		System.out.println(oc.hashCode()); //366712642
		System.out.println(oc.toString()); // ObjectClass@15db9742
		
		System.out.println(oc.getClass()); //class ObjectClass
		
		ObjectClass oc1 = new ObjectClass();
		System.out.println(oc.equals(oc1)); //false
		System.out.println(oc1.hashCode()); //1829164700
		System.out.println(oc1.toString()); //ObjectClass@6d06d69c
		
		ObjectClass oc2 = oc;
		
		System.out.println(oc.equals(oc2)); //true
	}
}