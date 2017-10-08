package ifpe.tads.mmps.projeto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Artista {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private long id;
	@Column(name="nome", nullable=false)
	private String nome;

}
