package ifpe.tads.mmps.projeto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifpe.tads.mmps.projeto.modelo.Musica;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 
import java.util.List;
 
@Controller
@RequestMapping("/")
public class MusicaController {
      
      private MusicaRepository musicaRepository;
 
      @Autowired
      public MusicaController( MusicaRepository musicaRepository) {
            this.musicaRepository = musicaRepository;
      }
 
      @RequestMapping(value = "/{autor}", method = RequestMethod.GET)
      public String listaMusicas(@PathVariable("autor") String autor, Model model) {
            List<Musica> listaMusicas = musicaRepository.findByAutor(autor);
            if (listaMusicas != null) {
                  model.addAttribute("Musicas", listaMusicas);
            }
            return "listaMusicas";
      }
 
      @RequestMapping(value = "/{autor}", method = RequestMethod.POST)
      public String adicionaLivroAutor(@PathVariable("autor") String autor, Livro livro) {
            livro.setAutor(autor);
            musicaRepository.save(livro);
            return "redirect:/{autor}";
      }
}