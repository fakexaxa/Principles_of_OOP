package bookEventProgram;



public class Waitstaff extends Employee{

	private int maxRate_waitStaff = 10;
	@Override
	public void setJobTitle() {
	
		jobTitle="waitstafff";
	}

	@Override
	public void setPayRate(double payRate) {
		
		if(payRate>maxRate_waitStaff)
		{
			this.payRate=maxRate_waitStaff;
		}
		else
		{
			this.payRate=payRate;
		}
	}

}
