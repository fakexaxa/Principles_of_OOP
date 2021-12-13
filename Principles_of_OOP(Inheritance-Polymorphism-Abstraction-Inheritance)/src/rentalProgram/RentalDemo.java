/*
		RYNN ARRIOLA
		UNIT 12 CASE PROBLEM PART 2
*/

package rentalProgram;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RentalDemo {

public static void main(String[] args) 
{
		
		
		Rental rental[]=new Rental[4]; // rental objects
		
		int equipmentType;
		int numOfMinutes;
		String phoneNum;
		String contractNum;
		
		
		
		
		for (int x=0;x<rental.length;x++)
		{
			/*
			Ask user to input values for each rentals
			*/
			contractNum=contractNum();
			numOfMinutes=numOfMinutes();
			phoneNum=phoneNum();
			equipmentType=equipmentType();
				
				
					/*
					store all the values in each object
					*/
			rental[x]=new Rental(contractNum,numOfMinutes,phoneNum,equipmentType);
			
		}
		
		
		/*
		print all details for each object
		*/
		
		
		printAllObjects(rental);
		
		/*
		-do while loop so I can get the users input on what type of sorting they want
		-used method for each sorting methods so the program is easy to understand
		*/
			
			
}
		
	
	 				
	public static void rentalDetails(Rental r)
	{
		
		/*
		this is a method to print all the details of the rentals
	
		get all the values using the get method from the class of Rentals()
		*/
		System.out.println("\nContract number: "+r.getContractNumber()
		+"\nPhone Number: "+r.getPhoneNum()
		+"\nEquipment Name: "+r.getEquipment().getEquipmentName()
		+"\n"+r.getEquipment().lessonPolicy()
		+"\nAdditional Equipment + lesson fee: "+r.getEquipment().getFee()
		+"\nRental time: "+r.getrentalHours() + " hours and "+ r.getnumberOfMinutes()%Rental.MINUTES + " minutes"
		+"\nBase price: $"+r.getPrice()
		+"\nTotal rental: "+ (r.getPrice()+r.getEquipment().getFee()));
		
	}
	public static void printAllObjects(Rental [] r)
	{
		sammysBanner(); 
		
		/*
		print all the objects
		*/
		for(int i=0;i<r.length;i++)
		{
			rentalDetails(r[i]);
			System.out.println();
		}
	}
	public static void sammysBanner()
	{
		/*
		print the banner
		*/
		System.out.println();
		for(int i=0;i<36;i++)
		{
			System.out.print("S");
		}
		System.out.println("\nS Sammy's makes it fun in the sun. S");
		for(int i=0;i<36;i++)
		{
			System.out.print("S");
		}
		System.out.println();
	}
	public static String contractNum()
	{
		Scanner contractNumScanner = new Scanner(System.in);
		String contractNum;
		
		System.out.println("Please enter the contract number: ");
		contractNum = contractNumScanner.nextLine();
		return contractNum;
	}
	public static int numOfMinutes()
	{
		Scanner NumOfMinutesScanner = new Scanner(System.in);
		int numOfMinutes=0;
		boolean repeat=true;
		
		while(repeat)
		{
			try {
				repeat=false;
				do 
				{
					System.out.println("Please enter the number of minutes for Rental: ");
					numOfMinutes=NumOfMinutesScanner.nextInt();
					
					if(numOfMinutes<60||numOfMinutes>7200)
					{
						System.out.println("\n\n[ERROR!!!]Number of minutes must be between 60-7200\n");
					}
				}while(numOfMinutes<60||numOfMinutes>7200);
					
				 
			}catch(InputMismatchException e)
			{
				System.out.println("[ERROR] Please enter a numerical value!!!");
				repeat=true;
				NumOfMinutesScanner.nextLine();
			}
		}
		
		return numOfMinutes;
	}
	public static String phoneNum()
	{
		Scanner phoneNumScanner = new Scanner(System.in);
		String phoneNum;
		
		System.out.println("Please enter the phone Number: ");
		phoneNum = phoneNumScanner.nextLine();
		return phoneNum;
	}
	public static int equipmentType()
	{
		Scanner equipTypeScanner = new Scanner(System.in);
		int equipType=0;
		boolean repeat =true;
		
		while(repeat)
		{
			try {
				repeat=false;
			
				
				System.out.println("Please enter the equipment type of the RENTAL {1: personal watercraft, 2: pontoon boat, 3: rowboat, 4: canoe, 5: kayak, 6: beach chair, 7: umbrella, 8: other}: ");
				equipType = equipTypeScanner.nextInt();
				
				if(equipType<=0||equipType>=9)
				{
					throw new IllegalArgumentException();
				}
				 		
			}catch(InputMismatchException e)
			{
				System.out.println("[ERROR] Please enter a number between 1-8!!!");
				repeat=true;
				equipTypeScanner.nextLine();
			}
			catch(IllegalArgumentException e)
			{
				System.out.println("[ERROR] Please enter a number between 1-8!!!");
				repeat=true;
				equipTypeScanner.nextLine();
			}
		}	
		return equipType;
	}

}
