package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Idea;
import LatteGroup.AlayaIDEA.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends MongoRepository<Idea, Integer>
{
    public Idea findIdeaByUsuario(Usuario usuario);
    public Idea findIdeaById(String id);
}
