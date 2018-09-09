package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Ideas;
import LatteGroup.AlayaIDEA.document.Retos;
import LatteGroup.AlayaIDEA.repository.RetosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest/retos")
public class RestosController {

    @Autowired
    private RetosRepository retosRepository;

    @GetMapping("/all")
    public List<Retos>  getAll()
    {
        return retosRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Retos retos)
    {
        retosRepository.save(retos);
    }

    @RequestMapping(value = "/add/idea", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    public Retos addIdea(@RequestParam ("id") Integer id, @RequestBody Ideas idea )
    {
        Retos reto = retosRepository.findOne(id);
        List<Ideas> nuevaLista = new ArrayList<>();
        nuevaLista = reto.getIdeas();
        nuevaLista.add(idea);

        return  retosRepository.save(reto);
    }

}
