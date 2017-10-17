package ifpe.tads.mmps.projeto.modelo;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author leandro
 */
@Entity
@Table(name = "tb_musica")

public class Musica {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Size(max = 20)
	@Column(name = "TXT_TITULO")
	private String titulo;

	@Size(max = 20)
	@Column(name = "TXT_DURACAO")
	private String duracao;

	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CRIACAO")
    private Date dataCriacao;

	@Size(max = 20)
	@Column(name = "TXT_COD_ARTISTA")
	private String codArtista;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "tb_artista", 
    joinColumns = {
        @JoinColumn(name = "ID_MUSICA", nullable = false, updatable = false) 
        },
    inverseJoinColumns = {
    		@JoinColumn(name = "ID_ARTISTA", nullable = false, updatable = false) 
    })
    private List<Artista> artistas;
    
    
    @OneToOne(fetch = FetchType.LAZY , cascade = CascadeType.ALL, optional = false, orphanRemoval = true)
    @JoinColumn(name = "ID_ALBUM" )
    private Album album;
    
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getCodArtista() {
		return codArtista;
	}

	public void setCodArtista(String codArtista) {
		this.codArtista = codArtista;
	}

	public List<Artista> getArtistas() {
		return artistas;
	}

	public void setArtistas(List<Artista> artistas) {
		this.artistas = artistas;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

}
