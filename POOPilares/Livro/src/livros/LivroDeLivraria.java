package livros;

public class LivroDeLivraria extends Livro {
	
	private double preco;
	private int qtEstoque;
	
	
	
	public LivroDeLivraria(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao,double preco, int qtEstoque) {
		super(titulo, autor, editora, numeroPaginas, anoPublicacao);
		this.preco = preco;
		this.qtEstoque = qtEstoque;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtEstoque() {
		return qtEstoque;
	}
	public void setQtEstoque(int qtEstoque) {
		this.qtEstoque = qtEstoque;
	}
	
	@Override
	public void exibirDados() {
		System.out.printf("Titulo: %s%n Autor: %s%n Editora: %s%n Numero de paginas %d%n Ano de publicação: %d%n Preço: %.2f%n Estoque: %d%n", getTitulo(), getAutor(), getEditora(), getNumeroPaginas(),getAnoPublicacao(),getPreco(), getQtEstoque());
	}
	

}
