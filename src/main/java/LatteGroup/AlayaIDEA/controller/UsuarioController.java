package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Usuario;
import LatteGroup.AlayaIDEA.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;


    /* INDEX */
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("")
    public List<Usuario> index()
    {
        return usuarioRepository.findAll();
    }

    /* CREATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Usuario usuario)
    {
        if (usuarioRepository.findUsuarioByNombre(usuario.getNombre()) == null)
        {
            usuarioRepository.save(usuario);
        }
    }

    /* SHOW (READ) */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Usuario show(@PathVariable String id)
    {
        System.out.printf(this.usuarioRepository.findUsuarioById(id).getNombre());
        return this.usuarioRepository.findUsuarioById(id);
    }

    /* UPDATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Usuario usuario)
    {
        usuarioRepository.save(usuario);
    }




}
