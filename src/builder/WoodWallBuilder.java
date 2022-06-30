package builder;

import builder.model.Wall;
import builder.model.WoodWall;

public class WoodWallBuilder implements WallBuilder{

	@Override
	public Wall buildWall() {
		//normalement complexité de construction du mur ici...
		
		return new WoodWall();
	}

}
