package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Comentario;
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

    @GetMapping("/all")
    public List<Comentario> getAll()
    {
        return comentariosRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Comentario comentarios)
    {
        comentariosRepository.save(comentarios);
    }
}
