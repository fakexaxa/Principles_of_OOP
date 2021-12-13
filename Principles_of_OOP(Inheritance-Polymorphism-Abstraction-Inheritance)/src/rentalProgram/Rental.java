/*
 * Rynn Arriola
 * Unit12 part2
 */

package rentalProgram;

public class Rental
{

	public final static int MINUTES= 60;
	public final static int RENTAL_RATE= 40;
	
	private int rentalHours;
	protected int numOfMinutes;
	private int price;
	protected String contractNumber;
	private String phoneNum;
	private Equipment equipment;

	
	
	public Rental(String contractNumber,int numOfMinutes,String phoneNum)
	{
		setContractNumber(contractNumber);
		setBasePrice(numOfMinutes);
		setPhoneNum(phoneNum);
		
	}
	public Rental(String contractNumber,int numOfMinutes,String phoneNum, int equipmentType)
	{
		setContractNumber(contractNumber);
		setBasePrice(numOfMinutes);
		setPhoneNum(phoneNum);
		
		
		equipmentType=equipmentType-1;

		
		if(equipmentType>=0&&equipmentType<=4)
		{
			equipment= new EquipmentWithLesson(equipmentType);
			
			
			double equipFee= equipment.equipmentCharges[equipmentType];
			
			equipment.setFee(equipFee+27);
			
			
		}
		else if(equipmentType>4&&equipmentType<=8)
		{
			
			equipment= new EquipmentWithoutLesson(equipmentType);
			double equipFee= equipment.equipmentCharges[equipmentType];
			equipment.setFee(equipFee);
			
			
		}
		
		
		
		
	}
	public Rental(String contractNumber,int numOfMinutes, int equipmentType)
	{
		setContractNumber(contractNumber);
		setBasePrice(numOfMinutes);
	
	}
	public Rental()
	{

	}
	
	
	public void setContractNumber(String contractNumber)
	{
char ch1 = contractNumber.charAt(0);
		
		if(contractNumber.length()!=4 ||!Character.isLetter(ch1))
		{
			this.contractNumber="A000";
		}
		else
		{
			char ch2,ch3,ch4;
		
			ch2 = contractNumber.charAt(1);
			ch3 = contractNumber.charAt(2);
			ch4 = contractNumber.charAt(3);
		
		
			if(contractNumber.length()== 4 && Character.isLetter(ch1)&&Character.isDigit(ch2)&&Character.isDigit(ch3)&&Character.isDigit(ch4))
			{
				this.contractNumber=contractNumber.toUpperCase();
			}
			else
			{
				this.contractNumber="A000";
			}
		
		}
	}
	public void setPhoneNum(String phoneNum)
	{
		phoneNum=getOnlyDigits(phoneNum);
			
		if(phoneNum.length()==10)
		{
			
				this.phoneNum=phoneNum;	
		}
		else
		{
			this.phoneNum="0000000000";
		}
		
	}
	public void setBasePrice(int numOfMinutes)
	{
		this.numOfMinutes=numOfMinutes;
		
		calculate(numOfMinutes);
	}
	public String getContractNumber()
	{
		return contractNumber;	
	}
	public int getrentalHours()
	{
		return rentalHours;	
	}
	public int getnumberOfMinutes()
	{
		return numOfMinutes;	
	}
	public int getPrice()
	{
		return price;	
	}
	public String getPhoneNum()
	{
		String phone;
		String start= "(" + phoneNum.substring(0,3)+") ";
		String mid= phoneNum.substring(3,6)+"-";
		String end= phoneNum.substring(6,10);
		
		phone= start + mid + end;
		
		return phone;
	}
	public double calculate(int numOfMinutes)
	{
		int additionalMinutes;
			
			rentalHours = numOfMinutes/MINUTES;
			additionalMinutes = numOfMinutes%MINUTES;
			
			if(additionalMinutes>=40)
			{ 
				price = (rentalHours+1)*RENTAL_RATE;
			}
			else
			{
				price = rentalHours*RENTAL_RATE + additionalMinutes;	
			}
			
			return price;
	}
	
	private String getOnlyDigits(String phoneNum) 
	{
	    StringBuilder builder = new StringBuilder();
	    for (int i = 0; i < phoneNum.length(); i++) {
	        char ch = phoneNum.charAt(i);
	        if (Character.isDigit(ch)) {
	            builder.append(ch);
	        }
	    }
	    return builder.toString();
	}
	public Equipment getEquipment() {
		return equipment;
	}
	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
		
		
	}
	
	
	
	
}
