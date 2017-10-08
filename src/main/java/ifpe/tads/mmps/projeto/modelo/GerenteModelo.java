package ifpe.tads.mmps.projeto.modelo;

import java.util.Collection;

public class GerenteModelo {

	public List<Musica> pegarMusica(String nome, boolean ProcurarTudo)
	{
		Musica musica = new Musica();
		Collection<Musica> lista = new Collection<Musica>();
		
		
		lista = musica.getMusica(nome);
		
		if(lista == null)
			if(ProcurarTudo == true)
			pegarArtista(nome, ProcurarTudo);
		
		
			return lista;
	}
	
	public Artista pegarArtista(String nome, boolean ProcurarTudo)
	{
		Artista artista = new Artista();
		Collection<Artista> lista = new Collection<Artista>();
		
		
		lista = artista.getArtista(nome);
		
		if(lista == null)
			if(ProcurarTudo == true)
			pegarAlbum(nome, ProcurarTudo);
		
		
			return lista;
	}

	public Album pegarAlbum(String nome, boolean ProcurarTudo) {
		
		Album album = new Album();
		Collection<Album> lista = new Collection<Album>();
		
		
		lista = album.getAlbum(nome);
		
		if(lista == null)
			if(ProcurarTudo == true)
			return null;
		
			return lista;
		
	}
	
	
}
