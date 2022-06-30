package command;

public class TurnOnLightCommand extends Command {

	public TurnOnLightCommand(Light light) {
		super(light);
	}

	@Override
	public void execute() {
		light.turnOn();
	}

}
