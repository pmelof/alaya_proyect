package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Users;
import LatteGroup.AlayaIDEA.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(value = "*")
@RestController
//@RequestMapping("/usuarios")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @RequestMapping(value = "/usuarios", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public List<Users> getUsuario(){
        return this.usersRepository.findAll();
    }

    @RequestMapping(value = "/usuarios/create", method = RequestMethod.POST)
    @ResponseBody
    @CrossOrigin
    public Users createUsuario(@RequestBody Users usuario){

        System.out.println("Name: "+usuario.getName());
        return this.usersRepository.save(usuario);
    }

    @RequestMapping(value = "/usuarios/{id}",method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Users getUsuarioById(@PathVariable Integer id){
        return this.usersRepository.findUsuarioById(id);
    }

    @RequestMapping(value = "/usuarios/correo/{correo}", method = RequestMethod.GET)
    @CrossOrigin(origins = "*")
    public Users getUsuarioByCorreo(@PathVariable String correo){
        System.out.println("correo "+correo);
        return this.usersRepository.findUsuarioByCorreo(correo);
    }




}
