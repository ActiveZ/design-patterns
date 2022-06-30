package builder.model;

import java.util.ArrayList;
import java.util.List;

public abstract class House {
	
	List<Wall> walls = new ArrayList<>();
	Roof roof;
	Floor floor;
	
	public List<Wall> getWalls(){
		return walls;
	}

	public Roof getRoof() {
		return roof;
	}

	public void setRoof(Roof roof) {
		this.roof = roof;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}
	
	
	
	

}
