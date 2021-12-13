package rentalProgram;


public class EquipmentWithLesson extends Equipment {

	public EquipmentWithLesson(int equipmentType) {
		super(equipmentType);
		
		setEquipmentType(equipmentType);
		setFee(equipmentType);
		setEquipmentName(equipmentType);
	}

	@Override
	public String lessonPolicy() {
		// TODO Auto-generated method stub
		return "This rental required a lesson for $27";
	}

}
