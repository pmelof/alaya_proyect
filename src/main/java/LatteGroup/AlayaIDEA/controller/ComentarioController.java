package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Comentario;
import LatteGroup.AlayaIDEA.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/rest/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping("")
    public List<Comentario> getAll()
    {
        return comentarioRepository.findAll();
    }

    /* CREATE */
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Comentario comentario)
    {
        comentarioRepository.save(comentario);
    }

    /* SHOW (READ) */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Comentario show(@PathVariable String id)
    {
        return this.comentarioRepository.findComentarioById(id);
    }

    /* UPDATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable ("id") String id, @RequestBody Comentario comentario)
    {
        if (comentarioRepository.findComentarioByUsuario(comentario.getUsuario()) == null)
        {
            Comentario actualizarComentario = comentarioRepository.findComentarioById(id);
            actualizarComentario.setIdea(comentario.getIdea());
            actualizarComentario.setTexto(comentario.getTexto());
            actualizarComentario.setUsuario(comentario.getUsuario());

            this.comentarioRepository.save(actualizarComentario);
        }
    }

    /* DELETE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable ("id") String id)
    {
        Comentario comentario = comentarioRepository.findComentarioById(id);
        comentarioRepository.delete(comentario);
    }


}
