package state;

public class Silent implements MobileAlert {

	@Override
	public void alert(AlertContext ctx) {
		ctx.notify("le silence est d'or...");
	}

}
