package LatteGroup.AlayaIDEA.controller;

import LatteGroup.AlayaIDEA.document.Users;
import LatteGroup.AlayaIDEA.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;


    @GetMapping("/all")
    public List<Users> getAll()
    {
        return usersRepository.findAll();
    }

    //create
    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Users user)
    {
        usersRepository.save(user);
    }

}
