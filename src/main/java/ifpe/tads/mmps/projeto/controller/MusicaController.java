package ifpe.tads.mmps.projeto.controller;

import java.io.IOException;
import java.util.List;

import ifpe.tads.mmps.projeto.modelo.LetraBuilder;
import ifpe.tads.mmps.projeto.modelo.Musica;
import ifpe.tads.mmps.projeto.repositorio.MusicaRepository;
import net.minidev.json.parser.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 
@Controller
@RequestMapping("/")
public class MusicaController {
      
		@Autowired
      private MusicaRepository musicaRepository;
 
      
      public MusicaController( MusicaRepository musicaRepository) {
            this.musicaRepository = musicaRepository;
      }
 
      @RequestMapping(value = "/{musica}", method = RequestMethod.GET)
      public String listaMusicas(@PathVariable("titulo") String titulo, Model model) {
            List<Musica> listaMusicas = musicaRepository.findByTitulo(titulo);
            if (listaMusicas != null) {
                  model.addAttribute("Musicas", listaMusicas);
            }
            return "listaMusicas";
      }
 
      @RequestMapping(value = "/adicionar", method = RequestMethod.POST)
      public String adicionarMusica(Musica musica) throws IOException, ParseException {
    	  	LetraBuilder builder = new LetraBuilder();
    	  
    	  	musica.setLetra(builder.getLetra(musica.getArtistas(), musica.getTitulo()));
            musicaRepository.save(musica);
            return "listaMusicas";
      }
}