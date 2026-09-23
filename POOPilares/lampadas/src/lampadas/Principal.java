package lampadas;

public class Principal {

	public static void main(String[] args) {
	
	Lampada l1 = new Lampada();
	l1.setModelo("A1");
	l1.setConsumo(1.2);
	l1.setCor("Branco");
	l1.desligar();
	
	Lampada l2 = new Lampada();
	l2.setModelo("A2");
	l2.setConsumo(1.5);
	l2.setCor("Amarelo");
	l2.ligar();
	
	l1.exibiDados();
	l1.mostrarEstado();
	l2.exibiDados();
	l2.mostrarEstado();
	
	System.out.println();
	l1.ligar();
	l1.mostrarEstado();
	l1.desligar();
	l1.mostrarEstado();
	l1.ligar();
	l1.mostrarEstado();
	
	}

}
