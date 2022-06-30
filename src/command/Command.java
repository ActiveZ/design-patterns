package command;

public abstract class Command {
	Light light;

	public Command(Light light) {
		super();
		this.light = light;
	}
	
	public abstract void execute();
	

}
