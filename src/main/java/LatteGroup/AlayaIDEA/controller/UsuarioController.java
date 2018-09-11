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
        return this.usuarioRepository.findUsuarioById(id);
    }

    /* UPDATE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@PathVariable ("id") String id, @RequestBody Usuario usuario)
    {
        if (usuarioRepository.findUsuarioByNombre(usuario.getNombre()) == null)
        {
            Usuario actualizarUsuario = usuarioRepository.findUsuarioById(id);
            actualizarUsuario.setNombre(usuario.getNombre());
            actualizarUsuario.setRol(usuario.getRol());
            actualizarUsuario.setRetos(usuario.getRetos());
            actualizarUsuario.setIdeas(usuario.getIdeas());

            this.usuarioRepository.save(actualizarUsuario);
            //return "Usuario: "+actualizarUsuario.getId()+" actualizado";
        }
        //return "El nombre de usuario se encuentra en uso";
    }

    /* DELETE */
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable ("id") String id)
    {
        Usuario usuario = usuarioRepository.findUsuarioById(id);
        usuarioRepository.delete(usuario);
    }
}
