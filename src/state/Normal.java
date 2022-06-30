package state;

public class Normal implements MobileAlert {

	@Override
	public void alert(AlertContext ctx) {
		ctx.notify("Bip Bip Bip Bip Bip");
	}

}
