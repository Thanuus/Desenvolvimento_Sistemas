package livros;

public class Livro {

	private String titulo;
	private String autor;
	private String editora;
	private int numeroPaginas;
	private int anoPublicacao;
	
	
	
	public Livro(String titulo, String autor, String editora, int numeroPaginas, int anoPublicacao) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numeroPaginas = numeroPaginas;
		this.anoPublicacao = anoPublicacao;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	public void exibirDados() {
		System.out.printf("Titulo: %s%n Autor: %s%n Editora: %s%n Numero de paginas %d%n Ano de publicação: %d%n", titulo, autor, editora, numeroPaginas,anoPublicacao);
	}
}
