package factory;

import factory.model.Commander;
import factory.model.Human;
import factory.model.Soldier;

public class TestHumanFactory {

	public static void main(String[] args) {
		
		Math.random();
		
		
		// si je veux un soldat 
		
		Human soldier = HumanFactory.createUnit(TypeUnit.SOLDIER);
		
		Human commander = HumanFactory.createUnit(TypeUnit.COMMANDER);
		
		Human medic = HumanFactory.createUnit(TypeUnit.MEDIC);
		
		System.out.println(soldier.getType());
		System.out.println(commander.getType());
		System.out.println(medic.getType());
		
		
		
		
		
	}

}
