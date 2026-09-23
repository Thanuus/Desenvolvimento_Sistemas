package livros;

public class Principal {

	public static void main(String[] args) {
		
	Livro l1 = new Livro("Livro1", "Autor1", "Editora1", 200, 2010 );
	
	
	Livro l2 = new Livro("Livro2", "Autor2", "Editora2", 400, 2015);


	l1.exibirDados();
	System.out.println();
	l2.exibirDados();
	System.out.println();
	
	LivroDeLivraria ll1 = new LivroDeLivraria(l1.getTitulo(), l1.getAutor(), l1.getEditora(), l1.getNumeroPaginas(), l1.getAnoPublicacao(), 150.90, 80);
	ll1.exibirDados();
	
	System.out.println();
	LivroDeLivraria ll2 = new LivroDeLivraria(l2.getTitulo(), l2.getAutor(), l2.getEditora(), l2.getNumeroPaginas(), l2.getAnoPublicacao(), 299.90, 30);
	ll2.exibirDados();
	}
}
