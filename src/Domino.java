
public class Domino {
	private Pedra[][] pedras;

	public Domino() {
		int contador = 0;
		this.pedras = new Pedra[0][26];
		for (int x = 6; x >= 0; x--) {
			for (int y = 0; y <= 6 - contador; y++) {
				System.out.println(pedras[x][y]);
				pedras[x][y] = new Pedra(x, y);
			}
			contador++;
		}
	}
	
	public void imprime() {
		for(Pedra[] c : pedras) {
			System.out.println(c);
		}	
	}
}
