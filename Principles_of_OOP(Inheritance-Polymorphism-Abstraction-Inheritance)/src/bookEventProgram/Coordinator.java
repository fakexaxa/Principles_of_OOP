package bookEventProgram;


public class Coordinator extends Employee {

	private int maxRate_coordinator = 20;
	@Override
	public void setJobTitle() {
		
		jobTitle="coordinator";
	}

	@Override
	public void setPayRate(double payRate) {
		
		if(payRate>maxRate_coordinator)
		{
			this.payRate=maxRate_coordinator;
		}
		else
		{
			this.payRate=payRate;
		}
	}

}
