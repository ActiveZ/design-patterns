package state;

public class Vibration implements MobileAlert {

	@Override
	public void alert(AlertContext ctx) {
		ctx.notify("BBBBZZZZZZZ    BBBBZZZZZZ    BBBBZZZZZ");
	}

}
