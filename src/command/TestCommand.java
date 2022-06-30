package command;

public class TestCommand {

	public static void main(String[] args) {
		Light light = new Light();
		Command turnOnCommand = new TurnOnLightCommand(light);
		Command turnOffCommand = new TurnOffLightCommand(light);
		Switch swith = new Switch(turnOnCommand, turnOffCommand);
		
		//allumer
		swith.flipUp();
		
		//éteindre
		swith.flipDown();
		
	}

}
