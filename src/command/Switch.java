package command;

public class Switch {
	private Command turnOnCommand;
	private Command turnOffCommand;
	
	public Switch(Command turnOnCommand, Command turnOffCommand) {
		super();
		this.turnOnCommand = turnOnCommand;
		this.turnOffCommand = turnOffCommand;
	}
	public void flipUp() {
		turnOnCommand.execute();
	}
	public void flipDown() {
		turnOffCommand.execute();
	}
}
