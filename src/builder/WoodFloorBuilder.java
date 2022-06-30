package builder;

import builder.model.Floor;
import builder.model.WoodFloor;

public class WoodFloorBuilder implements FloorBuilder {

	@Override
	public Floor buildFloor() {
		// ici normalement c'est complexe...
		return new WoodFloor();
	}

}
