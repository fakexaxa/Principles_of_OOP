package bookEventProgram;



public class Bartender extends Employee {

	private int maxRate_bartender = 14;
	@Override
	public void setJobTitle() {
		
		jobTitle="bartender";
	}

	@Override
	public void setPayRate(double payRate) {
		
		if(payRate>maxRate_bartender)
		{
			this.payRate=maxRate_bartender;
		}
		else
		{
			this.payRate=payRate;
		}
	}

}
