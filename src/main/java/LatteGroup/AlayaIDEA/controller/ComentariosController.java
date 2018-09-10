package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Comentarios;
import LatteGroup.AlayaIDEA.repository.ComentariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/comentarios")
public class ComentariosController {

    @Autowired
    private ComentariosRepository comentariosRepository;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public List<Comentarios> getAll()
    {
        return comentariosRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Comentarios comentarios)
    {
        comentariosRepository.save(comentarios);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/comentario/{id}", method = RequestMethod.GET)    //id del comentario
    public Comentarios comentario(@PathVariable ("id") Integer id)
    {
        return comentariosRepository.findOne(id);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update/comentario/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Comentarios updateComentario(@PathVariable ("id") Integer id, @RequestBody Comentarios comentario)
    {
        Comentarios newComentario = comentariosRepository.findOne(id);
        newComentario.setTexto(comentario.getTexto());
        newComentario.setAutor(comentario.getAutor());

        return comentariosRepository.save(newComentario);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/comentario/{id}", method = RequestMethod.DELETE)
    public void deleteReto(@PathVariable ("id") Integer id)
    {
        Comentarios comentario = comentariosRepository.findOne(id);
        comentariosRepository.delete(comentario);
    }
}
