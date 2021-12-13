package rentalProgram;


public class EquipmentWithoutLesson extends Equipment {

	public EquipmentWithoutLesson(int equipmentType) {
		super(equipmentType);
		
		setEquipmentType(equipmentType);
		setFee(equipmentType);
		setEquipmentName(equipmentType);
		
	}

	@Override
	public String lessonPolicy() {
		// TODO Auto-generated method stub
		return "This rental does not require lesson";
	}

}
