/*
Rynn Arriola
Unit 12 Part 1		
*/


package bookEventProgram;
import java.util.InputMismatchException;
import java.util.Scanner;



public class StaffDinnerEvent {

	public static void main(String[] args) {
		
		
		DinnerEvent[] event=new DinnerEvent[2]; 
		int guestNum;
		String eventNum;
		int eventType;
		String phoneNum;
		int entree;
		int sideDish1;
		int sideDish2;
		int dessert;
		Employee [] emps= new Employee[15];
		
		
	
	
		
		/*
		 * get all the inputs for each object
		 */
		for(int x=0;x<event.length;x++)
		{	
			/*
			 * Ask user to input values for each events
			 */
				eventNum=eventNum();
				guestNum=guestNum();
				phoneNum=phoneNum();
				eventType=eventType();
				
					/*
					 * store initial values in each object
					 */
				event[x]= new DinnerEvent(eventNum,guestNum,phoneNum,eventType);
				
					/*
					 * Show the Menu
					 */
				System.out.println(event[x].getMenu());
				
				entree=entree();
				sideDish1=sideDish();
				sideDish2=sideDish();
				dessert=dessert();
				
				emps= getEmps(guestNum);
				
				/*
				 * store the entree,side dishes, and desserts
				 */
				event[x]= new DinnerEvent(eventNum, guestNum, phoneNum,eventType,entree, sideDish1, sideDish2,dessert,emps);
									
		}
		
		
		/*
		Print all the details of each objects
		*/
		
		printAllObjects(event,emps);
		
	
		
		/*
		closed scanner
		*/
		
		
	}
	
	public static void eventDetails(DinnerEvent e)
	{
		
		
		/*
		this is a method to print all the details of the event
		
		get all the values using the get method from the class of Events()
		*/
		if(e.isLargeEvent()==true)
			System.out.println(
					"\nEvent Number: "+e.getEventNumber()
					+"\nContact phone number: "+e.getPhoneNum()
					+"\nEvent Type: "+e.getEventType()
					+"\nDinner choice: "
					+"\nEntree - "+e.getEntreeOption()
					+"\nSide Dish 1 - "+e.getSideDish1Option()
					+"\nSide Dish 2 - "+e.getSideDish2Option()
					+"\nDessert - "+e.getDessertOption()
					+"\nNumber of Guest: "+e.getNumOfGuest()
					+"\nThis is a large event. Price per Guest:"+e.getPricePerGuest()
					+"\nTotal Price: "+e.getPrice());
		else
			System.out.println(
					"\nEvent Number: "+e.getEventNumber()
					+"\nContact phone number: "+e.getPhoneNum()
					+"\nEvent Type: "+e.getEventType()
					+"\nDinner choice: "
					+"\nEntree - "+e.getEntreeOption()
					+"\nSide Dish 1 - "+e.getSideDish1Option()
					+"\nSide Dish 2 - "+e.getSideDish2Option()
					+"\nDessert - "+e.getDessertOption()
					+"\nNumber of Guest: "+e.getNumOfGuest()
					+"\nThis is a small event. Price per Guest:"+e.getPricePerGuest()
					+"\nTotal Price: "+e.getPrice());
			
	}
	public static void printAllObjects(DinnerEvent [] e,Employee [] emps)
	{
		carlysBanner(); 
		/*
		Print all the objects
		*/
		for(int i=0;i<e.length;i++)
		{
			eventDetails(e[i]);
			System.out.println();
		
			empDetails(emps);
		}
	}
	public static void carlysBanner()
	{
		/*
		print the banner
		*/
		System.out.println();
		for(int i=0;i<47;i++)
		{
			System.out.print("*");
		}
		System.out.println("\n*Carly's makes the food that makes it a party.*");
		for(int i=0;i<47;i++)
		{
			System.out.print("*");
		}
	}
	public static int entree()
	{	
		Scanner entreeScanner = new Scanner(System.in);
		int entree=0;
		boolean repeat = true;
		
		
		while(repeat)
		{
			try {
				repeat=false;
				do {
					System.out.println("Please enter an entree number: ");	
					entree = entreeScanner.nextInt();
					
					if(entree<1||entree>5){
						System.out.println("\n\n[ERROR] Please enter a valid number!!! ");}
				}while(entree<1||entree>5);
					
				 
			}catch(InputMismatchException e)
			{
				System.out.println("[ERROR] Please enter a numerical value!!!");
				repeat=true;
				entreeScanner.nextLine();
			}
		}
		
		return entree;
		
		
	}
	public static int sideDish()
	{
		Scanner sideDish1Scanner = new Scanner(System.in);
		int sideDish=0;
		boolean repeat = true;
		
		while(repeat)
		{
			try {
				repeat=false;
				do {
					System.out.println("Please enter a side dish number: ");	
					sideDish = sideDish1Scanner.nextInt();
					
					if(sideDish<1||sideDish>8){
						System.out.println("\n\n[ERROR] Please enter a valid number!!! ");}
				}while(sideDish<1||sideDish>8);
					
				 
			}catch(InputMismatchException e)
			{
				System.out.println("[ERROR] Please enter a numerical value!!!");
				repeat=true;
				sideDish1Scanner.nextLine();
			}
		}
		return sideDish;
	}

