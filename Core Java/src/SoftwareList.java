import sun.Softwares;
import oracle.Softwares1;
import oracle.Softwares1;
public class SoftwareList {

	//constructor
	protected SoftwareList()
	{}
	
	/*this is the main method
	 * It creates objects of classes in sun and oracle packages and access its method
	 * @param args passed to the main method
	 */
	public static void main(String []args)
	{
		Softwares objSun = new Softwares();
		objSun.listSoftware();
		Softwares1 objOracle = new Softwares1();
		objOracle.printSoftware();
	}
}
