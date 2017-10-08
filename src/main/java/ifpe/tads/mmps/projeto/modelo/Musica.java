package ifpe.tads.mmps.projeto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Musica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(name="titulo", nullable=false)
	private String nome;
	@Column(name="titulo", nullable=false)
	private String letra;
	@Column(name="titulo", nullable=false)
	private long idArtista;
	@Column(name="titulo", nullable=false)
	private long idAlbum;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getLetra() {
		return letra;
	}
	
	public void setLetra(String letra) {
		this.letra = letra;
	}
	
	public long getIdArtista() {
		return idArtista;
	}
	
	public void setIdArtista(long idArtista) {
		this.idArtista = idArtista;
	}
	
	public long getIdAlbum() {
		return idAlbum;
	}
	
	public void setIdAlbum(long idAlbum) {
		this.idAlbum = idAlbum;
	}

	
}
