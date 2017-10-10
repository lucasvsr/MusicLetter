package ifpe.tads.mmps.projeto.repositorio;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifpe.tads.mmps.projeto.modelo.Musica;

public interface MusicaRepository extends JpaRepository<Musica, Long> {
	
	/**
	 * @param codArtista
	 * @return Lista de musicas
	 */
	List<Musica> findByCodArtista(String cod);
	
	List<Musica> findByTitulo(String titulo);

}
