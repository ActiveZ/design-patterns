package factory;

import factory.model.Commander;
import factory.model.Human;
import factory.model.Medic;
import factory.model.Soldier;

public class HumanFactory {
	
	public static Human createUnit(TypeUnit type) {
		switch (type) {
		case SOLDIER: {
			return new Soldier();
		}
		case COMMANDER:{
			return new Commander();
		}
		case MEDIC:{
			return new Medic();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

}
