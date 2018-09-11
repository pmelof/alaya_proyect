package LatteGroup.AlayaIDEA.config;

import LatteGroup.AlayaIDEA.document.Comentarios;
import LatteGroup.AlayaIDEA.document.Ideas;
import LatteGroup.AlayaIDEA.document.Retos;
import LatteGroup.AlayaIDEA.document.Users;
import LatteGroup.AlayaIDEA.repository.IdeasRepository;
import LatteGroup.AlayaIDEA.repository.RetosRepository;
import LatteGroup.AlayaIDEA.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@EnableMongoRepositories(basePackageClasses = UsersRepository.class)
@Configuration
public class MongoDBConfig
{

   @Bean
    CommandLineRunner commandLineRunner(UsersRepository usersRepository){
        return  strings -> {
            usersRepository.save(new Users(1, "Paty","paty@example.com", 0));
            usersRepository.save(new Users(2, "Cris","cris@example.com", 0));
            usersRepository.save(new Users(3, "Mauri","mauri@example.com", 0));
            usersRepository.save(new Users(4, "Persona","persona@example.com", 1));
        };
    }

    //@Bean
    /*
    CommandLineRunner commandLineRunner(IdeasRepository ideasRepository)
    {
        Users user1 = new Users(1, "Paty", 0);
        Users user2 = new Users(2, "Fernando", 0);
        Users user3 = new Users(3, "Cris", 1);
        Users user4 = new Users(4, "Mauri", 1);

        Comentarios comentario1 = new Comentarios(1, "Muy buena tu idea, estoy totalmente de acuerdo, te apoyo.", user1);
        Comentarios comentario2 = new Comentarios(2, "Sería bueno que agregaras el área en que va enfocado.", user2);
        Comentarios comentario3 = new Comentarios(3, "No me convence del todo.", user3);
        Comentarios comentario4 = new Comentarios(4, "Escribiste mal retos, pusiste restos.", user4);

        List<Comentarios> listaComentarios = new ArrayList<>();
        listaComentarios.add(comentario1);
        listaComentarios.add(comentario2);
        listaComentarios.add(comentario3);
        listaComentarios.add(comentario4);

        return strings -> {
            ideasRepository.save(new Ideas(1, "Titulo ejemplo 1", "Este texto corresponde al ejemplo 1 de una idea.", 0, 0, listaComentarios));
        };
    }

   //@Bean
    CommandLineRunner commandLineRunner(RetosRepository retosRepository)
    {
        Users user1 = new Users(1, "Paty", 0);
        Users user2 = new Users(2, "Fernando", 0);
        Users user3 = new Users(3, "Cris", 1);
        Users user4 = new Users(4, "Mauri", 1);

        Comentarios comentario1 = new Comentarios(1, "Muy buena tu idea, estoy totalmente de acuerdo, te apoyo.", user1);
        Comentarios comentario2 = new Comentarios(2, "Sería bueno que agregaras el área en que va enfocado.", user2);
        Comentarios comentario3 = new Comentarios(3, "No me convence del todo.", user3);
        Comentarios comentario4 = new Comentarios(4, "Escribiste mal retos, pusiste restos.", user4);

        List<Comentarios> listaComentarios = new ArrayList<>();
        listaComentarios.add(comentario1);
        listaComentarios.add(comentario2);
        listaComentarios.add(comentario3);
        listaComentarios.add(comentario4);

        Ideas idea1 = new Ideas(1, "Titulo ejemplo 1", "Este texto corresponde al ejemplo 1 de una idea.", 0, 0, listaComentarios);
        Ideas idea2 = new Ideas(2, "Titulo ejemplo 1", "Este texto corresponde al ejemplo 2 de una idea.", 1, 3, listaComentarios);
        Ideas idea3 = new Ideas(3, "Titulo ejemplo 3", "Este texto corresponde al ejemplo 3 de una idea.", 5, 1, listaComentarios);

        List<Ideas> listaIdeas = new ArrayList<>();
        listaIdeas.add(idea1);
        listaIdeas.add(idea2);
        listaIdeas.add(idea3);
        return strings -> {
            retosRepository.save(new Retos(1, "Titulo ejemplo en reto 1", "Este texto corresponde al ejemplo 1 de un reto.", "Área deInnovación en minería.", listaIdeas));
        };
    }*/

}
