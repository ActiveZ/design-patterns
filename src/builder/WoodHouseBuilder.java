package builder;

import builder.model.House;
import builder.model.WoodHouse;

public class WoodHouseBuilder implements HouseBuilder {

	@Override
	public House constructHouse() {
		RoofBuilder roofBuilder = new WoodRoofBuilder();
		FloorBuilder floorBuilder = new WoodFloorBuilder();
		WallBuilder wallBuilder = new WoodWallBuilder();
		House house = new WoodHouse();
		house.setFloor(floorBuilder.buildFloor());
		house.getWalls().add(wallBuilder.buildWall());
		house.getWalls().add(wallBuilder.buildWall());
		house.getWalls().add(wallBuilder.buildWall());
		house.getWalls().add(wallBuilder.buildWall());
		house.setRoof(roofBuilder.buildRoof());		
		return house;
	}

}
