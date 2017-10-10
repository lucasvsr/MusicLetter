package ifpe.tads.mmps.projeto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifpe.tads.mmps.projeto.modelo.Musica;

public interface MusicLettersApplication extends JpaRepository<Musica, Long> {

	/**
	 * Encontra todos as musicas de um mesmo autor.
	 * 
	 * @param musica
	 * @return lista de Musica
	 */
	List<Musica> findByAutor(String autor);

	/**
	 * Encontra um livro a partir do seu título. Retorna uma lista pois podem
	 * existir mais de um livro com mesmo título.
	 * 
	 * @param titulo
	 * @return lista de livros
	 */
	List<Musica> findByTitulo(String titulo);

	/**
	 * Encontra um livro a partir de seu isbn, como o isbn é único, apenas um livro
	 * pode ser encontrado.
	 * 
	 * @param isbn
	 * @return livro
	 */
	Musica findByIsbn(String isbn);

}