package ifpe.tads.mmps.projeto.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifpe.tads.mmps.projeto.modelo.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
	
	List<Artista> findByNome(String artista);

}
