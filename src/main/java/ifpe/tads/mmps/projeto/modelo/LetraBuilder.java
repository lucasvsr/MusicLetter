package ifpe.tads.mmps.projeto.modelo;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.List;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;


/*
 * Essa classe vai ficar responsável de pegar as letras no Vagalume
 * */

public class LetraBuilder {
	
	private static final String chave = "3715f678f1c800db7fc43dfe07e21dbc";
	
	public String getLetra(List<Artista> artista, String musica) throws IOException, ParseException {
		
		String letra;
		URL url = new URL("https://api.vagalume.com.br/search.php"+"?art="+artista.get(0).getNome()+"&mus="+musica+"&apikey={"+chave+"}");
		Reader leitor = new InputStreamReader(url.openStream());
		
		JSONParser parser = new JSONParser(0);
		JSONObject jsonObjeto = (JSONObject) parser.parse(leitor);
		
		letra = jsonObjeto.toJSONString();
		
		return letra;
		
	}

}
