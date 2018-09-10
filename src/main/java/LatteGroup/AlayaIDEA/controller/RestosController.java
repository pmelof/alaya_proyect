package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Ideas;
import LatteGroup.AlayaIDEA.document.Retos;
import LatteGroup.AlayaIDEA.repository.RetosRepository;
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
    private RetosRepository retosRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Retos>  getAll()
    {
        return retosRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Retos retos)
    {
        retosRepository.save(retos);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/add/idea", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, params = {"id"})
    public Retos addIdea(@RequestParam ("id") Integer id, @RequestBody Ideas idea )
    {
        Retos reto = retosRepository.findOne(id);
        List<Ideas> nuevaLista = new ArrayList<>();
        nuevaLista = reto.getIdeas();
        nuevaLista.add(idea);

        return  retosRepository.save(reto);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/reto/{id}", method = RequestMethod.GET)    //id de reto
    public Retos reto(@PathVariable ("id") Integer id)
    {
        return retosRepository.findOne(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update/reto/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Retos updateReto(@PathVariable ("id") Integer id, @RequestBody Retos reto)
    {
        Retos newReto = retosRepository.findOne(id);
        newReto.setTitulo(reto.getTitulo());
        newReto.setTexto(reto.getTexto());
        newReto.setArea(reto.getArea());
        newReto.setIdeas(reto.getIdeas());

        return retosRepository.save(newReto);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/reto/{id}", method = RequestMethod.DELETE)
    public void deleteReto(@PathVariable ("id") Integer id)
    {
        Retos reto = retosRepository.findOne(id);
        retosRepository.delete(reto);
    }

}
