package bookEventProgram;

abstract class Employee {

	private String idNum;
	private String lastName;
	private String firstName;
	protected double payRate;
	protected String jobTitle;
	
	
	public abstract void setJobTitle();
	public abstract void setPayRate(double payRate);
	
	
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getPayRate() {
		return payRate;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	
	
}