	public static int dessert()
	{	
		Scanner dessertScanner = new Scanner(System.in);
		int dessert=0;
		boolean repeat=true;
		
		
		while(repeat)
		{
			try {
				repeat=false;
				do {
					System.out.println("Please enter a dessert number: ");	
					dessert = dessertScanner.nextInt();
					
					if(dessert<1||dessert>7){
						System.out.println("\n\n[ERROR] Please enter a valid number!!! ");}
				}while(dessert<1||dessert>7);
				 
			}catch(InputMismatchException e)
			{
				System.out.println("[ERROR] Please enter a numerical value!!!");
				repeat=true;
				dessertScanner.nextLine();
			}
		}
		return dessert;
	}
	
	public static int guestNum()
	{
		Scanner guestNumScanner = new Scanner(System.in);
		boolean repeat = true;
		int guestNum=0;
		
			while(repeat)
			{
				try {
					repeat=false;
					do
					{		
						System.out.println("Please enter the guest number: ");
						guestNum = guestNumScanner.nextInt();
						if(guestNum<5||guestNum>100)
						{
						System.out.println("[ERROR!!!]Number of guest must be between 5-100\n");	
						}
								
					}while(guestNum<5||guestNum>100);
						
					 
				}catch(InputMismatchException e)
				{
					System.out.println("[ERROR] Please enter a numerical value!!!");
					repeat=true;
					guestNumScanner.nextLine();
				}
			}
			
		
		return guestNum;	
	}
	
	
	public static String eventNum()
	{
		Scanner eventNumScanner = new Scanner(System.in);
		String eventNum;
		
		System.out.println("Please enter the event number for EVENT: ");
		eventNum = eventNumScanner.nextLine();
		return eventNum;
	}
	public static String phoneNum()
	{
		Scanner phoneNumScanner = new Scanner(System.in);
		String phoneNum;
		
		System.out.println("Please enter the phone Number: ");
		phoneNum = phoneNumScanner.nextLine();
		return phoneNum;
	}
	public static int eventType()
	{
		Scanner eventTypeScanner = new Scanner(System.in);
		int eventType=0;
		boolean repeat = true;
		
		while(repeat)
		{
			try {
				repeat=false;
				
				
				System.out.println("Please enter the event type of the EVENT {1: wedding, 2: baptism, 3: birthday, 4: corporate, 5: other}: ");
				eventType = eventTypeScanner.nextInt();
				
				if(eventType<=0||eventType>=6)
				{
					throw new IllegalArgumentException();
				}
			}catch(InputMismatchException e)
			{
				System.out.println("[ERROR] Please enter a number between 1-5!!!");
				repeat=true;
				eventTypeScanner.nextLine();
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("[ERROR] Please enter a number between 1-5!!!");
				repeat=true;
				eventTypeScanner.nextLine();
			}
		}
		return eventType;
	}
	public static Employee getWaitStaff()
	{
		Scanner waitStaffScanner = new Scanner(System.in);
		String iD;
		String firstName;
		String lastName;
		double payRate;
		boolean repeat=true;
		Employee staff = new Waitstaff(); 
		
		
			System.out.println("Enter the waitstaff employee ID: ");
			iD=waitStaffScanner.nextLine();
			staff.setIdNum(iD);
			
			System.out.println("Enter waitstaff first name: ");
			firstName=waitStaffScanner.nextLine();
			staff.setFirstName(firstName);
			
			System.out.println("Enter waitstaff last name: ");
			lastName=waitStaffScanner.nextLine();
			staff.setLastName(lastName);
			
			
			while(repeat)
			{
				try {
					repeat=false;
					System.out.println("Enter waitstaff pay rate: ");
					payRate=waitStaffScanner.nextDouble();
					staff.setPayRate(payRate);
					 
				}catch(InputMismatchException e)
				{
					System.out.println("[ERROR] Please enter a numerical value!!!");
					repeat=true;
					waitStaffScanner.nextLine();
				}
			}
			staff.setJobTitle();
			
			return staff;
			
	}
	public static Employee getBartender()
	{
		Scanner bartenderScanner = new Scanner(System.in);
		String iD;
		String firstName;
		String lastName;
		double payRate;
		boolean repeat=true;
		Employee staff = new Bartender(); 
		
		
			System.out.println("Enter the bartender employee ID: ");
			iD=bartenderScanner.nextLine();
			staff.setIdNum(iD);
			
			System.out.println("Enter bartender first name: ");
			firstName=bartenderScanner.nextLine();
			staff.setFirstName(firstName);
			
			System.out.println("Enter bartender last name: ");
			lastName=bartenderScanner.nextLine();
			staff.setLastName(lastName);
			
			while(repeat)
			{
				try {
					repeat=false;
					System.out.println("Enter bartender pay rate: ");
					payRate=bartenderScanner.nextDouble();
					staff.setPayRate(payRate);
					 
				}catch(InputMismatchException e)
				{
					System.out.println("[ERROR] Please enter a numerical value!!!");
					repeat=true;
					bartenderScanner.nextLine();
				}
			}
			
			staff.setJobTitle();
			
			return staff;
			
	}public static Employee getCoordinator()
	{
		Scanner coordinatorScanner = new Scanner(System.in);
		String iD;
		String firstName;
		String lastName;
		double payRate;
		boolean repeat=true;
		Employee staff = new Coordinator(); 
		
		
			System.out.println("Enterthe coordinator employee ID: ");
			iD=coordinatorScanner.nextLine();
			staff.setIdNum(iD);
			
			System.out.println("Enter coordinator first name: ");
			firstName=coordinatorScanner.nextLine();
			staff.setFirstName(firstName);
			
			System.out.println("Enter coordinator last name: ");
			lastName=coordinatorScanner.nextLine();
			staff.setLastName(lastName);
						
			while(repeat)
			{
				try {
					repeat=false;
					System.out.println("Enter coordinator pay rate: ");
					payRate=coordinatorScanner.nextDouble();
					staff.setPayRate(payRate);
					 
				}catch(InputMismatchException e)
				{
					System.out.println("[ERROR] Please enter a numerical value!!!");
					repeat=true;
					coordinatorScanner.nextLine();
				}
			}		
			staff.setJobTitle();
			return staff;		
	}
	public static Employee[] getEmps(int guestNum)
	{
		int index=0;
		int waitStaff=guestNum/10+1;
		int bartender=guestNum/25+1;
		Employee[] emps= new Employee[15];
		
		for(int i=0;i<waitStaff;i++)
		{
			emps[index++]=getWaitStaff();
		}
		for(int i=0;i<bartender;i++)
		{
			emps[index++]=getBartender();
		}
		emps[index++]=getCoordinator();
		
		return emps;
		
	}
	public static void empDetails(Employee [] emps)
	{
		try {
			
			System.out.println("The staff includes ");
			
			for (int i=0;i<emps.length-1;i++)
			{
				System.out.println(
								emps[i].getJobTitle()+" "
								+emps[i].getIdNum()+" "
								+emps[i].getFirstName()+" "
								+emps[i].getLastName()+" hourly rate is  $"
								+emps[i].getPayRate());
			}
		}
		catch(NullPointerException e) {}		
		
		
		
	}
	
	

}
