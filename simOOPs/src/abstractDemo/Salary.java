package abstractDemo;

public abstract class Salary
{
	public int PF(int basic)
	{
		return 12*basic/100;
	}
	 
	public int HRA(int basic)
	{
		return 40*basic/100;
	}
	
	public abstract int SA();
	public abstract int TA();
	

}

class Infosys extends Salary
{

	@Override
	public int SA() {
		
		return 30000;
	}

	@Override
	public int TA() {
		// TODO Auto-generated method stub
		return 2500;
	}
	
}
