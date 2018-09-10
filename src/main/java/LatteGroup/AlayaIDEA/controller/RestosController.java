package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Idea;
import LatteGroup.AlayaIDEA.document.Reto;
import LatteGroup.AlayaIDEA.repository.RetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/retos")
public class RestosController {

    @Autowired
    private RetoRepository retosRepository;

    @GetMapping("/all")
    public List<Reto>  getAll()
    {
        return retosRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Reto reto)
    {
        retosRepository.save(reto);
    }

    @RequestMapping(value = "/add/idea", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    public Reto addIdea(@RequestParam ("id") Integer id, @RequestBody Idea idea )
    {
        Reto reto = retosRepository.findOne(id);
        List<Idea> nuevaLista = new ArrayList<>();
        nuevaLista = reto.getIdeas();
        nuevaLista.add(idea);

        return  retosRepository.save(reto);
    }

}
