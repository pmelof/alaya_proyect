package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Comentarios;
import LatteGroup.AlayaIDEA.document.Ideas;
import LatteGroup.AlayaIDEA.repository.IdeasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/ideas")
public class IdeasController {

    @Autowired
    private IdeasRepository ideasRepository;

    @GetMapping("/all")
    public List<Ideas> getAll()
    {
        return ideasRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Ideas idea)
    {
        ideasRepository.save(idea);
    }

    @RequestMapping(value = "/like", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    public Ideas sumCounterLike(@RequestParam ("id") Integer id)
    {
        Ideas idea = ideasRepository.findOne(id);
        Integer aux = idea.getCounterLike() + 1;
        idea.setCounterLike(aux);

        return  ideasRepository.save(idea);
    }

    @RequestMapping(value = "/dislike", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    public Ideas disCounterLike(@RequestParam ("id") Integer id)
    {
        Ideas idea = ideasRepository.findOne(id);
        Integer aux = idea.getCounterLike() - 1;
        idea.setCounterLike(aux);

        return  ideasRepository.save(idea);
    }

    @RequestMapping(value = "/update/state", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id", "state"})
    public Ideas UpdateState(@RequestParam ("id") Integer id, @RequestParam ("state") Integer newState)
    {
        Ideas idea = ideasRepository.findOne(id);
        idea.setState(newState);

        return  ideasRepository.save(idea);
    }

    @RequestMapping(value = "/add/comentario", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})    //id de idea
    public Ideas addComentario(@RequestParam ("id") Integer id, @RequestBody Comentarios comentario )
    {
        Ideas idea = ideasRepository.findOne(id);
        List<Comentarios> nuevaLista = new ArrayList<>();
        nuevaLista = idea.getComentarios();
        nuevaLista.add(comentario);

        return  ideasRepository.save(idea);
    }

    @RequestMapping(value = "/idea", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})    //id de idea
    public Ideas idea(@RequestParam ("id") Integer id)
    {
        Ideas idea = ideasRepository.findOne(id);

        return  idea;
    }
}
