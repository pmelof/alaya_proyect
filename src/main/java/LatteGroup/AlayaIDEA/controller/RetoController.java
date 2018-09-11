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
public class RetoController {

    @Autowired
    private RetoRepository retoRepository;

    /* INDEX */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public List<Reto> index()
    {
        return retoRepository.findAll();
    }

    /* CREATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Reto reto)
    {
        if (retoRepository.findRetoByTitulo(reto.getTitulo()) == null)
        {
            retoRepository.save(reto);
        }
    }

    /* SHOW (READ) */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Reto show(@PathVariable String id)
    {
        return this.retoRepository.findRetoById(id);
    }

    /* UPDATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable ("id") String id, @RequestBody Reto reto)
    {
        if (retoRepository.findRetoByTitulo(reto.getTitulo()) == null)
        {
            Reto actualizarReto = retoRepository.findRetoById(id);
            actualizarReto.setTitulo(reto.getTitulo());
            actualizarReto.setTexto(reto.getTexto());
            actualizarReto.setArea(reto.getArea());
            actualizarReto.setIdeas(reto.getIdeas());
            actualizarReto.setUsuario(reto.getUsuario());

            this.retoRepository.save(actualizarReto);
        }
    }

    /* DELETE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable ("id") String id)
    {
        Reto reto = retoRepository.findRetoById(id);
        retoRepository.delete(reto);
    }
}
