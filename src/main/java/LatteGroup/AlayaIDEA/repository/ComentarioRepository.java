package LatteGroup.AlayaIDEA.repository;

import LatteGroup.AlayaIDEA.document.Comentario;
import LatteGroup.AlayaIDEA.document.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComentarioRepository extends MongoRepository<Comentario, Integer>
{
    public Comentario findComentarioById(String id);
    public Comentario findComentarioByUsuario(Usuario usuario);
}
