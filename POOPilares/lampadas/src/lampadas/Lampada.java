package lampadas;


public class Lampada {
	
	private String modelo;
	private double consumo;
	private String cor;
	private boolean estado;
	
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getConsumo() {
		return consumo;
	}
	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void exibiDados() {
		System.out.printf("Modelo: %s - Consumo: %.2f - Cor: %s%n", modelo, consumo, cor);
	}
	
	public void ligar() {
		estado = true;
	}
	
	public void desligar() {
		estado = false;
	}
	
	public void mostrarEstado() {
		if (estado == true) {
			System.out.println("Lampada ligada");
		} else {
			System.out.println("Lampada desligada");
		}
	}
	
}
