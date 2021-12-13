package rentalProgram;

abstract class Equipment {

	private int equipmentType;
	private String equipmentName;
	private double fee;
	
	final static String [] equipmentTypeOption= {"personal watercraftski", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella"," other"};
	final int [] equipmentCharges= {50, 40, 15, 12, 10, 2, 1, 0};


	public Equipment(int equipmentType)
	{	
		setEquipmentType(equipmentType);
	}
	
	public abstract String lessonPolicy();
	
	public int getEquipmentType() {
		return equipmentType;
	}


	public void setEquipmentType(int equipmentType) {
		
			this.equipmentType=equipmentType;
		
	}


	public String getEquipmentName() {
		return equipmentName;
	}


	public void setEquipmentName(int equipmentType) {
		
		this.equipmentName = equipmentTypeOption[equipmentType];
	}


	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
