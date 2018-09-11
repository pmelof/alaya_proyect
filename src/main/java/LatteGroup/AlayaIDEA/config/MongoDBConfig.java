//package LatteGroup.AlayaIDEA.config;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@EnableMongoRepositories(basePackageClasses = UsuarioRepository.class)
//@Configuration
//public class MongoDBConfig
//{
/*
   //@Bean
    CommandLineRunner commandLineRunner(UsuarioRepository usersRepository){
        return  strings -> {
            usersRepository.save(new Usuario(1, "Paty", 0));
            usersRepository.save(new Usuario(2, "Cris", 0));
            usersRepository.save(new Usuario(3, "Mauri", 0));
            usersRepository.save(new Usuario(4, "Persona", 1));
        };
    }

    @Bean
    CommandLineRunner commandLineRunner(IdeasRepository ideasRepository)
    {
        Usuario user1 = new Usuario(1, "Paty", 0);
        Usuario user2 = new Usuario(2, "Fernando", 0);
        Usuario user3 = new Usuario(3, "Cris", 1);
        Usuario user4 = new Usuario(4, "Mauri", 1);

        Comentario comentario1 = new Comentario(1, "Muy buena tu idea, estoy totalmente de acuerdo, te apoyo.", user1);
        Comentario comentario2 = new Comentario(2, "Sería bueno que agregaras el área en que va enfocado.", user2);
        Comentario comentario3 = new Comentario(3, "No me convence del todo.", user3);
        Comentario comentario4 = new Comentario(4, "Escribiste mal retos, pusiste restos.", user4);

        List<Comentario> listaComentarios = new ArrayList<>();
        listaComentarios.add(comentario1);
        listaComentarios.add(comentario2);
        listaComentarios.add(comentario3);
        listaComentarios.add(comentario4);

        return strings -> {
            ideasRepository.save(new Idea(1, "Titulo ejemplo 1", "Este texto corresponde al ejemplo 1 de una idea.", 0, 0, listaComentarios));
        };
    }

  // @Bean
    CommandLineRunner commandLineRunner(RetosRepository retosRepository)
    {
        Usuario user1 = new Usuario(1, "Paty", 0);
        Usuario user2 = new Usuario(2, "Fernando", 0);
        Usuario user3 = new Usuario(3, "Cris", 1);
        Usuario user4 = new Usuario(4, "Mauri", 1);

        Comentario comentario1 = new Comentario(1, "Muy buena tu idea, estoy totalmente de acuerdo, te apoyo.", user1);
        Comentario comentario2 = new Comentario(2, "Sería bueno que agregaras el área en que va enfocado.", user2);
        Comentario comentario3 = new Comentario(3, "No me convence del todo.", user3);
        Comentario comentario4 = new Comentario(4, "Escribiste mal retos, pusiste restos.", user4);

        List<Comentario> listaComentarios = new ArrayList<>();
        listaComentarios.add(comentario1);
        listaComentarios.add(comentario2);
        listaComentarios.add(comentario3);
        listaComentarios.add(comentario4);

        Idea idea1 = new Idea(1, "Titulo ejemplo 1", "Este texto corresponde al ejemplo 1 de una idea.", 0, 0, listaComentarios);
        Idea idea2 = new Idea(2, "Titulo ejemplo 1", "Este texto corresponde al ejemplo 2 de una idea.", 1, 3, listaComentarios);
        Idea idea3 = new Idea(3, "Titulo ejemplo 3", "Este texto corresponde al ejemplo 3 de una idea.", 5, 1, listaComentarios);

        List<Idea> listaIdeas = new ArrayList<>();
        listaIdeas.add(idea1);
        listaIdeas.add(idea2);
        listaIdeas.add(idea3);
        return strings -> {
            retosRepository.save(new Reto(1, "Titulo ejemplo en reto 1", "Este texto corresponde al ejemplo 1 de un reto.", "Área deInnovación en minería.", listaIdeas));
        };
    }
*/
//}
/*
    @Bean
    CommandLineRunner commandLineRunner(ComentariosRepository comentariosRepository)
    {
        Users user1 = new Users(1, "Paty", 0);
        Users user2 = new Users(2, "Fernando", 0);
        Users user3 = new Users(3, "Cris", 1);
        Users user4 = new Users(4, "Mauri", 1);

        return strings -> {
            comentariosRepository.save(new Comentarios(1, "Muy buena tu idea, estoy totalmente de acuerdo, te apoyo.", user1));
            comentariosRepository.save(new Comentarios(2, "Sería bueno que agregaras el área en que va enfocado.", user2));
            comentariosRepository.save(new Comentarios(3, "No me convence del todo.", user3));
            comentariosRepository.save(new Comentarios(4, "Escribiste mal retos, pusiste restos.", user4));        };
    }
}*/
