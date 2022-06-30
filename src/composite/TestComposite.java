package composite;

public class TestComposite {

	public static void main(String[] args) {
		File f = new File("toto.txt");
		Directory d = new Directory("tmp");
		Directory d2 = new Directory("truc");
		Directory d3 = new Directory("bidule");
		d3.add(f);
		d.add(d2);
		d.add(d3);
		System.out.println(d);
	}

}
