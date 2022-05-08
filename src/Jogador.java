
public class Jogador {

	private static Pedra[] mao;
	private int pontos;
	private int topo;
	private String nome;

	public Jogador(String nome) {
		this.nome = nome;
		this.mao = new Pedra[14];
	}

	public void addPedras(Pedra p) {
		mao[topo] = p;
		topo++;
		System.out.println(p);
	}

	public Pedra joga(int dir, int esq) {
		for (int i = 0; i < 14; i++) {
			Pedra p = mao[i];
			if (p != null) {
				if (p.getLadoA() == dir || p.getLadoA() == esq || p.getLadoB() == dir || p.getLadoB() == esq) {
					mao[i] = null;
					return p;
				}
				i++;
			}
		}
		return null;
	}

	public Pedra getDuplaSena() {
		int i = 0;
		for (Pedra p : mao) {
			if (p != null) {
				if (p.getLadoA() == 6 && p.getLadoB() == 6) {
					System.out.println("Achei a Dupla Sena");
//					mao[i] = null;
					return p;
				}
			}
			i++;
		}
		System.out.println("Não achei a Dupla Sena");
		return null;
	}

	public int getPontuacao() {
		for (Pedra p : mao) {
			if (p != null)
				pontos += p.getLadoA() + p.getLadoB();
		}
		System.out.println(pontos);
		return pontos;
	}

	public static void main(String[] args) {
		Domino d = new Domino();
		Jogador j1 = new Jogador("Pedro");
		j1.addPedras(d.comprar());
		j1.addPedras(d.comprar());
		j1.addPedras(d.comprar());
		j1.addPedras(d.comprar());
		j1.addPedras(d.comprar());
		j1.addPedras(d.comprar());
		j1.getDuplaSena();
	}

}
