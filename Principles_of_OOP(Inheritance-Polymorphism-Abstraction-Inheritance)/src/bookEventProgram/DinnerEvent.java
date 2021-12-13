package bookEventProgram;



public class DinnerEvent extends Event{
	
	/*
	 *  four private integer fields that represent numeric choices
	 */
	private int entree;
	private int sideDish1;
	private int sideDish2;
	private int dessert;
	
	/*
	 * Employee Array and size 15
	 */
	Employee[] emps = new Employee [15];
	/*
	 * three final arrays that contain String menu options
	 */
	final String [] sideDishes= {"Mashed Potatoes", "Baked Potatoe","String Beans","Shoepeg Corn","Chef Salad","Creamed Spinach","Cheesy Broccoli","Asian Cucumber"};
	final String [] desserts= {"Tiramisu","Cheese Cake","Strawberry Short Cake","Ice Cream","Coconut Cream Pie","Rice Pudding","Apple Pie","Creme Brulee"};
	final String [] entrees= {"Prime Rib","Grilled Salmon","Maryland Imperial Crab Cake","Herb Roasted Chicken","Green Goddess Buddha Bowl"};
	
	
	/*
	 * . Create a DinnerEvent constructor that requires arguments for an event number and number
	 *  of guests, and integer menu choices for one entree, two side dishes, and one dessert. Pass the first
	 *  two parameters to the Event constructor, and assign the last four parameters to the appropriate local fields.
	 */
	public DinnerEvent(String eventNumber,int numberOf_guest,String phoneNum,int eventType,int entree,int sideDish1,int sideDish2,int dessert,Employee[] emps)
	{
		super(eventNumber,numberOf_guest,phoneNum,eventType);
		
		setEntree(entree);
		setSideDish1(sideDish1);
		setSideDish2(sideDish2);
		setDessert(dessert);
		setEmployee(emps);
	}
	public DinnerEvent(String eventNumber,int numberOf_guest,String phoneNum, int eventType)
	{
		super(eventNumber,numberOf_guest,phoneNum,eventType);
	}

	public DinnerEvent() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * include a getMenu() method that builds and returns a String including the Strings for the four menu choices.
	 */
	public String getMenu()
	{
		String menu= "Entree Menu:\n";
		
		for(int i=0;i<entrees.length;i++)
		{
			menu+= i+1 +": "+entrees[i]+"\n";
		}
		menu+="\nSide Dishes Menu: \n";
		
		for(int i=0;i<sideDishes.length;i++)
		{
			menu+= i+1 +": "+sideDishes[i]+"\n";
		}
		menu+="\nDesserts Menu:\n";
		for(int i=0;i<desserts.length;i++)
		{
			menu+= i+1 +": "+desserts[i]+"\n";
		}
		
		return menu;
	}
	/*
	 * added setter methods for each fields, -1 for each options to match the UI options
	 */
	public void setEntree( int entree) {
		this.entree=entree-1;
	}
	public void setSideDish1( int sideDish1) {
		this.sideDish1=sideDish1-1;
	}
	public void setSideDish2( int sideDish2) {
		this.sideDish2=sideDish2-1;
	}
	public void setDessert( int dessert) {
		this.dessert=dessert-1;
	}
	/*
	 * Added Getter for fieldOptions
	 */

	public String getEntreeOption() {
		return entrees[entree];
	}
	
	public String getSideDish1Option() {
		return sideDishes[sideDish1];
	}	
	public String getSideDish2Option() {
		return sideDishes[sideDish2];
	}	
	public String getDessertOption() {
		return desserts[dessert];
	}
	/*
	 * Include a method that accepts an Employee array parameter and assigns it to the Employee array field,
	 *  and include a method that returns the Employee array
	 */
	public void setEmployee(Employee[] emps)
	{
		this.emps=emps;
	}
	public Employee [] getEmployee()
	{
		return emps;
	}
	
	
	
	
	
	
	
	
	
}