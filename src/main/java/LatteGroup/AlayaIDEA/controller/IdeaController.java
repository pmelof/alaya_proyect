package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Idea;
import LatteGroup.AlayaIDEA.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/ideas")
public class IdeaController {

    @Autowired
    private IdeaRepository ideaRepository;

    /* INDEX */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public List<Idea> index()
    {
        return ideaRepository.findAll();
    }

    /* CREATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Idea idea)
    {
        if (ideaRepository.findIdeaByUsuario(idea.getUsuario()) == null)
        {
            ideaRepository.save(idea);
        }
    }

    /* SHOW (READ) */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Idea show(@PathVariable String id)
    {
        return this.ideaRepository.findIdeaById(id);
    }

    /* UPDATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable ("id") String id, @RequestBody Idea idea)
    {
        if (ideaRepository.findIdeaByUsuario(idea.getUsuario()) == null)
        {
            Idea actualizarIdea = ideaRepository.findIdeaById(id);
            actualizarIdea.setTitulo(idea.getTitulo());
            actualizarIdea.setTexto(idea.getTexto());
            actualizarIdea.setContadorMeGusta(idea.getContadorMeGusta());
            actualizarIdea.setEstado(idea.getEstado());
            actualizarIdea.setUsuario(idea.getUsuario());
            actualizarIdea.setReto(idea.getReto());
            actualizarIdea.setComentarios(idea.getComentarios());

            this.ideaRepository.save(actualizarIdea);
        }
    }

    /* DELETE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable ("id") String id)
    {
        Idea idea = ideaRepository.findIdeaById(id);
        ideaRepository.delete(idea);
    }
}
