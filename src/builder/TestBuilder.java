package builder;

import builder.model.House;
import builder.model.WoodHouse;

public class TestBuilder {

	public static void main(String[] args) {

		//factory
		
		
		HouseBuilder hb = new WoodHouseBuilder();
		House maison = hb.constructHouse();
		
				
	}

}
