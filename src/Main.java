
public class Main {
	public static void main(String[] args) {
		Domino d = new Domino();
		
		d.mistura();

		Jogador j1 = new Jogador("Roberto");
		Jogador j2 = new Jogador("Eduardo");
		
		int ladoA = 0, ladoB = 0;

		for (int i = 0; i < 14; i++) {
			System.out.print("Jogador 1 \t");
			j1.addPedras(d.comprar());
			if (j1.getDuplaSena() != null) {
				ladoA = 6;
				ladoB = 6;
			}
			System.out.print("Jogador 2 \t");
			j2.addPedras(d.comprar());
			if (j2.getDuplaSena() != null) {
				ladoA = 6;
				ladoB = 6;
			}
			System.out.println(" ");
		}
		
		System.out.println("===========================");
		System.out.println(ladoA + " " + ladoB);
		System.out.println("===========================");
		Pedra p = new Pedra (6, 6);
		
		int i = 0;
		int pontosj1 = 0;
		int pontosj2 = 0;
		while (i < 14)  {
			p = j1.joga(ladoA, ladoB);
			System.out.println(p);
			if (p != null) {
				ladoA = p.getLadoA();
				ladoB = p.getLadoB();
				p = new Pedra (p.getLadoA(), p.getLadoB());
				pontosj1 += ladoA + ladoB;
			}
			
			p = j2.joga(ladoA, ladoB);
			System.out.println(p);
			if (p != null) {
				ladoA = p.getLadoA();
				ladoB = p.getLadoB();
				p = new Pedra (p.getLadoA(), p.getLadoB());
				pontosj2 += ladoA + ladoB;
			}
			i++;
		}
		if (pontosj1 > pontosj2) {
			System.out.println("Jogador 1 Ganhou");
		} else {
			System.out.println("Jogador 2 Ganhou");
		}
		
	}
}
