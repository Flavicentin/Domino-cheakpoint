import java.util.Arrays;
import java.util.Random;


public class Domino {
	private Pedra[] pedras;
	private int topo = 0;

	public Domino() {

		this.pedras = new Pedra[6];
		
		int cont = 0;
		for (int i = 6; i >= 0; i--) {
			for ( int j = 0; j <= 6 - cont; j++) {
				System.out.println(i + " " + j);
				pedras[cont] = new Pedra(i, j);
			}
			cont++;
		}
	}

	public void imprime() {
		for (Pedra p : pedras) {
			System.out.println(p);
		}
	}
	
	public void mistura() {
		Random r = new Random();
		for(int i = 0; i < 200; i++) {
			int x = r.nextInt(28);
			int y = r.nextInt(28);
			Pedra aux = pedras[x];
			pedras[x] = pedras[y];
			pedras[y] = aux;
		}
	}
	
	public Pedra comprar() {
		if (topo >= pedras.length)
			return null;
		else
			return pedras[topo++];
	}

	public static void main(String[] args) {
		Domino mao = new Domino();
		mao.imprime();
	}
}
