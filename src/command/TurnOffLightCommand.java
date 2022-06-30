package command;

public class TurnOffLightCommand extends Command {
	

	public TurnOffLightCommand(Light light) {
		super(light);
	}

	@Override
	public void execute() {
		light.turnOff();
	}

}
