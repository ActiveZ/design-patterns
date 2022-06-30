package builder;

import builder.model.Roof;
import builder.model.WoodRoof;

public class WoodRoofBuilder implements RoofBuilder {

	@Override
	public Roof buildRoof() {
		// ici normalement c'est complexe...
		return new WoodRoof();
	}

}
