package ejemplo;

public class Laptop implements Campo {

	public String name() {
		return "Laptop: " +price();
	}

	public double price() {
		return 400.00;
	}

}
