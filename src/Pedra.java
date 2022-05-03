
public class Pedra {
	private int ladoA;
	private int ladoB;
	
	public Pedra (int ladoA, int ladoB) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public int getLadoA() {
		return ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	@Override
	public String toString() {
		return ladoA + " " + ladoB;
	}
	
	
}
