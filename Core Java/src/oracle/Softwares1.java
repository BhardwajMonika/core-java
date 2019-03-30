package oracle;

public class Softwares1 {
	//constructor
		public Softwares1()
		{}
		//this method contains a list of softwares
		public final void printSoftware()
		{
			int i;
			String []arrOracle= {"Oracle8i","Oracle9i","Oracle0G"};
			for(i=0;i<3;i++)
			{
				System.out.println(arrOracle[i]);
			}
		}
}
